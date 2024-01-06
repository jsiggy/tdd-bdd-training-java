package training.checkout;

import lombok.Getter;

public class Product {
    @Getter
    private final Long barcode;
    @Getter
    private final Double price;
    @Getter
    private final String name;

    public Product(Long barcode, String name, Double price) {
        this.barcode = barcode;
        this.name = name;
        this.price = price;
    }
}
