package models;

public class User {
    private String username;
    private String password;
    private String email;

    public User(String username, String password, String email){
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public String getEmail(){
        return email;
    }

    public void setUsername(String new_username){
        this.username = new_username;
    }

    public void setPassword(String new_password){
        this.password = new_password;
    }

    public void setEmail(String new_email){
        this.email = new_email;
    }
}
