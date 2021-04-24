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
        this.dice1 = (int)(Math.random() * (7-1) + 1);
        this.dice2 = (int)(Math.random() * (7-1) + 1);
  }

  public  int getDice1(){
      return this.dice1;
  }
  public  int getDice2(){
      return this.dice2;
  }
}
