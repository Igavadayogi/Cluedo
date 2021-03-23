package cluedo;

/**
 *
 * @author matth
 */
import java.util.Queue;
import java.util.ArrayList;

public class Cards {
    //public class playerCards {
        String scarlett = "Miss Scarlett";
        String green = "Rev Green";
        String mustard = "Colonel Mustard";
        String plum = "Professor Plum";
        String peacock = "Mrs. Peacock";
        String white  = "Mr. White";
        
         String[] players = new String[] {"Miss Scarlett", "Rev Green", "Colonel Mustard",
        "Professor Plum", "Mrs. Peacock", "Mr. White"};
    //}
   // public class roomCards {
        String kitchen = "Kitchen";
        String ballroom = "Ballroom";
        String conservatory = "Conservatory";
        String dinning = "Dinning Room";
        String billard = "Billard Room";
        String library = "Library";
        String lounge = "Lounge";
        String hall = "Hall";
        String strudy = "Study";
        
  String rooms[] = new String[] {"Kitchen","Ballroom","Conservatory", "Dinning Room","Billard Room",
        "Library","Lounge", "Hall", "Study"};
    //}
    //public class weaponCards {
        String candlestick = "Candlestick";
        String dagger = "Dagger";
        String pipe = "Lead Pipe";
        String revolver = "Revolver";
        String rope = "Rope";
        String wrench = "Wrench";
     
        String weapons[] =  new String[] {"Candlestick", "Dagger", "Lead Pipe", "Revolver", "Rope", "Wrench"};
    //}
    
    //public class envelopeCards {

        //choose 1 randomly from each class, fo a total of 3 cards,
        //put in array/assign numbe then use random number generator to determine
       
        String chosenPlayer = players[(int)(Math.random() * (5-0) + 0)];
        String chosenRoom = rooms[(int)(Math.random() * (8-0) + 0)];
        String chosenWeapon = weapons[(int)(Math.random() * (5-0) + 0)];
    //}
    
     public String getPlayer(){
         return chosenPlayer;
     }
     public String getRoom(){
         return chosenRoom;
     }
     public String getWeapon(){
         return chosenWeapon;
     }
    
}
