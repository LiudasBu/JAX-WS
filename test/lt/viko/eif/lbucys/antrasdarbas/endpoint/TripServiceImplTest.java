/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.lbucys.antrasdarbas.endpoint;

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
public class TripServiceImplTest {
    
    public TripServiceImplTest() {
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
     * Test of getTrip method, of class TripServiceImpl.
     */
    @Test
    public void testGetTrip() {
        System.out.println("getTrip");
        int i = 0;
        TripServiceImpl instance = new TripServiceImpl();
        int expResult = 1;
        Trip result = instance.getTrip(i);
        assertEquals(expResult, result.getID());
    }
    
}
