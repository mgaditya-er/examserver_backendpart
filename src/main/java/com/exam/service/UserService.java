package com.exam.service;


import com.exam.model.User;
import com.exam.model.UserRole;

import java.util.Set;

public interface UserService {

    //creating user
    public User createuser(User user, Set<UserRole> userRoles) throws Exception;
}
