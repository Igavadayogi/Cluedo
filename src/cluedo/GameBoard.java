/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluedo;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class GameBoard extends javax.swing.JPanel {
    private final JPanel[][] boardGrid = new JPanel[25][24];
    /**
     * Creates new form GameBoard
     */
    public GameBoard() {
        initComponents();
        
//        for(int row = 0; row < 25; row++) {
//            for(int col = 0; col < 24; col++){
//                //JPanel newBoard = new JPanel();
//                boardGrid[row][col] = new JPanel();
//            }
//        }
          JPanel gameBoard = new JPanel(new GridLayout(25,24));
          for(int i = 0; i < 600; i++){
              JPanel panel = new JPanel();
              gameBoard.add(panel);
          }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
