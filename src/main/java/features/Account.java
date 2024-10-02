package features;

public class Account {
    public static final Integer MAXIMUM_ATM_WITHDRAWAL = 300;
    private Integer balance;

    public Account(Integer balance) {
        this.balance = balance;
    }

    public int withdraw(Integer amountRequested) {
        if (amountRequested > balance || amountRequested > MAXIMUM_ATM_WITHDRAWAL) return 0;
        balance -= amountRequested;
        return amountRequested;
    }

    public int getBalance() {
        return this.balance;
    }
}
