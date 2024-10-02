package features;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AtmWithdrawalSteps {

    private Account account;
    private int amountWithdrawn;

    @Given("Joe has ${int} in his checking account")
    public void joe_has_$_in_his_checking_account(Integer balance) {
        account = new Account(balance);
    }

    @Given("he has not withdrawn any money from the ATM today")
    public void he_has_not_withdrawn_any_money_from_the_atm_today() {
        // noop
    }

    @Given("he withdraws ${int}")
    public void he_withdraws(Integer initialWithdrawal) {
        account.withdraw(initialWithdrawal);
    }

    @When("he requests ${int}")
    public void he_requests_$(Integer amountRequested) {
        amountWithdrawn = account.withdraw(amountRequested);
    }

    @Then("he receives ${int}")
    public void he_receives_$(Integer expectedReceived) {
        assertEquals(expectedReceived, amountWithdrawn);
    }

    @Then("his new bank balance is ${int}")
    public void his_new_bank_balance_is_$(Integer expectedBalance) {
        assertEquals(expectedBalance, account.getBalance());
    }
}
