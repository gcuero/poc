/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adeamx.workflow.domain.rest;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author Erika
 */
public class TestRequestJson {

    public static void main(String[] args) {
        PagoProgramadoFilterRequest ppfr = new PagoProgramadoFilterRequest();
        ppfr.setFechaFinPago(GregorianCalendar.getInstance().getTime());
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.add(GregorianCalendar.MONTH, -8);
        ppfr.setFechaInicioPago(calendar.getTime());
        ppfr.setIdCentroCosto(1L);
        ppfr.setIdOrdenCompra(1L);
        ppfr.setLogin("kudy_movil1");
       
        ObjectMapper mapper = new ObjectMapper();

        GraphConfRequest gcr = new GraphConfRequest();
        gcr.setLogin("kudy_movil1");
        gcr.setChartName("GRAPH_BY_MONTHLY_OC");
        gcr.setFechaInicio(calendar.getTime());
        gcr.setFechaFin(GregorianCalendar.getInstance().getTime());
        try {

            // convert user object to json string, and save to a file
            mapper.writeValue(System.out, gcr);
            System.out.println("");

            // display to console
//		System.out.println(mapper.writeValueAsString(ppfr));

        } catch (JsonGenerationException e) {

            e.printStackTrace();

        } catch (JsonMappingException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }
    }
}
