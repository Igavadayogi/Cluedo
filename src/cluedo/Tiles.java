/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluedo;

/**
 * NOT SURE ABOUT THIS ATM Each tile is one block on the board
 *
 * @author Sze Yuen Kwok
 */
public class Tiles {

    private Tokens token;
    private int x;
    private int y;

    public Tiles(int x, int y, Tokens token) {
        this.setXPos(x);
        this.setYPos(y);
        this.setToken(token);
    }
    
    
    //may be not needed, incomplete
    public boolean isWall(){
        return false;
    }
    
    //incomplete
    public boolean occupied(Tokens token){
        //if token is already on tile, this tile is not available
        return false;
    }

    public int getXPos() {
        return this.x;
    }
    
    public void setXPos(int x) {
        this.x = x;
    }

    public int getYPos() {
        return this.y;
    }
    
     public void setYPos(int y) {
        this.y = y;
    }

    public Tokens getToken() {
        return this.token;
    }

    public void setToken(Tokens tkn) {
        this.token = tkn;
    }

}
