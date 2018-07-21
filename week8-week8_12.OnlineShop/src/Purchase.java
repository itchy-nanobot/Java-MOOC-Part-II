/**
 * @author pranav
 */
public class Purchase {
    private String product;
    private int amount;
    private int unitPrice;

    public Purchase(String product, int amount, int unitPrice) {
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }

    public Purchase(String product, int unitPrice) {
        this.product = product;
        this.amount = 1;
        this.unitPrice = unitPrice;
    }

    public String getProduct() {
        return this.product;
    }

    public int price() {
        return this.amount*this.unitPrice;
    }

    public void increaseAmount() {
        this.amount++;
    }

    public void increaseAmount(int i) {
        for (int k = 0; k < i; k++) {
            this.amount++;
        }
    }

    public String toString() {
        return this.product + ": " + this.amount;
    }

}
