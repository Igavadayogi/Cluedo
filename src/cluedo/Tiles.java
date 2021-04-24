/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluedo;

/**
 * NOT SURE ABOUT THIS ATM Each tile is one block on the board
 *
 * @author user
 */
public class Tiles {

    private Tokens token;
    private int x;
    private int y;

    public Tiles(int x, int y, Tokens token) {
        this.setX(x);
        this.setY(y);
        this.setToken(token);
    }

    public int getX() {
        return this.x;
    }
    
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }
    
     public void setY(int y) {
        this.y = y;
    }

    public Tokens getToken() {
        return this.token;
    }

    public void setToken(Tokens token) {
        this.token = token;
    }

}
