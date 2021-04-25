/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluedo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Scanner;

/**
 *
 * This class handles all the functions of the game
 * @author user
 */
public class Game implements ActionListener {
    
    private Player[] player;
    public Board board;
    private Player presentTurn;

    private void init(){
        
    } 
    


    public void accuse() {
        //make accusations
        //player will need to choose the cards either before or at this step
        //show a frame with 3 lists, after choosing, then press enter
    }

    public void checkAccusation() {
        //check if the player's accusation matches with the envelope
        //get contents of the envelope and compare
        //if true that player wins

        //get from envelope
        //if accuse cards = envelope card then call win emthod
        //otheriwse game continues
    }

    public void win() {
        //display win message, end game
    }

    public void movePlayer() {
        //click on board, if exceed diceroll display error message
        //if diagonal display error

        //get the x-y coordinates from player input method
    }
    
    public void checkMove() {
        //check with dice and if diagnal(compare with board coordinates
        //diplay error when player move into room without using the door  
    }

    public void nextTurn() {
        //give control to next player
        //show next player information, store and remove current player information
    }

    public static void rollDice() {
        //done, just call from Dice class
        //when the button is pressed, this method will be called.
        Dice dice = new Dice();
        System.out.println("Dice result:" + dice.getDice2() + "," + dice.getDice1());
    }

    public void chooseSaveGameOrNot() {
        //shows when exiting the game
    }

    public void saveGame() {
        //write text file, use buffer reader
        //should be a button 
    }

    public void loadGame() {
        //load from text file, use file reader
    }

    public void commenceMove(Player player1, Player player2, Player player3, Player player4, Player player5, Player player6){
        
        
        player[0] = player1;
        player[1] = player2;
        player[2] = player3;
        player[3] = player4;
        player[4] = player5;
        player[5] = player6;
        
        
        board.restoreBoard();
        
        //temp for test
        this.presentTurn = player1;
        
        /*
        if(user1.isMsScarlett()){
            this.presentTurn = user1;
        }
        */
    }
    
    
        //move by replacing
    public boolean playerAction(Player player, int beginX, int beginY, int finishX, int finishY) throws Exception{
        Tiles beginBA = board.getboardArray(beginX, finishY);
        Tiles finishBA = board.getboardArray(beginY, finishY);
        Movement move = new Movement(player, beginBA, finishBA);
        return this.createMove(move, player);
        
    }
    public boolean createMove(Movement move, Player player){
        Tokens rootTokens = move.getBegin().getTokens();
        if(rootTokens == null){
            return false;
        }
        
        if(player != presentTurn){
            return false;
        }
            
        //commented because Ms Scarlett is not defined yet
        /*
        if(rootTokens.isMsScralett() != player.isMsScarlett){
            return false;
        }
        */
            
        //commented because canMove isn't implemented
        //Or it's been implemented but idk 
        //Checking if the the move is valid
        /*
        if(!rootTokens.canMove(board, move.getBegin(), move.getFinish)){
            return false
        }
        */
        
        //moving the player from begin to finish position 
        Tokens tokenDest = move.getBegin().getTokens();
        move.getFinish().setTokens(move.getBegin().getToken());
        move.getBegin.setTokens();
        
        /*
        if(tokenDest != null && rootToken instanceof ){
        
        }
        */
        
        }
        
    
           
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
