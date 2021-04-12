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
public class Player {
    private String name;
    private int xCoord;
    private int yCoord;
    
    Player(String name){
        this.name = name;
    }
    
    String getName(){
        return name;
    }
    
    int getXCoord(){
        return xCoord;
    }
    
    int getYCoord(){
        return yCoord;
    }
}

