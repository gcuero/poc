/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.mobile.security.utils;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.UUID;
import org.apache.commons.codec.digest.DigestUtils;
import org.kudytech.core.AbstractDebug;
import org.kudytech.core.common.utils.StringUtils;

/**
 *
 * @author gcuero
 */
public class TokenUtils extends AbstractDebug{

    private static final String DATE_PATTERN = "yyyy-MM-dd HH:mm:ss";
    private static final String PIPE = "|";

    public static final String generateToken(String login) {
        Date generatedDate = GregorianCalendar.getInstance().getTime();
        StringUtils.getStringDateByPattern(generatedDate, TokenUtils.DATE_PATTERN);
        String uuid = UUID.randomUUID().toString();
        String preToken= login + TokenUtils.PIPE + uuid + TokenUtils.PIPE + generatedDate;
        String token = DigestUtils.sha1Hex(preToken);
        return token;
    }
    
//    public static final void printTokenInfo(String token){
//        LOGGER.info(token);
//        DigestUtils.
//    }
}
