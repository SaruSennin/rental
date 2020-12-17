package rental.rental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rental.rental.entity.UserItem;
import rental.rental.service.UserItemService;

import java.util.Optional;

@RestController
@RequestMapping("/api/user-item")
public class UserItemController {

    private UserItemService userItemService;

    @Autowired
    public UserItemController(UserItemService userItemService) {
        this.userItemService = userItemService;
    }

    @GetMapping("/all")
    public Iterable<UserItem> getAll() {
        return userItemService.findAll();
    }

    @GetMapping
    public Optional<UserItem> getById(@RequestParam Long index) {
        return userItemService.findById(index);
    }

    @DeleteMapping
    public void deleteUserItem(@RequestParam Long index) {
        userItemService.deleteById(index);
    }
}
