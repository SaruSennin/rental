package rental.rental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rental.rental.entity.User;
import rental.rental.service.UserService;

import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public Iterable<User> getAll(){
        return userService.findAll();
    }

    @GetMapping
    public Optional<User> getById(@RequestParam Long index){
        return  userService.findById(index);
    }

    @PostMapping
    public User addUser (@RequestBody User user){
        return userService.save(user);
    }

    @PutMapping
    public User updateUser(@RequestBody User user) {
        return userService.save(user);
    }

    @DeleteMapping
    public void deleteUser(@RequestParam Long index){
         userService.deleteById(index);
    }
}


