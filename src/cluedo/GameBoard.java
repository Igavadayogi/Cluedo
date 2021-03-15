/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluedo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

/**
 *
 * @author user
 */
public class GameBoard {
    private final JPanel gui = new JPanel(new BorderLayout(2, 2));
    private JButton[][] chessBoardSquares = new JButton[25][24];
    private JPanel grid;
    
    GameBoard(){
        createBoard();
    }
    
    public final void createBoard(){
        grid = new JPanel(new GridLayout(25,24));
        grid.setBorder(new LineBorder(Color.YELLOW));
        gui.add(grid);
        
        Insets buttonMargin = new Insets(1,1,1,1);
        for(int i = 0; i< 25; i++){
            for(int j = 0; j< 25; j++){
                JButton squares = new JButton();
                squares.setMargin(buttonMargin);
            }
        }
        
    }
}
