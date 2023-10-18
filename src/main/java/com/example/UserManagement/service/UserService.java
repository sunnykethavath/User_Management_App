package com.example.UserManagement.service;

import com.example.UserManagement.model.User;
import com.example.UserManagement.repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    IUserRepo userRepo;

    public String addUser(User user) {
        userRepo.save(user);
        return "user added";
    }

    public User getUser(Integer id) {
        return userRepo.findById(id).orElse(null);
    }

    public
    List<User> getAllUsers() {
        return userRepo.findAll();
    }

    public String updateUserInfo(Integer id) {
        User user = userRepo.findById(id).orElse(null);
        assert user != null;
        userRepo.save(user);
        return "user info updated";
    }

    public String deleteUser(Integer id) {
        userRepo.deleteById(id);
        return "user deleted";
    }
}
