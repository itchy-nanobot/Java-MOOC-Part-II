/**
 * @author pranav
 */

public class Flight {
    private Airplane plane;
    private String fromOrigin;
    private String toDestination;

    public Flight(Airplane planeID, String origin, String destination) {
        this.plane = planeID;
        this.fromOrigin = origin;
        this.toDestination = destination;
    }

    public String toString() {
        return this.plane + " (" + this.fromOrigin + "-" + this.toDestination + ")";
    }

}
