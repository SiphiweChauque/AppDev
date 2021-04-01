/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.appdev;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author Cristina
 */
public class HockeyTest {
    
    private Hockey Team1;
    private Hockey Team2;
    private Hockey Team3;
    private Hockey Team4;
    
    
    public HockeyTest() {
    }
    
    @Before
    public void setObject()
    {
        Team1 = new Hockey();
        Team2 = new Hockey();
        Team3 = new Hockey();
        Team4 = new Hockey();
        Team2 = Team4;
        
    }
    
    @Test
    public void HockeyEquality()
    {
      assertEquals(Team2,Team4);
      
    }

    @Test
    public void HockeyIdentity()
    {
        assertSame(Team2,Team2);
        
    }

    @Test
    public void Hockey()
    {
       fail("This Will Fail.");
               
    }

    
    @Test (timeout = 100)
    public void TimeTesting()
    {
       while (true);
    }

    
    @Disabled("Do not run this method")
    @Test  
    public void testDisable() {
        System.out.println("Disable the method");
    }

    

   
}
