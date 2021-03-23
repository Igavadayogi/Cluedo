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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

/**
 *
 * @author user
 */
public class GameBoard implements ActionListener{
    
    String [][] boardArray = new String [25][24];
   
    
    GameBoard(){
        createBoard();
    }
    
    public final void createBoard(){
      
        for(int i = 0; i< 25; i++){
            for(int j = 0; j< 25; j++){
                boardArray[i][j] = "_";
            }
        }
//        to print board
//        for (int i = 0; i < grid.length; i++) {
//			System.out.print(i);
//			for (int j = 0; j < grid.length; j++) {
//				System.out.print(" " + grid[i][j] + " ");
//			}
//			System.out.println();
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
