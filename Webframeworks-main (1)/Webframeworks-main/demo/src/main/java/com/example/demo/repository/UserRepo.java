package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.User;
@Repository
public interface UserRepo extends JpaRepository<User,Integer>{

    @Query("SELECT s FROM User s WHERE s.id = :id")
    User findCustById(@RequestParam("custName") int id);
    
}
