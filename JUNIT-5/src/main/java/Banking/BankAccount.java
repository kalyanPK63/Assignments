package Banking;

public class BankAccount {
    int Available_Balance = 50_000;

    public String withdraw(int amount) throws InsufficientFundsException {
        int balance = Available_Balance - amount;
        if (amount > Available_Balance)
            throw new InsufficientFundsException("Insufficient Funds");
        else
            return "Remaining Balance = " + balance;
    }
}
