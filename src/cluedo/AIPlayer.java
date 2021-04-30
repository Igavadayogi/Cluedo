/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluedo;

import java.util.ArrayList;

/**
 * subclass of player class
 *
 * @author user
 */
public class AIPlayer extends Player {

    public AIPlayer(String name) {
        this.humanPlayer = false;
        this.action = new ArrayList<>();
        action chooseAction = action.get((int) (Math.random() * ((3 - 1) + 1)) + 1);//use RNG to pick one action
    }

    /**
     * Representing a set of action.
     */
    private final ArrayList<action> action;

    //an array filled with actions
    //e.g.: [move,move,move,accuse,move,move,move]
    private static class action {

        public action() {
            String[] action = {"Move", "Accuse", "Roll Dice"};
        }
    }

}
