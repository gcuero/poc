/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kudytech.mobile.security.utils;

import org.kudytech.mobile.security.utils.TokenUtils;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gcuero
 */
public class TokenUtilsTest {
    
    public TokenUtilsTest() {
    }

    @Test
    public void testGenerateToken() {
        System.out.println("generateToken");
        String login = "kudytech_pba";
        String expResult = "";
        String result = TokenUtils.generateToken(login);
        System.out.println("Resul :: " + result);
        assertNotNull(result);
//        fail("The test case is a prototype.");
    }
}
