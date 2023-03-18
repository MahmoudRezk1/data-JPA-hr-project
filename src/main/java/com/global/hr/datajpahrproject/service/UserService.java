package com.global.hr.datajpahrproject.service;

import com.global.hr.datajpahrproject.entity.User;
import com.global.hr.datajpahrproject.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    public List<User> findAll(){
        return userRepo.findAll();
    }

    public User findById(Long id){
        return userRepo.findById(id).orElseThrow();
    }
    public User insert(User user){
        return userRepo.save(user);
    }
    public User update(User user){
        User current = userRepo.findById(user.getId()).get();
        current.setUserName(user.getUserName());
        current.setPassword(user.getPassword());
        return userRepo.save(current);
    }

}
