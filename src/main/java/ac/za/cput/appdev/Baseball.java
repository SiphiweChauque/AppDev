/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.appdev;

/**
 *
 * @author FARAI SKOOL
 */
public class Baseball {
    private String name;
    private int gamesWon;
    private int gamesLost;
    private int gamesTied;
    
    public Baseball() {}
    public Baseball(String name,int gamesWon,int gamesLost,int gamesTied) {
    
    this.name=name;
    this.gamesWon=gamesWon;
    this.gamesLost=gamesLost;
    this.gamesTied=gamesTied;
    }

    public String getName() {
        return name;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public int getGamesLost() {
        return gamesLost;
    }

    public int getGamesTied() {
        return gamesTied;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }

    public void setGamesLost(int gamesLost) {
        this.gamesLost = gamesLost;
    }

    public void setGamesTied(int gamesTied) {
        this.gamesTied = gamesTied;
    }
    
    public String toString(){
    String str="name---"+this.name+"Game won---"+this.gamesWon+"Games lost---"+this.gamesLost+"Games tied---"+this.gamesTied;
    return str;
    }
    public void displayDetails(){
        System.out.println("Tournament details");
        System.out.println("--------------------");
        System.out.println("Name "+getName());
        System.out.println("Games won "+ getGamesWon());
        System.out.println("Games lost "+getGamesLost());
        System.out.println("Games tied "+ getGamesTied());
         
}
    public int pointForTeam(int points){
    int totalPoints=getGamesWon()*points;
    return totalPoints;
    
    }
}
