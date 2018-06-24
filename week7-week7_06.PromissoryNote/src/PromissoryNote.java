import java.util.HashMap;

/**
 * @author pranav
 */
public class PromissoryNote {
    private HashMap<String, Double> loan;

    public PromissoryNote() {
        this.loan = new HashMap<String, Double>();
    }

    public void setLoan(String toWhom, double value) {
        this.loan.put(toWhom, value);
    }

    public double howMuchIsTheDebt(String whose) {

        if (this.loan.containsKey(whose)) {
            return this.loan.get(whose);
        } else return 0;

    }
}
