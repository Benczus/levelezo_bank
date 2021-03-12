package hu.eszterhazy;

import java.util.List;

public class BankMemoryDB implements BankDB{
    //TODO
    List<Account> accounts;

    public BankMemoryDB(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public Account getAccount(String name) {
        return null;
    }

    @Override
    public void removeAccount(String name) {

    }

    @Override
    public void removeAccount(Account account) {

    }

    @Override
    public void addAccount(Account account) {

    }

    @Override
    public void addAccount(String name, String pass) {

    }
}
