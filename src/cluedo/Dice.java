/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluedo;
/**
 * class for dice
 * @author Sze Yuen Kwok
 */

public class Dice { 
int dice1;
int dice2;
  
  public Dice(){
        dice1 = (int)(Math.random() * (7-1) + 1);
        dice2 = (int)(Math.random() * (7-1) + 1);
  }

  public  int getDice1(){
      return dice1;
  }
  public  int getDice2(){
      return dice2;
  }
}
