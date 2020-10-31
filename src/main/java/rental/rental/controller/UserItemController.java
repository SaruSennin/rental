package rental.rental.controller;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import rental.rental.entity.User;
import rental.rental.entity.UserItem;
import rental.rental.service.UserItemService;

import java.util.Optional;

@Controller
@RequestMapping("/api/user_item")
public class UserItemController {

    private UserItemService userItemService;

    public UserItemController(UserItemService userItemService) {
        this.userItemService = userItemService;
    }

    @GetMapping("/all")
    public Iterable<UserItem> getAll(){
        return userItemService.findAll();
    }

    @GetMapping
    public Optional<UserItem> getById(@RequestParam Long index){
        return  userItemService.findById(index);
    }

    @PostMapping
    public UserItem addUserItem(@RequestBody UserItem userItem){
        return userItemService.save(userItem);
    }

    @PutMapping
    public UserItem updateUserItem(@RequestBody UserItem userItem){
        return userItemService.save(userItem);
    }

    @DeleteMapping
    public void deleteUserItem(@RequestParam Long index){
        userItemService.deleteById(index);
    }
}
