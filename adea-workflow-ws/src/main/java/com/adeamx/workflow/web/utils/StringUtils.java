/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adeamx.workflow.web.utils;

/**
 *
 * @author gcuero
 */
public class StringUtils {

    public static boolean isEmpty(String text) {
        return (null == text) || text.trim().length() == 0;
    }
}
