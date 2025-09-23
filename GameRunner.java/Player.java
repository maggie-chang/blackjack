import java.util.Scanner;
import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<String> hand;

    Scanner scanner = new Scanner(System.in);

    public Player(String person, Card deck) {
        
        this.name = person;
        
        this.hand = deck.getCards(2);

    }
    
    // see player's cards
    public void seeCards() {
      System.out.println(hand);
    }

    // print player name
    public void printName() {
      System.out.print(name);
    }

}