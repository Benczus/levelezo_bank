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
    public void authenticateAccount() {

    }

    @Override
    public void addNewUser() {

    }

    public void queryAccount(String name){

    }
}
