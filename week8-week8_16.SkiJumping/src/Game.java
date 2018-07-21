import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author pranav
 */
public class Game {
    private ArrayList<Skier> list;
    private Scanner reader;

    public Game() {
        this.reader = new Scanner(System.in);
        this.list = new ArrayList<Skier>();
    }

    public void addSkier(String name) {
        boolean k = true;
        for (Skier i : this.list) {
            if (i.getName().equals(name)) {
                k = false;
            }
        }
        if (k) {
            this.list.add(new Skier(name));
        }
    }

    public void start() {
        System.out.println("Kumpula ski jumping week\n");
        participants();
        rounds();
        tournamentResult();
    }

    public void participants() {
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        while (true) {
            System.out.print("  Participant name: ");
            String name = reader.nextLine();
            if (name.equals("")) {
                System.out.println("\n The tournament begins! \n");
                break;
            }
            addSkier(name);
        }
    }

    public void rounds() {
        int round = 1;
        while (true) {
            int i = 1;
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String command = reader.nextLine();
            System.out.println();
            if (command.equals("quit")) {
                System.out.println("Thanks! \n");
                break;
            }
            if (command.equals("jump")) {
                System.out.println("Round " + round + "\n");

                System.out.println("Jumping order: ");
                Collections.sort(this.list);
                for (Skier skier : this.list) {
                    System.out.println("  " + i + ". " + skier);
                    i++;
                }
                System.out.println();

                System.out.println("Results of round " + round);
                for (Skier skier : this.list) {
                    System.out.println("  " + skier.getName());
                    skier.jump();
                    skier.judgeScores();
                    System.out.println("    length: " + skier.getJumpLength());
                    System.out.println("    judge votes: " + skier.getJudgeScores());
                    skier.roundScore();

                }

                round++;
                System.out.println();

            }
        }
    }

    public void tournamentResult() {
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        int i = 1;
        Collections.sort(this.list);
        Collections.reverse(this.list);
        for (Skier skier : this.list) {
            System.out.println(i + "           " + skier);
            System.out.print("            ");
            skier.printJumps();
            System.out.println();
            i++;
        }
    }

}
