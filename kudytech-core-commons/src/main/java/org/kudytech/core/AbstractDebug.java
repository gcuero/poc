/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.core;

import org.apache.log4j.Logger;

/**
 *
 * @author gcuero
 */
public abstract class AbstractDebug {
    
    protected static final Logger LOGGER = Logger.getLogger(AbstractDebug.class);
    
    public void debug(Object message) {
        try {
            AbstractDebug.LOGGER.debug(message);
        } catch (Exception e) {
            //Quiet exception...
        }
    }
    
    public void error(Object message) {
        this.error(message, null);
    }
    
    public void error(Object message, Throwable throwable) {
        try {
            AbstractDebug.LOGGER.error(message, throwable);
        } catch (Exception e) {
            //Quiet exception...
        }
    }
    
    public void error(Throwable throwable) {
        this.error(null, throwable);
    }
    
    public void info(Object message) {
        try {
            AbstractDebug.LOGGER.info(message);
        } catch (Exception e) {
            //Quiet exception...
        }
    }
}
