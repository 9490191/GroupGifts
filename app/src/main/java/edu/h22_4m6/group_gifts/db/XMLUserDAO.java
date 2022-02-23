package edu.h22_4m6.group_gifts.db;

import java.util.HashMap;
import java.util.List;

import edu.h22_4m6.group_gifts.R;
import edu.h22_4m6.group_gifts.models.User;

/*
 * Created by jadaneau (9490191) on 2022-02-22.
 */
class XMLUserDAO implements IUserDAO{

    List<User> users;

    @Override
    public List<User> fetchAllUsers() {

        /*
        String[] user_email = getResources().getStringArray(R.array.Addresses);
        String[] user_password = getResources().getStringArray(R.array.MotsDePasses);

        for(int i = 0; i< user_email.length; i++)
        {
            users.add(new User(user_email, user_password));
        }*/
        return null;
    }


}
