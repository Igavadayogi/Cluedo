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

        boardArray[9][12] = new Tiles(9, 12, new MsScarlett());
        boardArray[9][13] = new Tiles(9, 13, new RevGreen());
        boardArray[9][14] = new Tiles(9, 14, new ColMustard());
        boardArray[13][12] = new Tiles(13, 12, new ProfPlum());
        boardArray[13][13] = new Tiles(13, 13, new MrsPeacock());
        boardArray[13][14] = new Tiles(13, 14, new MrWhite());
    }
}
