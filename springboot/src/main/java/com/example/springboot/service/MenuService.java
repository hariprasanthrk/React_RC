package com.example.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.springboot.model.Menu;
import com.example.springboot.repository.MenuRepo;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Optional;

@Service
public class MenuService {

    @Autowired
    MenuRepo menuRepo;

    public Menu create(Menu menu) {
        return menuRepo.save(menu);
    }

    public List<Menu> getAlldetails() {
        return menuRepo.findAll();
    }

    public Menu getMenuById(int id) {
        Optional<Menu> menuOptional = menuRepo.findById(id);
        return menuOptional.orElse(null);
    }

    public boolean updateDetails(int id, Menu menu) {
        if (getMenuById(id) == null) {
            return false;
        }
        try {
            menu.setId(id); // Ensure the menu object has the correct ID
            menuRepo.save(menu);
        } catch (DataAccessException e) {
            // Handle specific exceptions related to database operations
            return false;
        }
        return true;
    }

    public boolean deleteMenu(int id) {
        if (getMenuById(id) == null) {
            return false;
        }
        menuRepo.deleteById(id);
        return true;
    }
}
