/**
 * @author pranav
 */
public class Airplane {
    private String planeID;
    private int capacity;

    public Airplane(String name, int capacity) {
        this.planeID = name;
        this.capacity = capacity;
    }

    public String getName() {
        return this.planeID;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public String toString() {
        return this.planeID + " (" + this.capacity + " ppl)";
    }


}
