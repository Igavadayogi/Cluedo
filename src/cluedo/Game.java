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
    private Board board;
    private Player presentTurn;

    
//    String[][] boardArray = new String[24][25];
//    private int input1;
//    private int input2;
    
//    Player player1 = new Player("Miss Scarlett");
//    Player player2 = new Player("Rev Green");
//    Player player3 = new Player("Colonel Mustard");
//    Player player4 = new Player("Professor Plum");
//    Player player5 = new Player("Mrs. Peacock");
//    Player player6 = new Player("Mr. White");

//    Game() {
//        createBoard();
//        print();
//        run();
//    }
    private void init(){
        
    } 
    
    

//    public void run() { //this part is temporary
//
//        while (true) {
//            rollDice();
//            playerInput();
//            movePiece();
//            print();
//        }
//    }

    //will move these to the new board class
//    public final void createBoard() {
//        //i is y
//        //j is x
//        System.out.println("  0    1    2    3    4    5    6    7    8    9    10   11   12   13   14    15   16   17   18   19   20  21  22  23  24   25");//temp for testing
//        for (int i = 0; i < 24; i++) {
//            for (int j = 0; j < 25; j++) {
//                boardArray[i][j] = " _ ";
//            }
//        }
//
//        boardArray[12][9] = " A ";
//        boardArray[13][9] = " B ";
//        boardArray[14][9] = " C ";
//        boardArray[12][13] = " D ";
//        boardArray[13][13] = " E ";
//        boardArray[14][13] = " F ";
//
////        for(int i = 0; i<6; i++){
////            for(int j = 0; i<4; j++){
////                boardArray[i][j] = "Study";
////            }
////        }
//    }

//    public final void print() {
//        //temp 
//        for (int i = 0; i < 24; i++) {
//            for (int j = 0; j < 25; j++) {
//                System.out.print(" " + boardArray[i][j] + " ");
//            }
//            System.out.println();
//
//        }
//    }
    
//  something like this to get coordinate of players
//    public void showPlayerLocation(playerNumber){
//        playerNumber.getXCoord(); 
//    }
    
//    public void movePiece() {
//        //temp method
//        int a = input1;
//        int b = input2;
//
//        boardArray[input2][input1] = " A ";
//
//    }

//    public void playerInput() {
//        Scanner s = new Scanner(System.in);
//        input1 = s.nextInt(); //inputs for y-x coordinates 
//        input2 = s.nextInt();
//
//    }

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

    public void commenceMove(Player user1){
        
        //Move the player
        player[1] = user1;
        
        board.restoreBoard();
        
        /*
        if(user1.isMsScarlett()){
            this.presentTurn = user1;
        }
        */
        
        public boolean playerAction(Player player, int beginX, int beginY, int finishX, int finish Y){
        
            Tiles beginBA = board.getboardArray(beginX, finishY);
            Tiles finishBA = board.getboardArray(beginY, finishY);
            
        }
        
        /*
        public boolean makeMove(){
        
        }
        */
    }
           
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
