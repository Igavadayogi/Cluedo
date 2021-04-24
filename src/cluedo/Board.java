/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluedo;

import javafx.scene.effect.Light.Spot;

/**
 *
 * @author igava
 */
public class Board {
    String[][] boardArray = new String[24][25];
    
    public Board(){
    
        this.resetBoard();
        
    }
    
    public String getboardArray(int x, int y) throws Exception{
        
        if(x<0 || x>25 || y<0 || y>24){
        
            throw new Exception("Player out of bound!!");
        
        }
        return boardArray[x][y];
    }
    
        
    public void resetBoard() {

        //initialize the pieces
        //System.out.println("  0    1    2    3    4    5    6    7    8    9    10   11   12   13   14    15   16   17   18   19   20  21  22  23  24   25");//temp for testing
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 25; j++) {
                boardArray[i][j] = " _ ";
            }
        }

        boardArray[12][9] = " Miss Scarlett ";
        boardArray[13][9] = " Rev Green ";
        boardArray[14][9] = " Colonel Mustard ";
        boardArray[12][13] = " Professor Plum ";
        boardArray[13][13] = " Mrs. Peacock ";
        boardArray[14][13] = " Mr. White ";

        //code below is just an example
        /*
        boxes[0][0] = new Spot(0, 0, new Rook(true));
        boxes[0][1] = new Spot(0, 1, new Knight(true));
        boxes[0][2] = new Spot(0, 2, new Bishop(true));
        //...
        boxes[1][0] = new Spot(1, 0, new Pawn(true));
        boxes[1][1] = new Spot(1, 1, new Pawn(true));
        //...
        */
        
        //initialize the tiles without any piece
        for (int i = 2; i < 6; i++){
            for(int j = 0; j < 8; j++){
                boardArray[i][j] = new Spot(i,j,null);
            }
        }
        
    }
    
}
