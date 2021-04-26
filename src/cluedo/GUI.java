/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluedo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.layout.Border;
import static javafx.scene.paint.Color.color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;

/**
 *
 * @author user
 */
public class GUI implements ActionListener {

    Game game;
    JFrame frame;
    JPanel panel;
    private JTextField turn;


    JPanel board;
    private JButton[][] boardTiles = new JButton[25][25];

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
        Container pane = frame.getContentPane();
        panel = new JPanel();
//        createGameInterface();
        createGUI();
//        guiTest();
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

    }
    
//    public void guiTest(){
//        GridLayout layout = new GridLayout(3,2,5,5);
////        panel.setLayout(layout);
////        panel.add(new JButton("Roll Dice"));
////        panel.add(new JButton("Suggest"));
////        panel.add(new JButton("Accuse"));
////        panel.add(new JButton("Show Cards"));
//        
//        panel.setLayout(new GridLayout(6, 6));
//        JButton[][] buttons = new JButton[5][5];
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                buttons[i][j] = new JButton("_");
//                panel.add(buttons[i][j], 5 * i + j);
//            }
//        }
//        
//
//    }
    
    

    public void createGUI() {

        JToolBar tool = new JToolBar();
        tool.setFloatable(false);
//        tools extra column for labels frame = new JFrame();
        panel.add(tool);
        JButton rollButton;
        tool.add(rollButton = new JButton("Roll Dice"));
        tool.addSeparator();
        tool.add(new JButton("Suggest"));
        tool.addSeparator();
        tool.add(new JButton("Accuse"));
        tool.addSeparator();
        tool.add(new JButton("Show Cards"));
        tool.addSeparator();
        tool.add(new JLabel("Current turn: "));
        tool.addSeparator();
        tool.add(turn = new JTextField("       "));

        rollButton.addActionListener((ActionEvent ae) -> {
            String result = "Dice result: " + Game.rollDice();
            JOptionPane.showMessageDialog(frame, result);
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        });

        board = new JPanel(new GridLayout(0, 25));
        board.setBorder(new LineBorder(Color.BLACK));
        panel.add(board);

        Insets margin = new Insets(1, 1, 1, 1);
        for (int i = 0; i < boardTiles.length; i++) {
            for (int j = 0; j < boardTiles[i].length; j++) {
                JButton b = new JButton();
                b.setMargin(margin);
                b.setBackground(Color.yellow);
                boardTiles[j][i] = b;
            }
        }

//        for(int i = 0; i<25;i++){
//            board.add(new Jlabel)
//        }
        
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

    




