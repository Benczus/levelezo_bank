import hu.eszterhazy.Account;
import hu.eszterhazy.Bank;
import hu.eszterhazy.PublicDigitalBank;
import hu.eszterhazy.UserAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankTest {

    Bank bank;
    String name;
    String ownername;
    Account account;
    @BeforeEach
    public void setup(){
        name="Dagobert INC.";
        ownername = "Dagobert Bácsi";
        bank = new PublicDigitalBank(name, ownername);
        account = new UserAccount("Kis József", "123");
        bank.addNewUser(account);
    }

    @Test
    public void testAuthenticateUser(){
        Assertions.assertTrue(bank.authenticateAccount(account));
    }

}
