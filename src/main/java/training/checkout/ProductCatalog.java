package training.checkout;

import java.util.HashMap;
import java.util.Map;

public class ProductCatalog {
    private final Map<Long, Product> productByBarcode = new HashMap<>();

    public void add(Product product) {
        productByBarcode.put(product.getBarcode(), product);
    }

    public boolean has(Long barcode) {
        return productByBarcode.containsKey(barcode);
    }

    public Product find(Long barcode) {
        return productByBarcode.get(barcode);
    }
}
