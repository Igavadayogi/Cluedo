/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluedo;

/**
 *
 * Class to track movement of the player
 * @author Sze Yuen Kwok
 */
public class Movement {
    private Player player;
    private Tiles startPos;
    private Tiles endPos;
    private Tokens moved;
    
    
    public Movement(Player player, Tiles startPos, Tiles endPos){
        this.player = player;
        this.startPos = startPos;
        this.endPos = endPos;
        this.moved = startPos.getToken();
    }
    
    
}
