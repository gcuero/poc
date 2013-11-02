/*
 * COPYRIGHT. KudyTech Talent & Solutions 2012. Todos los derechos reservados.
 * 
 * Este software es sólo para ser utilizado para el propósito para el que ha sido
 * proporcionado. Ninguna parte de este se ha de reproducir, desensamblar, transmitir,
 * almacenar en algún sistema de recuperación, ni ser interpretado por ningún lenguaje
 * humano o de computadora, en cualquier forma o para cualquier otro propósito sin el
 * consentimiento previo por escrito de KudyTech Talent & Solutions.
 */
package org.kudytech.core.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author gcuero
 */
public class CoreApplicationContext {

    public static final String CONTEXT_DEFAULT_FILE_PATH = "model/context/applicationContext.xml";
    private static ApplicationContext ctx =
            new ClassPathXmlApplicationContext(CoreApplicationContext.CONTEXT_DEFAULT_FILE_PATH);

    private CoreApplicationContext() {
    }

    public static CoreApplicationContext getInstance() {
        return ApplicationContextHolder.INSTANCE;
    }

    public ApplicationContext getContext() {
        return CoreApplicationContext.ctx;
    }

    public ApplicationContext getContext(String contextFilePath) {
        CoreApplicationContext.ctx =
                new ClassPathXmlApplicationContext(contextFilePath);
        return CoreApplicationContext.ctx;
    }

    private static class ApplicationContextHolder {

        private static final CoreApplicationContext INSTANCE = new CoreApplicationContext();
    }
}
