import hu.eszterhazy.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class BankTest {

    Bank bank;
    String name;
    String ownername;
    Account account;
    @BeforeEach
    public void setup(){
        name="Dagobert INC.";
        ownername = "Dagobert Bácsi";
        BankDB bankDB= new BankMemoryDB(new ArrayList<>());
        bank = new PublicDigitalBank(name, ownername, bankDB);
        account = new UserAccount("Kis József", "123");
        bank.addNewUser(account);
    }

    @Test
    public void testAuthenticateUser(){
        //TODO fix code until test runs
        Assertions.assertTrue(bank.authenticateAccount(account));
    }

}
