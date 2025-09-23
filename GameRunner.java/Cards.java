import java.util.ArrayList;
import java.util.Random;

//This class is from a previous project I worked on.
public class Cards {

    public ArrayList<String> arrDeck = new ArrayList<String>();
    private Random random = new Random();

    // add 52 cards from number and suit (e.g. 13-C)
    public Cards() {

        for (int i = 0; i < 13; i++) {
            arrDeck.add((i+1) + "-S"); // Spades
        }
        for (int i = 0; i < 13; i++) {
            arrDeck.add((i+1) + "-C"); // Clubs
        }
        for (int i = 0; i < 13; i++) {
            arrDeck.add((i+1) + "-H"); // Hearts
        }
        for (int i = 0; i < 13; i++) {
            arrDeck.add((i+1) + "-D"); // Diamonds
        }
    }


    // get random cards
    public ArrayList<String> getCards(int num) {
        ArrayList<String> cards  = new ArrayList<String>();
        int index = 0;

        for (int i = 0; i < num; i++) {
            index = random.nextInt(arrDeck.size());
            cards.add(arrDeck.remove(index));
        }
        return cards;
    }

}
