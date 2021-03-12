package hu.eszterhazy;

public class UserAccount implements Account {
    private String name;
    private String password;
    public UserAccount(String name, String password) {
    this.name=name;
    this.password=password;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public void setPassword(String password) {
        this.password=password;
    }
}
