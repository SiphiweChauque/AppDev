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
 * @author Siphiwe Edson Chauque 
 */
public class SoccerTest {
    private Soccer TeamA;
    private Soccer TeamB;
    private Soccer TeamC;
    
    
    public SoccerTest() {
    }
    
    @Before
    public void setObjects() {
        TeamA = new Soccer();
        TeamB = new Soccer();
        TeamC = new Soccer();
        TeamA = TeamC; 
        
    }
    @Test 
    public void SoccerEquality() {
        assertEquals(TeamA, TeamC);
    }
    
    @Test 
    public void SoccerIdentity() {
    assertSame(TeamA, TeamA);
    }
  
    @Test
    public void TeamC() {
       fail();
    }
    
    @Test (timeout = 300)
    public void timeTest() {
        int[] deck = new int[52];
    String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    
    for (int i = 0; i < deck.length; i++) {
      deck[i] = i;
    }

   
    for (int i = 0; i < deck.length; i++) {
      int index = (int)(Math.random() * deck.length);
      int temp = deck[i];
      deck[i] = deck[index];
      deck[index] = temp;
    }
    } 
    
    @Disabled("l do not want to run this line")
    @Test  
    public void testDisable() {
        System.out.println("Disable the method");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}

