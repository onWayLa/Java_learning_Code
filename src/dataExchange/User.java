package dataExchange;

public class User {
    private String name;
    private String password;

    public User(String uName, String uPassword){
        name = uName;
        password = uPassword;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
