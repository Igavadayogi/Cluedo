/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluedo;

/**
 * This class is for the actual pieces on the board, not to be confused with players
 * @author user
 */


//not sure what to put in this class
public abstract class Tokens {
    
    private boolean inRoom = false;
    private int xCoord;
    private int yCoord;
    
    public Tokens(){
        
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
}

