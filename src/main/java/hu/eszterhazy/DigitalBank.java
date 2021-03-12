package hu.eszterhazy;

public abstract class DigitalBank implements Bank{

    private String name;

    public DigitalBank(String name, String ownerName) {
        this.name = name;
        this.ownerName = ownerName;
    }

    private String ownerName;




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
