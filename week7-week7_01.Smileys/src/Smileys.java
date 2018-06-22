
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Arto");
        printWithSmileys("Mikael");
        printWithSmileys("87.");
        printWithSmileys("\\:D/");
    }
    
    private static void printWithSmileys(String characterString) {
        if (characterString.length()%2 == 1) {
            characterString += " ";
        }
        rowOfSmiley(characterString);
        characterSmiley(characterString);
        rowOfSmiley(characterString);
        
        }
    
    public static void rowOfSmiley(String characterString) {
        if (characterString.length() <= 4) {
            for (int i = 0; i <= characterString.length(); i++) {
            System.out.print(":)");
            }
        } else {
            for (int i = 0; i < characterString.length(); i++) {
            System.out.print(":)");
            }
        }
        
        System.out.println("");
    }
    
    public static void characterSmiley(String characterString) {
        System.out.println(":) " + characterString + " :)");
    }
    

}
