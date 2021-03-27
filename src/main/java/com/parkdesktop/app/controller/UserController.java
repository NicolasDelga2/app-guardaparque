package com.parkdesktop.app.controller;

import com.parkdesktop.app.models.User;
import com.parkdesktop.app.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/user/{id}")
    public Optional<User> getUser (@PathVariable Integer id){
        return userService.getUser(id);
    }

    @PostMapping("/user/addNew")
    public void addNew(User user){
        userService.save(user);
    }

    @PutMapping("/user/update")
    public void update(User user){
        userService.save(user);
    }

    @DeleteMapping("/user/delete/{id}")
    public void delete(@PathVariable Integer id){
        userService.delete(id);
    }

}
