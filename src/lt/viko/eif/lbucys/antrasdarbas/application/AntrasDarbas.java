/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.lbucys.antrasdarbas.application;

import java.net.MalformedURLException;
import javax.xml.ws.Endpoint;
import lt.viko.eif.lbucys.antrasdarbas.endpoint.TripServiceImpl;

/**
 * This class holds the function for publishing a webservice based on the 
 * TripServiceImpl service.
 * 
 * @author Admin
 */
public class AntrasDarbas {

    /**
     * This function publishes a webservice based in the TrimServiceImpl service
     * 
     * @param args the command line arguments
     * @throws java.net.MalformedURLException
     */
    public static void main(String[] args) throws MalformedURLException {
        Endpoint.publish("http://localhost:5051/TripService/Trips",
                new TripServiceImpl());

    }

}
