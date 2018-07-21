import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author pranav
 */
public class Storehouse {
    private Map<String, Integer> storePrice;
    private Map<String, Integer> storeStock;

    public Storehouse() {
        this.storePrice = new HashMap<String, Integer>(); //HashMap to store product and price.
        this.storeStock = new HashMap<String, Integer>(); //HashMap to store product and stock.
    }

    public void addProduct(String product, int price, int stock) {
        this.storePrice.put(product, price);
        this.storeStock.put(product, stock);
    }

    public int price(String product) {
        product = clearText(product);

        if(this.storePrice.containsKey(product)) {
            return this.storePrice.get(product);
        }

        return -99;
    }

    public int stock(String product) {
        product = clearText(product);

        if (this.storeStock.containsKey(product)) {
            return this.storeStock.get(product);
        }

        return 0;
    }

    public boolean take(String product) {
        product = clearText(product);

        if (this.storeStock.containsKey(product) && this.storeStock.get(product) > 0) {
            int i = this.storeStock.get(product) - 1;
            this.storeStock.remove(product); //Removes the product
            this.storeStock.put(product, i); // and adds the product again after decreasing the stock by one.
            return true;
        }

        return false;
    }

    public Set<String> products() {
        return this.storePrice.keySet();
    }

    private String clearText(String text) {
        text = text.toLowerCase();
        // formats the text to lowercase and removes whitespace at beginning and at the end.
        return text.trim();
    }

}
