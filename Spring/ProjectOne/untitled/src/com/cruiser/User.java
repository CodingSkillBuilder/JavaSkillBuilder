package com.cruiser;

public class User {
    private final int id;
    private static int ID;

    String password;


    public int getId() {
        return id;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    @Override
    public String toString() {
        return "User{" +
                "ID=" + id +
                ", password='" + password + '\'' +
                '}';
    }

    public User(String password) {
        this.id = ID++;
        this.password = password;
    }


}
