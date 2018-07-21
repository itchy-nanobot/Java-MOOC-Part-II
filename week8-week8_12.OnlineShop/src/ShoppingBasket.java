import java.util.ArrayList;
import java.util.List;

/**
 * @author pranav
 */
public class ShoppingBasket {
    private List<Purchase> basket;

    public ShoppingBasket() {
        this.basket = new ArrayList<Purchase>();
    }

    public void add(String product, int price) {
        if (cartContainsItem(product)) {
            for (Purchase i : this.basket) {
                if (i.getProduct().equals(product)) {
                    i.increaseAmount();
                    break;
                }
            }
        } else {
            this.basket.add(new Purchase(product, price));
        }
    }

    public int price() {
        int totalPrice = 0;

        for (Purchase i : this.basket) {
            totalPrice += i.price();
        }

        return totalPrice;
    }

    public boolean cartContainsItem(String product) {
        for (Purchase i : this.basket) {
            if (i.getProduct().equals(product)) {
                return true;
            }
        }
        return false;
    }

    public void print() {
        for (Purchase i : this.basket) {
            System.out.println(i);
        }
    }

}
