/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluedo;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
 * GUI class to display GUI
 *
 * @author Sze Yuen Kwok
 */
public class GUI implements ActionListener {

    private JButton[][] boardTiles = new JButton[25][25];
    private JFrame frame;
    private JPanel mainPanel;
    private JTextField turn;
    private JPanel boardPanel;
    private JPanel rightToolPanel;
    private JButton rollButton;
    private JSplitPane splitPane;
    private JButton suggestButton;
    private JButton accuseButton;
    private JButton showCardButton;
    Board board;
    Game game;

    public void start() {

        game = new Game();

        GUI g = new GUI();
        g.run();
    }

    public void run() {
        frame = new JFrame("Cluedo");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(true);
        mainPanel = new JPanel();
        createGUI();
        frame.add(mainPanel);
        frame.pack();
        frame.setVisible(true);

    }

    /*
    * method to create the GUI
    */
    public void createGUI() {

        rightToolPanel = new JPanel();
        boardPanel = new JPanel();

        splitPane = new JSplitPane();

        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        //this needs fixing, it should split to left and right, but everything is on right
//        frame.getContentPane().setLayout(new GridLayout());
//        frame.getContentPane().add(splitPane);
//        splitPane.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
//        splitPane.setRightComponent(rightToolPanel);
//        splitPane.setLeftComponent(boardPanel);
        GridLayout rightPanelLayout = new GridLayout(0, 1, 5, 5);
        rightToolPanel.setLayout(rightPanelLayout);
        rightToolPanel.add(new JLabel("Cuurent player is: "));//get token name
        rightToolPanel.add(rollButton = new JButton("Roll Dice"));
        rightToolPanel.add(suggestButton = new JButton("Suggest"));
        rightToolPanel.add(accuseButton = new JButton("Accuse"));
        rightToolPanel.add(showCardButton = new JButton("Show Cards"));

        rollButton.addActionListener((ActionEvent ae) -> {
            String result = "Dice result: " + Game.rollDice();
            JOptionPane.showMessageDialog(frame, result);
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        });

        suggestButton.addActionListener((ActionEvent ae1) -> {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        });
        accuseButton.addActionListener((ActionEvent ae2) -> {
            game.accuse();
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        });

        showCardButton.addActionListener((ActionEvent ae3) -> {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        });

        mainPanel.add(rightToolPanel);

        GridLayout leftPanelLayout = new GridLayout(25, 24, 1, 1);

        boardPanel.setLayout(leftPanelLayout);
        boardPanel.setBorder(new LineBorder(Color.BLACK));

        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 24; j++) {

//                boardTiles[i][j] =  board.boardArray[i][j]; //need to link to the actual Tile objects
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

}
