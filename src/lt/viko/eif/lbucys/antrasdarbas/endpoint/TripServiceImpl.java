/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.lbucys.antrasdarbas.endpoint;

import java.util.List;
import javax.jws.WebService;
import lt.viko.eif.lbucys.antrasdarbas.data.Trip;
import lt.viko.eif.lbucys.antrasdarbas.repository.TripRepository;
import lt.viko.eif.lbucys.antrasdarbas.repository.TripRepositoryImpl;

/**
 * This is an implementation of the interface TripService containing the 
 * method to return a particular trip by it's index accessed from some 
 * implementation
 * 
 * @author Admin
 */
@WebService(endpointInterface
        = "lt.viko.eif.lbucys.antrasdarbas.endpoint.TripService")
public class TripServiceImpl implements TripService {

    TripRepository repo;
    List<Trip> trips;
    
    /**
     * This function loads a list of trips from a particular implementation
     */
    public void loadTrips() {
        repo = new TripRepositoryImpl();
        trips = repo.fetchAllTrips();
    }
    
    /**
     * This function loads the list of Trips and returns a particular one by 
     * it's index
     * 
     * @param i      The index of the Trip element to be returned
     * @return       The trip element that was selected, if it is out of bounds
     *               and exception is thrown
     * @throws IndexOutOfBoundsException 
     */
    @Override
    public Trip getTrip(int i) throws IndexOutOfBoundsException {
        loadTrips();
        return trips.get(i);
    }
}
