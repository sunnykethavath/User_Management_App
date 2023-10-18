package com.example.UserManagement.controller;

import com.example.UserManagement.model.User;
import com.example.UserManagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    //api
    @PostMapping("/user")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }
    @GetMapping("/User/{id}")
    public User getUser(@PathVariable Integer id){
        return userService.getUser(id);
    }

    @GetMapping("/users")
    public
    List<User> getUser(){
        return userService.getAllUsers();
    }
    @PutMapping("/update/id")
    public String updateUserInfo(@RequestParam Integer id){
        return userService.updateUserInfo(id);
    }
    @DeleteMapping("/user/{userId}")
    public String deleteUser(@PathVariable Integer id){
        return userService.deleteUser(id);
    }
}
