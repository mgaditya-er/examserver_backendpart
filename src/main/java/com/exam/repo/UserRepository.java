package com.exam.repo;

import com.exam.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

//1.you have to enter the entity you're going to use i.e User
//2. Type of Id of that entity  i.e Long
public interface UserRepository extends JpaRepository<User,Long> {
    public User findByUsername(String username);
}
