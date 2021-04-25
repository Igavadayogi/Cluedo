/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluedo;

import java.util.Scanner;

/**
 *
 * @author igava
 */
public class Cluedo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Welcome to Cluedo!");
        System.out.println("Press 1 to Start");
        System.out.println("Press 0 to Exit");
        System.out.println("");

        Scanner s = new Scanner(System.in);
        String input = s.nextLine();

        switch (input) {
            case "1":
                Game game = new Game();
                break;
            case "0":
                System.out.println("Goodbye");
                System.exit(0);
                break;
            default:
                System.out.println("Command not recognised");
                break;
        }

    }

}
