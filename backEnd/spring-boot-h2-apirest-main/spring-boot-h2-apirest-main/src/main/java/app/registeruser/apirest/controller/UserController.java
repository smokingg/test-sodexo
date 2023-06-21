package app.registeruser.apirest.controller;

import app.registeruser.apirest.UserService;
import app.registeruser.apirest.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.createuser(user);
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("{id}")
    public User searchUserById(@PathVariable("id") Long id){
        return userService.getUserById(id);
    }
    @DeleteMapping("{id}")
    public void deleteUserById(@PathVariable("id") Long id){
         userService.deleteUser(id);
    }

}
