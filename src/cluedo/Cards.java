package cluedo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * class to store cards
 *
 * @author matt
 */

public class Cards {

    ArrayList<String> characterCards = new ArrayList<>(Arrays.asList("Ms Scarlett", "Rev Green", "Colonel Mustard", "Mrs. Peacock", "Mr. White", "Professor Plum"));

    ArrayList<String> roomCards = new ArrayList<>(Arrays.asList("Kitchen", "Ballroom", "Conservatory", "Dinning Room", "Billard Room", "Library", "Lounge", "Hall", "Study"));

    ArrayList<String> weaponCards = new ArrayList<>(Arrays.asList("Candlestick", "Dagger", "Lead Pipe", "Revolver", "Rope", "Wrench"));

    //this part functions as the envelope
    //choose 1 randomly from each array, fo a total of 3 cards,
    Random random = new Random();
    final String chosenCharacter = characterCards.get(random.nextInt(characterCards.size()));
    final String chosenRoom = roomCards.get(random.nextInt(roomCards.size()));
    final String chosenWeapon = weaponCards.get(random.nextInt(weaponCards.size()));

    public String getCharacter() {
        return chosenCharacter;
    }

    public String getRoom() {
        return chosenRoom;
    }

    public String getWeapon() {
        return chosenWeapon;
    }

    //non-functional at the moment
    
    public void getStartingCards() {

    }
}
