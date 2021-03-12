package hu.eszterhazy;

public interface BankDB {

    Account getAccount(String name);
    void removeAccount(String name);
    void removeAccount(Account account);
    void addAccount(Account account);
    void addAccount(String name, String pass);

}
