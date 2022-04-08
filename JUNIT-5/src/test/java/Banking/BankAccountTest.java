package Banking;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @DisplayName("Throws InsufficientFundsException")
    @Test
    void withdraw() {
        BankAccount bankAccount = new BankAccount();
        assertThrows(InsufficientFundsException.class, () -> bankAccount.withdraw(60000));
    }
}