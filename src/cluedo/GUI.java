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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.layout.Border;
import static javafx.scene.paint.Color.color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

/**
 *
 * @author user
 */
public class GUI implements ActionListener {

    Game game;
    JFrame frame;
    JPanel panel;
    private JTextField turn;
    private JTextField rollResult;
    private String result;

    JPanel board;
    private JButton[][] boardTiles = new JButton[25][24];

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
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

    }

    public void createGUI() {

        JToolBar tool = new JToolBar();
        tool.setFloatable(false);
//        tools extra column for labels frame = new JFrame();
        panel.add(tool);
        JButton rollButton;
        tool.add(rollButton = new JButton("Roll Dice"));
        tool.addSeparator();
        tool.add(new JTextField("    " + result + "    "));
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

        rollButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                result = game.rollDice();
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

//    public void createGameInterface(){
//        JMenuBar m = new JMenuBar();
//        frame.setJMenuBar(m);
//        JMenu options = new JMenu("Options");
//        JMenuItem aboutItem = new JMenuItem("Roll Dice");
//        JMenuItem aboutItem = new JMenuItem("Suggest");
//        JMenuItem aboutItem = new JMenuItem("Accuse");
//        JMenuItem aboutItem = new JMenuItem("Quit");
//    }
//    private final JPanel gui = new JPanel(new BorderLayout(2, 2));
//    private JButton[][] boardTiles = new JButton[25][24];
//    private JPanel board;

