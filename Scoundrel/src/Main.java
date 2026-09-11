import java.util.*;
public class Main {

    public static Deque<String> randomDeck(String[] input){
        if (input == null) throw new IllegalArgumentException("Input array must not be null.");

        List<String> list = new ArrayList<>(Arrays.asList(input));
        Collections.shuffle(list);
        return new ArrayDeque<>(list);
    }

    public static void main(String[] args){
        String[] deck = {"H2", "H3", "H4", "H5", "H6", "H7", "H8", "H9", "H10", "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D10", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10", "C11", "C12", "C13", "C14", "S2", "S3", "S4", "S5", "S6", "S7", "S8", "S9", "S10", "S11", "S12", "S13", "S14"};
        Deque<String> gameDeck = randomDeck(deck);
        String[] board = new String[4];
        int health = 20;
        int weaponPower = 0;
        int maxWeapon = 14;
        boolean lastRun = false;
        boolean healthRoom = false;

        System.out.println("Welcome to Scoundrel!\n==============================\nPress 1 to start, or press 2 to view the rules.");
    }
}
