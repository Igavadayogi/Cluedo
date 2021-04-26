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
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
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
    JFrame frame;
    JPanel mainPanel;
    private JTextField turn;

    JPanel boardPanel;
    private JButton[][] boardTiles = new JButton[25][25];
    private JPanel rightToolPanel;
    JButton rollButton;
    private JSplitPane splitPane;
    
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
        
        splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        frame.getContentPane().setLayout(new GridLayout());
        frame.getContentPane().add(splitPane);
        splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
        splitPane.setRightComponent(rightToolPanel);           
        splitPane.setLeftComponent(boardPanel); 
        

        
        GridLayout rightPanelLayout = new GridLayout(1, 1, 5, 5);
        rightToolPanel.setLayout(rightPanelLayout);
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

        boardPanel = new JPanel(new GridLayout(0, 25));
        boardPanel.setBorder(new LineBorder(Color.BLACK));
        mainPanel.add(boardPanel);

        Insets margin = new Insets(1, 1, 1, 1);
        for (int i = 0; i < boardTiles.length; i++) {
            for (int j = 0; j < boardTiles[i].length; j++) {
                JButton b = new JButton();
                b.setMargin(margin);
                b.setBackground(Color.yellow);
                boardTiles[j][i] = b;
            }
        }

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
