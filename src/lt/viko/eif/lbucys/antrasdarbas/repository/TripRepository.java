/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.lbucys.antrasdarbas.repository;

import java.util.List;
import lt.viko.eif.lbucys.antrasdarbas.data.Trip;

/**
 * An interface for the repository of trips.
 *
 * @author Admin
 */
public interface TripRepository {

    List<Trip> fetchAllTrips();

}
