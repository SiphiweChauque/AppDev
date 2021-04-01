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
    TestingApp instance;
    
    public TestingAppTest() {
    }
    
   
    
    
    
    @Before
    public void setUp() {
        instance = new TestingApp();
    }
    
   

    /**
     * Test of multiply method, of class TestingApp.
     */
    @Test
    public void multiplyEqualityTest() {
        System.out.println("multiply");
        int num = 25;
        int num2 = 4;
        
        int expResult = 100;
        int result = instance.multiply(num, num2);
        assertEquals(expResult, result);
        // test was successful
        
    }
    @Test
    public void multiplyFailTest() {
        System.out.println("multiply");
        int num = 2;
        int num2 = 4;
        
        int expResult = 100;
        int result = instance.multiply(num, num2);
        assertEquals(expResult, result);
        //test failed because expResult not equal to result
    }
    @Test
    public void multiplyFailTest2() {
        System.out.println("multiply");
        int num = 2;
        int num2 = 4;
        
        int expResult = 8;
        int result = instance.multiply(num, num2);
        assertEquals(expResult, result);
        fail("deliberately made the test fail");
    }
    
}
