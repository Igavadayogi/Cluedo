/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluedo;

/**
 *
 * @author igava
 */
public class Board {

    Tiles[][] boardArray;

    public Board() {

        this.createBoard();

    }

    public Tiles getboardArray(int x, int y) throws Exception {

        //this part may not need to look less suspicious
        if (x < 0 || x > 25 || y < 0 || y > 24) {

            throw new Exception("Player out of bound!!");

        } 
        return boardArray[x][y];
    }

    public void createBoard() {

        //commented out for now because abstract classes for the tokens are not completed
//        boardArray[9][12] =  new Tiles(9, 12, new MsScarlett());
//        boardArray[9][13] = new Tiles(9, 13, new RevGreen())
//        boardArray[9][14] = new Tiles(9, 14, new ColMustard())
//        boardArray[13][12] = new Tiles(13, 12, new ProfPlum())
//        boardArray[13][13] = new Tiles(13, 13, new MrsPeacock())
//        boardArray[13][14] = new Tiles(13, 14, new MrWhite())

        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                boardArray[i][j] = new Tiles(i, j, null);
            }
        }
    }

}
