import java.util.ArrayList;

public class Container {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    private int numberOfThings;

    public Container(int maxWeight) {
        this.numberOfThings = 0;
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<Suitcase>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int weight = totalWeight();
        if ((weight += suitcase.totalWeight()) <= this.maxWeight ) {
            this.suitcases.add(suitcase);
            this.numberOfThings++;
        } else {
            weight -= suitcase.totalWeight();
        }
    }

    private int totalWeight() {
        int weight = 0;
        for (Suitcase i : suitcases) {
            weight += i.totalWeight();
        }
        return weight;
    }

    public String toString() {
        int weight = totalWeight();
        if (this.numberOfThings == 0) {
            return "empty (0 kg)";
        } else if (this.numberOfThings == 1) {
            return 1 + " suitcase(" + weight + " kg)";
        } else if (this.numberOfThings > 1) {
            return this.numberOfThings + " suitcases(" + weight + " kg)";
        }
        return "";
    }

    public void printThings() {
        for (Suitcase i : suitcases) {
            i.printThings();
        }
    }

}
