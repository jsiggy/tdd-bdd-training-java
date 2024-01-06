package features;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SelfCheckoutSteps {
    @Given("the product catalog includes a lightbulb with barcode {int} and price ${double}")
    public void the_product_catalog_includes_a_lightbulb_with_barcode_and_price_$(Integer int1, Double double1) {
    }

    @When("a product with barcode {int} is scanned")
    public void a_product_with_barcode_is_scanned(Integer int1) {
    }

    @Then("the current product price should be ${double}")
    public void the_current_product_price_should_be_$(Double double1) {
    }
}
