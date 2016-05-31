package com.mark.java.DAO;

import com.mark.java.entity.User;

import java.util.List;

/**
 * Created by songjinjie on 16/5/17.
 */
public interface UserDAO {

    public int save(User u);
    public List<User> findAll();
}
