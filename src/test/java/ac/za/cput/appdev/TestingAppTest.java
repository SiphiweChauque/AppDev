/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.appdev;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author FARAI SKOOL
 */
public class TestingAppTest {
    
    public TestingAppTest() {
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
     * Test of multiply method, of class TestingApp.
     */
    @Test
    public void multiplyEqualityTest() {
        System.out.println("multiply");
        int num = 25;
        int num2 = 4;
        TestingApp instance = new TestingApp();
        int expResult = 100;
        int result = instance.multiply(num, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void multiplyFailTest() {
        System.out.println("multiply");
        int num = 2;
        int num2 = 4;
        TestingApp instance = new TestingApp();
        int expResult = 100;
        int result = instance.multiply(num, num2);
        assertEquals(expResult, result);
        
    }
    @Test
    public void multiplyFailTest2() {
        System.out.println("multiply");
        int num = 2;
        int num2 = 4;
        TestingApp instance = new TestingApp();
        int expResult = 8;
        int result = instance.multiply(num, num2);
        assertEquals(expResult, result);
        fail("deliberately made the test fail");
    }
    
}
