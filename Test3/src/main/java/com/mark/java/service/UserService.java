package com.mark.java.service;

import com.mark.java.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by songjinjie on 16/5/17.
 */
@Service("userService")
@Transactional
public interface UserService {

//    public List<String> getAllUserNames();
    public void saveUsers(List<User> us);
    public List<User> getAllUsernames();
}
