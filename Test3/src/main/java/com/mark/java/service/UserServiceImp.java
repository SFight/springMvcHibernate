package com.mark.java.service;

import com.mark.java.DAO.UserDAO;
import com.mark.java.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by songjinjie on 16/5/17.
 */
@Service
public class UserServiceImp implements UserService {


//    public List<String> getAllUserNames() {
//
//        List<String> users = new ArrayList<String>();
//        users.add("MarK");
//
//        users.add("Ken");
//        users.add("Fowafolo");
//        return users;
//    }
    @Autowired
    private UserDAO userDao;

    public void saveUsers(List<User> us) {
        for (User u : us) {
            userDao.save(u);
        }
    }

    public List<User> getAllUsernames() {
        return userDao.findAll();
    }
}
