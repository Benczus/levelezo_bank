package hu.eszterhazy;

public interface Bank {

    public void authenticateAccount();

    public void setName(String name);

    public String getName();

    public String getOwnerName();

    public void setOwnerName(String ownerName);
}
