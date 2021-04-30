/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluedo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

/**
 *
 * This class handles all the functions of the game
 *
 * @author Sze Yuen Kwok/igava/matt
 */
public class Game implements ActionListener {

    private Player[] playerArr;

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
//        board = new Board();
//        board.createBoard();
        start();

    }

    /**
     * This method prints the text based menu
     *
     * @throws java.lang.Exception
     */
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
                        movePlayer(presentTurn.getToken(), x, y);
                        break;
                    default:
                        break;
                }
            }

        }

    }

    /**
     * Suggest method, gets input from user
     *
     * half-functional at the moment
     *
     */
    public void suggest() {
        System.out.println("Please input suggest choices in the following order: name, room, weapon");
        System.out.println("Here are the options: ");
        System.out.println("Miss Scarlett, Rev Green, Colonel Mustard, Professor Plum, Mrs. Peacock, Mr. White");
        System.out.println("Candlestick, Dagger, Lead Pipe, Revolver, Rope, Wrench");

        Scanner s2 = new Scanner(System.in);
        namePicked = s2.nextLine();
        roomPicked = s2.nextLine();
        weaponPicked = s2.nextLine();

        System.out.println("Suggested: " + namePicked + ", " + roomPicked + ", " + weaponPicked);
    }

    /**
     * method to accuse, get input from user then calls the checkAccusation
     * method to compare
     *
     * method parameter should be get token
     */
    public void accuse() {
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

        checkAccusation(namePicked, roomPicked, weaponPicked);

    }

    /**
     * method to compare user's input with the contents of the envelope if
     * correct, call win method, if not game continues
     *
     * @param name
     * @param room
     * @param weapon
     */
    public void checkAccusation(String name, String room, String weapon) {
        if (name.equals(cards.getCharacter()) && room.equals(cards.getRoom()) && weapon.equals(cards.getWeapon())) {
            win();
        } else {
            System.out.println("Incorrect. You lose!");
        }

    }

    /*
    * win method, prints win statement
     */
    public void win() {
        //display win message, end game
        System.out.println("Congradulations, you have won!");
    }

    /**
     * non-functional at the moment
     *
     * method to move player
     *
     * supposed to get player input of new coordinates get players token, then
     * get old coordinate of token replace old token position with empty tile
     * replace new tiles position with token symbol
     *
     * @param tkn
     * @param newX
     * @param newY
     * @throws Exception
     */
    public void movePlayer(Tokens tkn, int newX, int newY) throws Exception {
        //click on board, if exceed diceroll display error message
        //if diagonal display error
        //get the x-y coordinates from player input method
        int oldX = tkn.getXCoord();
        int oldY = tkn.getYCoord();

        board.boardArray[oldX][oldY] = new Tiles(oldX, oldY, null);
        board.boardArray[newX][newY] = new Tiles(newX, newY, tkn);

        //Tiles newPos = board.boardArray[newX][newY];
    }

    /*
    * method to check player move, could be done it tokens
    * non-functional at the moment
     */
    public void checkMove() {
        //check with dice and if diagnal(compare with board coordinates)
        //diplay error when player move into room without using the door  
    }

    /*
    * method to move to next turn(next player)
    * non-functional at the moment
     */
    public void nextTurn() {
        //give control to next player
        //show next player information, store and remove current player information
    }

    /**
     * COMPLETED
     * method to roll dice, returns the total of dice 1 and dice 2 
     * @return 
     */
    public static String rollDice() {
        Dice dice = new Dice();
        String result1 = Integer.toString(dice.getDice1());
        String result2 = Integer.toString(dice.getDice2());
        String result = Integer.toString(dice.getDice1() + dice.getDice2());
        System.out.println("Dice results: " + result1 + ", " + result2);
        return result;
    }

    /*
    * method to choose to save game or not
    * not planned, non-functional
    */
    public void chooseSaveGameOrNot() {
        //shows when exiting the game
    }

        /*
    * method to save game
    * not planned, non-functional
    */
    public void saveGame() {
        //write text file, use buffer reader
        //should be a button 
    }

     /*
    * method to load previous game
    * not planned, non-functional
    * could use read/write
    */
    public void loadGame() {
        //load from text file, use file reader
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
