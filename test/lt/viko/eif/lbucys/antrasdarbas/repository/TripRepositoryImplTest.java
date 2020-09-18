/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.lbucys.antrasdarbas.repository;

import java.util.List;
import lt.viko.eif.lbucys.antrasdarbas.data.Trip;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class TripRepositoryImplTest {
    
    public TripRepositoryImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of fetchAllTrips method, of class TripRepositoryImpl.
     */
    @Test
    public void testFetchAllTrips() {
        System.out.println("fetchAllTrips");
        TripRepositoryImpl instance = new TripRepositoryImpl();
        int expResult = 1;
        List<Trip> result = instance.fetchAllTrips();
        assertEquals(expResult, result.get(0).getID());
    }
    
}
