
public class Main {

    public static void main(String[] args) {
        // use this main class to test your program!
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        for (int i = 0; i < 100; i++) {
            Thing brick = new Thing("Brick", 1 + i);
            Suitcase k = new Suitcase(100);
            k.addThing(brick);
            container.addSuitcase(k);
        }
    }

}
