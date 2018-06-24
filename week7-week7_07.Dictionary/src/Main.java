
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        Dictionary dictionary = new Dictionary();
//        dictionary.add("apina", "monkey");
//        dictionary.add("banaani", "banana");
//        dictionary.add("cembalo", "harpsichord");
//
//        System.out.println(dictionary.translate("apina"));
//        System.out.println(dictionary.translate("cembalo"));
//        System.out.println(dictionary.translate("vittu"));
//        System.out.println(dictionary.amountOfWords());
//
//        ArrayList<String> translations = dictionary.translationList();
//        for (String word : translations) {
//            System.out.println(word);
//        }

        Scanner reader = new Scanner(System.in);
        Dictionary dict = new Dictionary();

        TextUserInterface ui = new TextUserInterface(reader, dict);
        ui.start();
    }
}
