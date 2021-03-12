package hu.eszterhazy;

public class PublicDigitalBank extends DigitalBank{

    public PublicDigitalBank(String name, String ownerName, BankDB bankDB) {
        super(name, ownerName, bankDB);
    }

    @Override
    public String getName() {
        return super.getName() + "Public Digital Bank";
    }

    @Override
    public boolean authenticateAccount(Account account) {
        return false;
    }




    public void queryAccount(String name){

    }
}
