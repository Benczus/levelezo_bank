package hu.eszterhazy;

public class PublicDigitalBank extends DigitalBank{

    public PublicDigitalBank(String name, String ownerName) {
        super(name, ownerName);
    }

    @Override
    public String getName() {
        return super.getName() + "Public Digital Bank";
    }

    @Override
    public boolean authenticateAccount(Account account) {
        return false;
    }

    @Override
    public void addNewUser(Account account) {

    }

    @Override
    public void removeUser(String name) {

    }

    @Override
    public void queryUser(String name) {

    }


    public void queryAccount(String name){

    }
}
