import java.util.ArrayList;
import java.util.Collections;

/**
 * @author pranav
 */
public class Hand implements Comparable<Hand> {
    private ArrayList<Card> hand;

    public Hand() {
    this.hand = new ArrayList<Card>();
    }

    public void add(Card card) {
        this.hand.add(card);
    }

    public void print() {
        for (Card i : this.hand) {
            System.out.println(i);
        }
    }

    public int sumOfHand() {
        int k = 0;
        for (Card i : this.hand) {
            k += i.getValue();
        }
        return k;
    }

    public void sort() {
        Collections.sort(this.hand);
    }

    public int compareTo(Hand hand) {
        return this.sumOfHand() - hand.sumOfHand() ;
    }

    public void sortAgainstSuit() {
        SortAgainstSuitAndValue sorter = new SortAgainstSuitAndValue();
        Collections.sort(this.hand, sorter);
    }

}
