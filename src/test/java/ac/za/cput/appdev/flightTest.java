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
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author Ngonidzaishe Erica Chipato
 * 218327315
 */
public class flightTest {
    
    
    
    private flight  flight1;
    private flight  flight2;
    private flight  flight3;
    
    
  public flightTest(){
  
  }
    
    @Before
    public void setUp() {
        flight1= new flight ();
        flight2= new flight ();
        flight3= new flight ();
        flight1= flight2;
        
    }
    
    
    //Testing for object identity
    @Test 
    public void flightIdentity(){
    assertSame(flight1,flight1);
    }
    
    // object equality test
    @Test 
    public void flightEquality(){
    assertSame(flight2,flight1);
    }
    
    
    //Test meant to fail 
    @Test 
   public void flightFail(){
       assertSame(flight3,flight1);
       fail("This is a failed test ");
  }
    
    
  
    // can't run more than 5 seconds or else it fails
    @Test(timeout = 5000)
    public void testSlowMethod() {
       while(true); 
    }
    
    
    
    @Disabled("Disabled due to flight delay.")
    @Test  
    public void testDisable() {
        System.out.println("Disable the method");
    }
    
    
}
//End of Test