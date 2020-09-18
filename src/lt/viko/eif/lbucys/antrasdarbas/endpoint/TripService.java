/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.lbucys.antrasdarbas.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebService;
import lt.viko.eif.lbucys.antrasdarbas.data.Trip;

/**
 *
 * @author Admin
 */
@WebService
public interface TripService {

    @WebMethod
    Trip getTrip(int i);
}
