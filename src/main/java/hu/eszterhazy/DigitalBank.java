package hu.eszterhazy;

public abstract class DigitalBank implements Bank{

    BankDB bankDB;

    private String name;

    public DigitalBank(String name, String ownerName, BankDB bankDB) {
        this.name = name;
        this.ownerName = ownerName;
        this.bankDB= bankDB;
    }

    private String ownerName;

    @Override
    public void addNewUser(Account account) {
        bankDB.addAccount(account);
    }

    @Override
    public void removeUser(String name) {
        bankDB.removeAccount(name);
    }

    @Override
    public void queryUser(String name) {
        bankDB.getAccount(name);
    }


    @Override
    public void setName(String name) {

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getOwnerName() {
        return this.ownerName;
    }

    @Override
    public void setOwnerName(String ownerName) {

    }
}
