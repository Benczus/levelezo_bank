package hu.eszterhazy;

public interface Bank {

    public boolean authenticateAccount(Account account);
    public void addNewUser(Account account);
    public void removeUser(String name);
    public void queryUser(String name);

    public void setName(String name);

    public String getName();

    public String getOwnerName();

    public void setOwnerName(String ownerName);
}
