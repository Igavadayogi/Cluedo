/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluedo;

import java.awt.Color;
import java.awt.GridLayout;
import static javafx.scene.paint.Color.color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class GUI {

    
    
    public void init(){
        JFrame gameFrame = new JFrame();
        gameFrame.setVisible(true);
        gameFrame.setSize(500,500);
    }
    
    
    public void buttonPanel(){
        JPanel panelButtons = new JPanel();
        panelButtons.setBackground(Color.YELLOW);
        panelButtons.setLayout(new GridLayout(4,5));
        
        for(int i = 0; i< 25; i++){
            for(int j = 0; j< 25; j++){
                JButton button = new JButton(i + " " + j);
                panelButtons.add(button);
                space[i][j] = button;
            }
        }
        gameFrame.add(panelButtons);
    }
    
}
