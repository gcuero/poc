/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.core.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author gcuero
 */
public class StringUtils {
    
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat();

    public static String getRandomStringFixLength(int longitud) {
        String cadenaAleatoria = "";
        long ms = new java.util.GregorianCalendar().getTimeInMillis();
        Random r = new Random(ms);
        int i = 0;
        while (i < longitud) {
            char c = (char) r.nextInt(255);
            if ((c >= '0' && c <= 9) || (c >= 'A' && c <= 'Z')) {
                cadenaAleatoria += c;
                i++;
            }
        }
        return cadenaAleatoria;
    }

    public static String getRandomNumberStringFixLength(int longitud) {
        String randomString = "";
//        long ms = new java.util.GregorianCalendar().getTimeInMillis();
        Random r = new Random();
        int i = 0;
        while (i < longitud) {
            randomString = randomString + r.nextInt(9);
            i++;
        }
        return randomString;
    }
    
    public static String getStringDateByPattern(Date date, String datePattern){
        StringUtils.DATE_FORMAT.applyPattern(datePattern);
        return StringUtils.DATE_FORMAT.format(date);
    }
}
