package training.checkout;

public class Scanner {
    private final ProductCatalog catalog;

    public Scanner(ProductCatalog catalog) {
        this.catalog = catalog;
    }

    public Product scan(Long barcode) {
        if (!catalog.has(barcode))
            return new Product(-1L, "No such product", -0.01);
        return catalog.find(barcode);
    }
}
