/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.appdev;
import java.util.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.jupiter.api.Disabled;


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
    @Ignore
    @Test
    public void testingObjectEquality2(){
    assertEquals(instance,instance3);
    // test is ignored  
    
    }
   @Test(timeout=10)
  public void timeoutTest(){
      int [] array=new int[5];
     array[0]=6;
      array[1]=6;
      array[2]=6;
      array[3]=6;
      for(int i =0;i<array.length;i++){
       System.out.println(array+"the are the contents of the array");
       
       //test fail because of timeout limitation
  }
  }
     @Disabled
    @Test
    public void testDiabled(){
         System.out.println("the test is Diabled");
         //the test is diaablled
    }
    @Test(timeout=1000)
    public void timeOutTest2(){
    while (true);
    //test made to stop because of timeout restriction
    }
    
  }
