/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluedo;

/**
 *  player objects
 * @author user
 */
public abstract class Player {
    public boolean humanPlayer;
    public String name;
    private int xCoord;
    private int yCoord;
    
    public String getName(){
        return name;
    }
    
    public void setName(){
        this.name = name;
    }
    
    public int getXCoord(){
        return xCoord;
    }
    
    public int getYCoord(){
        return yCoord;
    }
}
