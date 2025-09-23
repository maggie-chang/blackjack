import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    Cards cards;

    public Game() {


    }


    public static ArrayList<String> getFlop(Cards deck) {
        ArrayList<String> flop = deck.getCards(5);
            return flop;
        //System.out.println(flop);
    }
}