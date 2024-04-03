package com.example.springboot.controller;

import com.example.springboot.model.Menu;
import com.example.springboot.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
// @RequestMapping("/api/menu")
public class MenuController {

    @Autowired
    MenuService menuService;

    @PostMapping("/postm")
    public ResponseEntity<Menu> add(@RequestBody Menu menu) {
        Menu newMenu = menuService.create(menu);
        return new ResponseEntity<>(newMenu, HttpStatus.CREATED);
    }

    @GetMapping("/getm")
    public ResponseEntity<List<Menu>> getAllMenus() {
        List<Menu> menus = menuService.getAlldetails();
        return new ResponseEntity<>(menus, HttpStatus.OK);
    }

    @GetMapping("/put/menu/{menuId}")
    public ResponseEntity<Menu> getById(@PathVariable("menuId") int id) {
        Menu menu = menuService.getMenuById(id);
        if (menu != null) {
            return new ResponseEntity<>(menu, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/delete/menu/{menuId}")
    public ResponseEntity<Menu> update(@PathVariable("menuId") int id, @RequestBody Menu menu) {
        boolean updated = menuService.updateDetails(id, menu);
        if (updated) {
            return new ResponseEntity<>(menu, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{menuId}")
    public ResponseEntity<Boolean> delete(@PathVariable("menuId") int id) {
        if (menuService.deleteMenu(id)) {
            return new ResponseEntity<>(true, HttpStatus.OK);
        }
        return new ResponseEntity<>(false, HttpStatus.NOT_FOUND);
    }
}
