/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.appdev;

/**
 *
 * @author Cristina
 */
public class Hockey {

    private String name;
    private int gamewon;
    private int gameLost;
    private int Scores;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGamewon() {
        return gamewon;
    }

    public void setGamewon(int gamewon) {
        this.gamewon = gamewon;
    }

    public int getGameLost() {
        return gameLost;
    }

    public void setGameLost(int gameLost) {
        this.gameLost = gameLost;
    }

    public int getScores() {
        return Scores;
    }

    public void setScores(int Scores) {
        this.Scores = Scores;
    }
    
    
     @Override
    public String toString() 
    {
return "Hockey{" + "name=" + name + ", gamewon=" + gamewon + ", gameLost=" + gameLost + ", Scores=" + Scores + '}';
    }
    
}
