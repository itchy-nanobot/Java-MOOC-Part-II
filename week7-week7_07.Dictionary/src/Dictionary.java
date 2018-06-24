import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.ArrayList;

/**
 * @author pranav
 */
public class Dictionary {
    private final HashMap<String, String> wordList;

    public Dictionary () {
        this.wordList = new HashMap<String, String>();
    }

    public void add(String word, String translation) {
        this.wordList.put(word, translation );
    }

    public String translate(String word) {
        if (this.wordList.containsKey(word)) {
            return this.wordList.get(word);
        }

        return null;
    }

    public int amountOfWords() {
        return this.wordList.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> translationList = new ArrayList<String>();
        for (String key : this.wordList.keySet()) {
            translationList.add(key + " = " + this.wordList.get(key));
        }
        return translationList;
    }

}
