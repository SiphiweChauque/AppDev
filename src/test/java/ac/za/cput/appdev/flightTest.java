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
 * @author User
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
    
    
    
    @Test 
    public void flightIdentity(){
    assertSame(flight1,flight1);
    }
    
    @Test 
    public void flightEquality(){
    assertSame(flight2,flight1);
    }

    @Test 
   public void flight(){
       fail("This is a failed test ");
  }
    
    
  
    // can't run more than 5 seconds or else it fails
    @Test(timeout = 5000)
    public void testSlowMethod() {
        
    }
    
    
   
    @Disabled("Disabled due to flight delay.")
    @Test  
    public void testDisable() {
        System.out.println("Disable the method");
    }
    
    
}
