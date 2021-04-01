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
 * @author FARAI Malone Chawora 
 * Student Number 220145547
 */
public class TestingAppTest {
    TestingApp instance;
     TestingApp instance2;
      TestingApp instance3;
    
    public TestingAppTest() {
    }
    
   
    
    
    
    @Before
    public void setUp() {
        instance = new TestingApp();
        instance2 = new TestingApp();
        instance3=instance;
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
        // test was successful method is working
        
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
    @Test
    public void testingObjectIdentity(){
    assertSame(instance,instance3);
    //test passed because objects are  identical
    
    }
    
    @Test
    public void testingObjectIdentity2(){
    assertNotSame(instance,instance3);
    //test passed because test was expected to fail that means object really is identical 
    
    }
    @Test
    public void testingObjectIdentity3(){
    assertSame(instance,instance2);
    //test failed  because objects are not identical
    }
    @Test
    public void testingObjectEquality(){
    assertEquals(instance,instance2);
    // test failed meaning instance and instance 2 are not equal
    
 
    }
  }
