package com.weber.reflection;

public class User {
    private final int USERID;
    private final String NAME;
    private final int AGE;

    public User(int userID, String name, int age){
        this.USERID = userID;
        this.NAME = name;
        this.AGE = age;
    }

    public String getNAME(){
        return this.NAME;
    }


}
