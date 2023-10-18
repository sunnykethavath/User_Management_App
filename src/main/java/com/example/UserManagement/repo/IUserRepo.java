package com.example.UserManagement.repo;

import com.example.UserManagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User,Integer> {
}
