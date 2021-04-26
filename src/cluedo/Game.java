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
 *
 * @author user
 */
public class Game implements ActionListener {

    private Player[] player;

    private Player presentTurn;

    private String namePicked;
    private String roomPicked;
    private String weaponPicked;

    MsScarlett msScarlett;

    Board board;
    Cards cards;
    Tokens token;

    public void init() throws Exception {

        //init player objects
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        Player player5 = new Player();
        Player player6 = new Player();
        
        player1.setName("Miss Scarlett");
        //  player1.setTokens(msScarlett);
        player2.setName("Rev Green");
        player3.setName("Colonel Mustard");
        player4.setName("Professor Plum");
        player5.setName("Mrs. Peacock");
        player6.setName("Mr. White");

//        player[0] = player1;
//        player[1] = player2;
//        player[2] = player3;
//        player[3] = player4;
//        player[4] = player4;
//        player[5] = player6;

        

        //init board object
        board = new Board();
        board.createBoard();
        
        start();

    }

    public void start() throws Exception {

        while (true) {
            System.out.println("Make your move");
            System.out.println("1.Roll Dice");
            System.out.println("2.Suggest");
            System.out.println("3.Accuse");
            System.out.println("4.Move");
            Scanner s = new Scanner(System.in);
            String option = s.nextLine();
            if (null != option) {
                switch (option) {
                    case "1":
                        rollDice();
                        break;
                    case "2":

                        break;
                    case "3":
                        // accuse();
                        break;
                    case "4":
                        System.out.println("Please input new coordinates");
                        Scanner s2 = new Scanner(System.in);
                        int x = s2.nextInt();
                        int y = s2.nextInt();
                        movePlayer(presentTurn, presentTurn.getToken(), x, y);
                        break;
                    default:
                        break;
                }
            }

        }

    }

    public void accuse(Player player) {
        //make accusations
        //player will need to choose the cards either before or at this step
        //show a frame with 3 lists, after choosing, then press enter
        System.out.println("Please input accuse choices in the following order: name, room, weapon");
        System.out.println("Here are the options: ");
        System.out.println("Miss Scarlett, Rev Green, Colonel Mustard, Professor Plum, Mrs. Peacock, Mr. White");
        System.out.println("Candlestick, Dagger, Lead Pipe, Revolver, Rope, Wrench");

        Scanner s1 = new Scanner(System.in);
        namePicked = s1.nextLine();
        roomPicked = s1.nextLine();
        weaponPicked = s1.nextLine();

        checkAccusation(player);

    }

    public void checkAccusation(Player player) {
        //check if the player's accusation matches with the envelope
        //get contents of the envelope and compare
        //if true that player wins

        //get from envelope
        //if accuse cards = envelope card then call win emthod
        //otheriwse game continues
        if (namePicked.equals(cards.getCharacter()) && roomPicked.equals(cards.getRoom()) && weaponPicked.equals(cards.getWeapon())) {
            win();
        } else {
            System.out.println("Incorrect." + player + "has lose.");
        }

    }

    public void win() {
        //display win message, end game
        System.out.println("Congradulations, you have won!");
    }

    //input player name, token, new coords
    public void movePlayer(Player player, Tokens tkn, int newX, int newY) throws Exception {
        //click on board, if exceed diceroll display error message
        //if diagonal display error
        //get the x-y coordinates from player input method

        //get players/tokens current pos in tile board
        int oldX = player.getXCoord();
        int oldY = player.getYCoord();

        //old coord is replaced by empty tile
        //new coord is replaced by player/token occupied tile
        board.boardArray[oldX][oldY] = new Tiles(oldX, oldY, null);
        board.boardArray[newX][newY] = new Tiles(newX, newY, tkn);

        //Tiles newPos = board.boardArray[newX][newY];
    }

    public void checkMove() {
        //check with dice and if diagnal(compare with board coordinates
        //diplay error when player move into room without using the door  
    }

    public void nextTurn() {
        //give control to next player
        //show next player information, store and remove current player information
    }

    public static String rollDice() {
        Dice dice = new Dice();
        String result1 = Integer.toString(dice.getDice1());
        String result2 = Integer.toString(dice.getDice2());
        System.out.println("Dice results: " + result1 + ", " + result2);
        return result1 + result2;
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

//    public void commenceMove(Player player1, Player player2, Player player3, Player player4, Player player5, Player player6) {
//
//        player[0] = player1;
//        player[1] = player2;
//        player[2] = player3;
//        player[3] = player4;
//        player[4] = player5;
//        player[5] = player6;
//
//        board.restoreBoard();
//
//        //temp for test
//        this.presentTurn = player1;
//
//        /*
//        if(user1.isMsScarlett()){
//            this.presentTurn = user1;
//        }
//         */
//    }
    //move by replacing
//    public boolean playerAction(Player player, int beginX, int beginY, int finishX, int finishY) throws Exception{
//        Tiles beginBA = board.getboardArray(beginX, finishY);
//        Tiles finishBA = board.getboardArray(beginY, finishY);
//        Movement move = new Movement(player, beginBA, finishBA);
////        return this.createMove(move, player);
//        
//    }
//    public boolean createMove(Movement move, Player player){
//        Tokens rootTokens = move.getBegin().getTokens();
//        if(rootTokens == null){
//            return false;
//        }
//        
//        if(player != presentTurn){
//            return false;
//        }
//            
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
//        Tokens tokenDest = move.getBegin().getTokens();
//        move.getFinish().setTokens(move.getBegin().getToken());
//        move.getBegin.setTokens();
//        
    /*
        if(tokenDest != null && rootToken instanceof ){
        
        }
     */
//        }
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
