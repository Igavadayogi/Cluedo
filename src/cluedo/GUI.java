/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluedo;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;

/**
 *
 * @author Sze Yuen Kwok
 */
public class GUI implements ActionListener {

    Game game;

    private JButton[][] boardTiles = new JButton[25][25];
    private JFrame frame;
    private JPanel mainPanel;
    private JTextField turn;
    private JPanel boardPanel;
    private JPanel rightToolPanel;
    private JButton rollButton;
    private JSplitPane splitPane;
    
    Board board;
    

//    public GUI() {
//        
//        newGame = new Game();
//        
//        createGUI();
////        SwingUtilities.invokeLater((Runnable) g);
//    }
    public void start() {

        game = new Game();

        GUI g = new GUI();
        g.run();
    }

    public void run() {
        frame = new JFrame("Cluedo");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(true);
        //Container pane = frame.getContentPane();
        mainPanel = new JPanel();

        createGUI();
        frame.add(mainPanel);
        frame.pack();
        frame.setVisible(true);

    }

    public void createGUI() {

        rightToolPanel = new JPanel();
        boardPanel = new JPanel();

        splitPane = new JSplitPane();

        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        //this needs fixing, it will split to left and right, but everything is on right
//        frame.getContentPane().setLayout(new GridLayout());
//        frame.getContentPane().add(splitPane);
//        splitPane.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
//        splitPane.setRightComponent(rightToolPanel);
//        splitPane.setLeftComponent(boardPanel);
        GridLayout rightPanelLayout = new GridLayout(0, 1, 5, 5);
        rightToolPanel.setLayout(rightPanelLayout);
        rightToolPanel.add(new JLabel("Cuurent player is: "));//get token name
        rightToolPanel.add(rollButton = new JButton("Roll Dice"));
        rightToolPanel.add(new JButton("Suggest"));
        rightToolPanel.add(new JButton("Accuse"));
        rightToolPanel.add(new JButton("Show Cards"));

        rollButton.addActionListener((ActionEvent ae) -> {
            String result = "Dice result: " + Game.rollDice();
            JOptionPane.showMessageDialog(frame, result);
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        });

        mainPanel.add(rightToolPanel);

        GridLayout leftPanelLayout = new GridLayout(25, 24, 1, 1);

        boardPanel.setLayout(leftPanelLayout);
        boardPanel.setBorder(new LineBorder(Color.BLACK));

        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 24; j++) {

//                boardTiles[i][j] =  board.boardArray[i][j];
                boardTiles[i][j] = new JButton("-");
                boardPanel.add(boardTiles[i][j]);

            }
        }

        mainPanel.add(boardPanel);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void drawGameBoard(){
        
    }
}
