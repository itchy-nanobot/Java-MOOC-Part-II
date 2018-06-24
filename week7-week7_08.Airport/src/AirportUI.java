/**
 * @author pranav
 */
import java.util.ArrayList;
import java.util.Scanner;

public class AirportUI {
    private Scanner reader;
    private ArrayList<Airplane> planes;
    private ArrayList<Flight> flights;

    public AirportUI(Scanner reader) {
        this.reader = reader;
        this.planes = new ArrayList<Airplane>();
        this.flights = new ArrayList<Flight>();
    }

    public void start() {
        airportPanel();
    }

    public void airportPanel() {
        System.out.println("Airport panel \n" +
                "--------------------\n");

        while (true) {
            airportStatements();
            String command = this.reader.nextLine();

            if (command.equals("1")) {
                addPlane();
            } else if (command.equals("2")) {
                addFlight();
            } else if (command.equals("x")) {
                System.out.println();
                flightPanel();
                break;
            }
        }
    }

    public void flightPanel() {
        System.out.println("Flight service \n" +
                "------------");

        while (true) {
            flightStatements();
            String command = this.reader.nextLine();
            command = command.trim();

            if (command.equals("1")) {
                printPlanes();
            } else if (command.equals("2")) {
                printFlights();
            } else if (command.equals("3")) {
                printPlane();
            } else if (command.equals("x")) {
                break;
            }
        }
    }

    public void addPlane() {
        System.out.print("Give plane ID: ");
        String name = this.reader.nextLine();

        System.out.print("Give plane capacity: ");
        int capacity = Integer.parseInt(this.reader.nextLine());

        this.planes.add(new Airplane(name, capacity));
    }

    public void addFlight() {
        Airplane plane = new Airplane("name", 0);
        System.out.print("Give plane ID: ");
        String name = reader.nextLine();
        for (Airplane i : this.planes) {
            if (i.getName().equals(name.trim())) {
                plane = i;
            }
        }

        System.out.print("Give departure airport code: ");
        String origin = reader.nextLine();

        System.out.print("Give destination airport code: ");
        String destination = reader.nextLine();

        this.flights.add(new Flight(plane, origin, destination));
    }

    public void printPlane() {
        System.out.print("Give plane ID: ");
        String planeID = reader.nextLine();
        for (Airplane i : this.planes) {
            if (i.getName().equals(planeID.trim())) {
                System.out.println(i);
            }
        }
    }

    public void printPlanes() {
        for (Airplane i : this.planes) {
            System.out.println(i);
        }
    }

    public void printFlights() {
        for (Flight i : this.flights) {
            System.out.println(i);
        }
    }

    public void airportStatements() {

        System.out.print("Choose operation: \n" +
                "[1] Add airplane \n" +
                "[2] Add flight \n" +
                "[x] Exit \n" +
                "> ");
    }

    public void flightStatements() {

        System.out.print("Choose operation: \n" +
                "[1] Print planes \n" +
                "[2] Print flights \n" +
                "[3] Print plane info \n" +
                "[x] Quit \n" +
                "> ");
    }

}
