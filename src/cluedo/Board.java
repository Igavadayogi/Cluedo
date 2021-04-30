package cluedo;

import java.util.*;
import javax.swing.*;

/*
* This class is used to create the board and tile objects
*/
public class Board extends JComponent{
    
    public int turnCounter;
    Tiles[][] boardArray;
    private final int squareWidth = 30;
    public ArrayList<Tokens> playerToken;
    public Tokens ActiveToken;
    
    private final int rows = 25;
    private final int columns = 24;
    private int[][] BoardGrid;
    private ArrayList<Tokens> tokens;
    
    public Board() {

        this.createBoard();

    }
    
    public void init(){ // Enable this to use this board
        //tokens.add(new ColMustard(10, 10, "M", this));
        //tokens.add(new MrWhite(10, 9, "W", this));
        //tokens.add(new MrsPeacock(10, 8, "P", this));
        //tokens.add(new MsScarlett(11, 10, "S", this));
        //tokens.add(new ProfPlum(11, 9, "P", this));
        //tokens.add(new RevGreen(11, 8, "G", this));
    }

    public Tiles getboardArray(int x, int y) throws Exception {

        if (x < 0 || x > 25 || y < 0 || y > 24) {

            throw new Exception("Player out of bound!!");

        }
        return boardArray[x][y];
    }

    public void createBoard() {

        boardArray = new Tiles[25][24];

        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 24; j++) {
                boardArray[i][j] = new Tiles(i, j, null);

            }
        }
        //boardArray[9][12] = new Tiles(9, 12, new MsScarlett());
        //boardArray[9][13] = new Tiles(9, 13, new RevGreen());
        //boardArray[9][14] = new Tiles(9, 14, new ColMustard());
        //boardArray[13][12] = new Tiles(13, 12, new ProfPlum());
        //boardArray[13][13] = new Tiles(13, 13, new MrsPeacock());
        //boardArray[13][14] = new Tiles(13, 14, new MrWhite());

    }
}
