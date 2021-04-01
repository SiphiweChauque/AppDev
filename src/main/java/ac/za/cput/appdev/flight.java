/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.appdev;

/**
 *
 * @author User
 */
public class flight {
    
    public   String flightName;
    private int flightdelayed;
    private int flightdepartured;
    private int flightcancelled;

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

   

    public int getFlightdelayed() {
        return flightdelayed;
    }

    public void setFlightdelayed(int flightdelayed) {
        this.flightdelayed = flightdelayed;
    }

    public int getFlightdepartured() {
        return flightdepartured;
    }

    public void setFlightdepartured(int flightdepartured) {
        this.flightdepartured = flightdepartured;
    }

    public int getFlightcancelled() {
        return flightcancelled;
    }

    public void setFlightcancelled(int flightcancelled) {
        this.flightcancelled = flightcancelled;
    }

    @Override
    public String toString() {
        return "Shuttle{" + "flightName=" + flightName + ", flightdelayed=" + flightdelayed + ", flightdepartured=" + flightdepartured + ", flightcancelled=" + flightcancelled + '}';
    }

   
    
}

    

