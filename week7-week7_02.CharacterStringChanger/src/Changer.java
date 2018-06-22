/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pranav
 */
import java.util.ArrayList;

public class Changer {
    private ArrayList<Change> changeList;
    
    public Changer() {
        this.changeList = new ArrayList<Change>();
    }
    
    public void addChange(Change change) {
        this.changeList.add(change);
    }
    
    public String change(String characterString) {
        for (Change i : this.changeList) {
            characterString = i.change(characterString);
        }
        return characterString;
    }
    
}
