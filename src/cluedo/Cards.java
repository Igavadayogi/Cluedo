package cluedo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
/**
 *
 * @author matth
 */

public class Cards {
    //public class characterCards {
    ArrayList<String> characterCards = new ArrayList<>(Arrays.asList("Ms Scarlett", "Rev Green", "Colonel Mustard", "Mrs. Peacock", "Mr. White"));
        //String green = "Rev Green";
        //String mustard = "Colonel Mustard";
        //String plum = "Professor Plum";
        //String peacock = "Mrs. Peacock";
        //String white  = "Mr. White";
        
         //ArrayList<String> character = new String[] {"Miss Scarlett", "Rev Green", "Colonel Mustard",
        //"Professor Plum", "Mrs. Peacock", "Mr. White"};
    //}
   // public class roomCards {
    ArrayList<String> roomCards = new ArrayList<>(Arrays.asList("Kitchen", "Ballroom", "Conservatory", "Dinning Room", "Billard Room", "Library", "Lounge", "Hall", "Study"));
        //String kitchen = "Kitchen";
        //String ballroom = "Ballroom";
        //String conservatory = "Conservatory";
        //String dinning = "Dinning Room";
        //String billard = "Billard Room";
        //String library = "Library";
        //String lounge = "Lounge";
        //String hall = "Hall";
        //String study = "Study";
        
  //String rooms[] = new String[] {"Kitchen","Ballroom","Conservatory", "Dinning Room","Billard Room",
        //"Library","Lounge", "Hall", "Study"};
    //}
    //public class weaponCards {
    ArrayList<String> weaponCards = new ArrayList<>(Arrays.asList("Candlestick", "Dagger", "Lead Pipe", "Revolver", "Rope", "Wrench"));
        //String candlestick = "Candlestick";
        //String dagger = "Dagger";
        //String pipe = "Lead Pipe";
        //String revolver = "Revolver";
        //String rope = "Rope";
        //String wrench = "Wrench";
     
        //String weapons[] =  new String[] {"Candlestick", "Dagger", "Lead Pipe", "Revolver", "Rope", "Wrench"};
    //}
    
    //public class envelopeCards {

    //choose 1 randomly from each class, fo a total of 3 cards,
    Random random = new Random();
    final String chosenCharacter = characterCards.get(random.nextInt(characterCards.size()));
    final String chosenRoom = roomCards.get(random.nextInt(roomCards.size()));
    final String chosenWeapon = weaponCards.get(random.nextInt(weaponCards.size()));
    
     public String getCharacter(){
         return chosenCharacter;
     }
     public String getRoom(){
         return chosenRoom;
     }
     public String getWeapon(){
         return chosenWeapon;
     }
    
     public void getStartingCards(){
         
     }
}
