package edu.h22_4m6.group_gifts.models;

/*
 * Created by jadaneau (9490191) on 2022-02-22.
 */
public class User {

    private static final int AUTO_INCREMENT = 0;
    private int _user_id;
    private String _user_email;
    private String _user_password;

    public User (String user_email, String user_password){
        this._user_id = AUTO_INCREMENT + 1;
        this._user_email = user_email;
        this._user_password = user_password;
    }
}
