package org.ncu.GROCERY.CONTROLLER;

import org.ncu.GROCERY.ENTITY.User;
import org.ncu.GROCERY.SERVICE.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/post")
    public User createUser(@RequestBody User user) {
        return userService.saveOrUpdateUser(user);
    }

//    @GetMapping("/get/{userId}")
//    public User getUserById(@PathVariable int userId) {
//        return userService.getUserById(userId);
//    }
    @GetMapping("/get/{userId}")
    public User getUserById(@PathVariable("userId") int userId) {
        return userService.getUserById(userId);
    }


    @PutMapping("/put/{userId}")
    public User updateUser(@PathVariable ("userId") int userId, @RequestBody User user) {
        return userService.saveOrUpdateUser(user);
    }

    @DeleteMapping("/delete/{userId}")
    public String deleteUser(@PathVariable ("userId") int userId) {
        userService.deleteUser(userId);
        return "User with ID " + userId + " deleted successfully";
    }
}
