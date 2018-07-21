import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * @author pranav
 */
public class Skier implements Comparable<Skier> {
    private String name;
    private int points;
    public int totalScore;
    private int jumpLength;
    private Random random;
    private ArrayList<Integer> scores;
    private ArrayList<Integer> jumpLengths;

    public Skier(String name) {
        this.name = name;
        this.points = 0;
        this.totalScore = 0;
        this.random = new Random();
        this.scores = new ArrayList<Integer>();
        this.jumpLengths = new ArrayList<Integer>();
    }

    public String getName() {
        return this.name;
    }

    public int getPoints() {
        return this.points;
    }

//    --------------unused method--------------
//    public void addPoints(int i) {
//        this.points += i;
//    }

    public void jump() {
        this.jumpLength = this.random.nextInt(60) + 61;
        this.jumpLengths.add(this.jumpLength);
    }

    public int getJumpLength() {
        return this.jumpLength;
    }

    public ArrayList<Integer> judgeScores() {
        this.scores.clear();
        for (int i = 0; i < 5; i++) {
            this.scores.add(this.random.nextInt(10) + 11);
        }
        return this.scores;
    }

    public void filterJudgeScores(ArrayList<Integer> list) {
        Collections.sort(list);
        list.remove(0);
        list.remove(list.size() - 1);
    }

    public ArrayList<Integer> getJudgeScores() {
        return this.scores;
    }

    public void printJudgeScores() {
        System.out.println(this.scores);
    }

    public void roundScore() {
        int total = 0;
        filterJudgeScores(this.scores);
        for (int k : this.scores) {
            total += k;
        }
        total += this.jumpLength;

        this.totalScore += total;
    }

    public int getTotalScore() {
        return this.totalScore;
    }

    public String toString() {
        return this.name + " (" + this.totalScore + " points)";
    }

    public void printJumps() {
        System.out.print("jump lengths: ");
        for (int i = 0; i < this.jumpLengths.size(); i++) {
            if (i == this.jumpLengths.size() - 1) {
                System.out.print(this.jumpLengths.get(i) + " m");
            } else {
                System.out.print(this.jumpLengths.get(i) + " m, ");
            }
        }
    }

    @Override
    public int compareTo(Skier skier) {
        if (skier.getTotalScore() - this.totalScore == 0) {
            return this.name.compareTo(skier.getName());
        }
        return this.totalScore - skier.getTotalScore();
    }

}
