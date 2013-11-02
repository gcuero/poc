/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kudytech.confsistema.utils;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import javax.annotation.PostConstruct;
import org.apache.log4j.Logger;
import org.kudytech.confsistema.service.ConfSistemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.stereotype.Service;

/**
 *
 * @author gcuero
 */
//@Service
public class ConfSistemaPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {
    
    private static final Logger LOGGER =
            Logger.getLogger(ConfSistemaPropertyPlaceholderConfigurer.class);
//    @Autowired
    private ConfSistemaService confSistemaService;
//    @Value("${SYSTEM_CATALOG}")
    private String catalog;
    
    public ConfSistemaPropertyPlaceholderConfigurer() {
        super();
//        setPlaceholderPrefix("${");
//        setPlaceholderSuffix(placeholderSuffix);
    }
    
//    @PostConstruct
    @Override
    protected void loadProperties(final Properties props) throws IOException {
        if (null == props) {
            throw new IOException("No hay propiedades aprobadas por el framework Spring - no pueden proceder");
        }
        LOGGER.info("Leeyendo las propiedades de configuración de base de datos");
        try {
            LOGGER.debug("CONF-SISTEMA ================= >>>> " + this.confSistemaService);
            Map<String, String> map = this.confSistemaService.getMapStringByCatalog(this.catalog);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                LOGGER.debug("Cargando =====>>>   " + entry.getKey() + " :: " + entry.getValue());
                props.setProperty(entry.getKey(), entry.getValue());
            }
        } catch (Exception e) {
            LOGGER.fatal("Hay un error en la configuración base de datos.");
            throw new IOException(e);
        }
        if (props.size() == 0) {
            LOGGER.fatal("La base de datos de configuración no pudo ser localizado "
                    + "o no contiene ninguna propiedad en el catalogo '"
                    + this.catalog + "'");
        }
    }
    
    public String getCatalog() {
        return catalog;
    }
    
    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }
    
    public ConfSistemaService getConfSistemaService() {
        return confSistemaService;
    }
    
    public void setConfSistemaService(ConfSistemaService confSistemaService) {
        this.confSistemaService = confSistemaService;
    }
}
