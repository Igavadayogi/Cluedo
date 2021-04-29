
package cluedo;

import java.util.ArrayList;

/**
 *
 * @author matth
 */
public class Board2 {
    private ArrayList<Tokens> tokens;

    public static void main(String[] args) {
    Board2 board = new Board2();
    board.init();
    
}

    public void printBoard(){
        char[][] board = new char[24][25];
        int i;
        int j;
        for(i=0; i<=23; i++){
            for(j=0; j<=24; j++){
                
                board[i][j] = '_';//empty value
            }
        }

        for(i=0; i<=23; i++){
            for(j=0; j<=24; j++){
                
                System.out.print(board[i][j] + "|");
            }
                //System.out.println();
        }   
    }
    
    public void init() { // Enable this to use this board
        tokens.add(new ColMustard(10, 10, "M", this));
        tokens.add(new MrWhite(10, 9, "W", this));
        tokens.add(new MrsPeacock(10, 8, "P", this));
        tokens.add(new MsScarlett(11, 10, "S", this));
        tokens.add(new ProfPlum(11, 9, "P", this));
        tokens.add(new RevGreen(11, 8, "G", this));
    }   
}
