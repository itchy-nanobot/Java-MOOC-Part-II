import java.util.ArrayList;

public class Suitcase {
    private int numberOfThings;
    private int weight;
    private final int maxWeight;
    private ArrayList<Thing> things;

    public Suitcase(int maxWeight) {
        this.numberOfThings = 0;
        this.weight = 0;
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
    }

    public void addThing(Thing thing) {

        if ((this.weight += thing.getWeight()) <= this.maxWeight ) {
            this.things.add(thing);
            this.numberOfThings++;
        } else {
            this.weight -= thing.getWeight();
        }
    }

    public String toString() {
        if (this.numberOfThings == 0) {
            return "empty (0 kg)";
        } else if (this.numberOfThings == 1) {
            return 1 + " thing(" + this.weight + " kg)";
        } else if (this.numberOfThings > 1) {
            return this.numberOfThings + " things(" + this.weight + " kg)";
        }
        return "";
    }

    public int totalWeight() {
        return this.weight;
    }

    public void printThings() {
        for (Thing i : things) {
            System.out.println(i);
        }
    }

    public Thing heaviestThing() {
        Thing heaviest = new Thing("k", 0);
        if (things.isEmpty()) {
            return null;
        }
        for (Thing i : things) {
            if (i.getWeight() > heaviest.getWeight()) {
                heaviest = i;
            }
        }
        return heaviest;
    }

}
