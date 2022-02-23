package edu.h22_4m6.group_gifts.db;

import java.util.List;

import edu.h22_4m6.group_gifts.models.*;

/*
 * Created by jadaneau (9490191) on 2022-02-22.
 */
interface IUserDAO {

  public List<User> fetchAllUsers();
}
