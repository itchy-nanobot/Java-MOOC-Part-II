/**
 * @author pranav
 */
import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface (Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {

        statements();

        while(true) {
            System.out.print("Statement: ");
            String command = this.reader.nextLine().trim();

            if (command.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (command.equals("add")) {
                add();
            } else if (command.equals("translate")) {
                translate();
            } else {
                System.out.println("Unknown statement \n");
            }
        }

    }

    public void statements() {
        System.out.println("Statement: ");
        System.out.println("quit - quit the text user interface \n " +
                "add - adds a word pair to the dictionary \n " +
                "translate - asks a word and prints its translation");
        System.out.println();
    }

    public void add() {
        System.out.print("In Finnish: ");
        String finnishWord = this.reader.nextLine().trim();

        System.out.print("Translation: ");
        String englishWord = this.reader.nextLine().trim();

        this.dictionary.add(finnishWord, englishWord);
        System.out.println();
    }

    public void translate() {
        System.out.print("Give a word: ");
        String finnishWord = this.reader.nextLine().trim();

        System.out.println("Translation: " + this.dictionary.translate(finnishWord) + "\n");
    }

}
