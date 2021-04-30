/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluedo;

/**
 * This class is for the actual pieces on the board, not to be confused with players
 * @author matt
 */

public abstract class Tokens {
    
    private boolean inRoom = false;
    private int xCoord;
    private int yCoord;
    final private String symbol;
    public Board2 board;    //to switch to text base, change class Board2 to Board
    
    /**
     *
     * @param x
     * @param y
     * @param symbol
     * @param board
     */
    public Tokens(int x, int y, String symbol, Board2 board){   //to switch to text base, change class Board2 to Board
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.symbol = symbol;
        this.board = board;
    }
    
    public boolean inRoomOrNot(){
        return this.inRoom;
    }
    
    public void setInRoomOrNot(boolean inRoom){
        this.inRoom = inRoom;
    }
    
    public int getXCoord() {
        return this.xCoord;
    }

    public int getYCoord() {
        return this.yCoord;
    }
    
    public void setXCoord(int x){
        this.xCoord = xCoord;
    }
    
    public void setYCoord(int y){
        this.yCoord = yCoord;
    }
}

