package rental.rental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rental.rental.entity.Item;
import rental.rental.service.ItemService;


import java.util.Optional;

@RestController
@RequestMapping("/api/item")
public class ItemController {

    private ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/all")
    public Iterable<Item> getAll(){
        return itemService.findAll();
    }

    @GetMapping
    public Optional<Item> getById(@RequestParam Long index){
        return itemService.findById(index);
    }

    @PostMapping
    public Item addItem(@RequestBody Item item){
        return itemService.save(item);
    }

    @PutMapping
    public  Item updateItem(@RequestBody Item item){
        return  itemService.save(item);
    }

    @DeleteMapping
    public void deleteItem(@RequestParam Long index){
        itemService.deleteById(index);
    }

}
