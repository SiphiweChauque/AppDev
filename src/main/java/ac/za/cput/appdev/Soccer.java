/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.appdev;

/**
 *
 * @author BLANCO
 */
public class Soccer {
    int lost = 0;
    int won = 3;
    int draw = 1;

    public int getLost() {
        return lost;
    }

    public int getWon() {
        return won;
    }

    public int getDraw() {
        return draw;
    }

    public int getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Soccer{" + "lost=" + lost + ", won=" + won + ", draw=" + draw + ", total=" + total + '}';
    }
    
    
    
    
    int total= lost*won*draw;
    //System.out.println("you got? "+ total);
    
    
}
