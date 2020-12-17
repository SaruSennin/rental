package rental.rental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rental.rental.entity.Type;
import rental.rental.service.TypeService;

import java.util.Optional;

@RestController
@RequestMapping("/api/type")
public class TypeController {

    private TypeService typeService;

    @Autowired
    public TypeController(TypeService typeService) {
        this.typeService = typeService;
    }

    @GetMapping("/all")
    public Iterable<Type> getAll() {
        return typeService.findAll();
    }

    @GetMapping
    public Optional<Type> getById(@RequestParam Long index) {
        return typeService.findById(index);
    }

    @PostMapping
    public Type addType(@RequestBody Type type) {
        return typeService.save(type);
    }

    @PutMapping
    public Type updateType(@RequestBody Type type) {
        return typeService.save(type);
    }

    @DeleteMapping
    public void deleteType(@RequestParam Long index) {
        typeService.deleteById(index);
    }
}
