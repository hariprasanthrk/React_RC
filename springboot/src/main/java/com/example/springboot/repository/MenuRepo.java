package com.example.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springboot.model.Menu;

public interface MenuRepo extends JpaRepository<Menu, Integer> {
    
}
