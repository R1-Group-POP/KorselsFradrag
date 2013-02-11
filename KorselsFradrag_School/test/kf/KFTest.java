/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kf;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Patrick
 */
public class KFTest {
    
    public KFTest() {
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
     * Test of calculate method, of class KF.
     */
    @Test
    public void testCalculate() {
        System.out.println("calculate");
        int kilometer = 10;
        double expResult = 0.0;
        double result = KF.calculate(kilometer);
        assertEquals(expResult, result, 0.0);
        
        kilometer = 25;
        expResult = 2.10;
        result = KF.calculate(kilometer);
        assertEquals(expResult, result, 0.0);
        
        kilometer = 150;
        expResult = 132.3;
        result = KF.calculate(kilometer);
        assertEquals(expResult, result, 0.0);
    }
}
