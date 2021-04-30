/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluedo;

/**
 * Tile object
 * @author Sze Yuen Kwok
 */
public class Tiles {

    private Tokens token;
    private int x;
    private int y;

    public Tiles(int x, int y, Tokens token) {
        this.x = x;
        this.y = y;
        this.token = token;
    }

    
    //incomplete
    public boolean occupied(Tokens token) {
        //if token is already on tile, this tile is not available
        //default is false;
        return false;
    }

    public int getXPos() {
        return this.x;
    }

    public int getYPos() {
        return this.y;
    }

    public Tokens getToken() {
        return this.token;
    }

}
