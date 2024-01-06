package features;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import training.checkout.Product;
import training.checkout.ProductCatalog;
import training.checkout.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SelfCheckoutSteps {
    private final ProductCatalog productCatalog = new ProductCatalog();
    private Product product;

    @Given("the product catalog includes a {word} with barcode {long} and price ${double}")
    public void addProductToCatalog(String productName, Long barcode, Double price) {
        productCatalog.add(new Product(barcode, productName, price));
    }

    @When("a product with barcode {long} is scanned")
    public void scanProductByBarcode(Long barcode) {
        product = new Scanner(productCatalog).scan(barcode);
    }

    @Then("the current product price should be ${double}")
    public void productPriceShouldBe(Double expectedPrice) {
        assertEquals(expectedPrice, product.getPrice());
    }
}

