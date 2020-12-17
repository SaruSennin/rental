package rental.rental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rental.rental.entity.RentHistory;
import rental.rental.service.RentHistoryService;

import java.util.Optional;

@RestController
@RequestMapping("/api/history")
public class RentHistoryController {

    private RentHistoryService rentHistoryService;

    @Autowired
    public RentHistoryController(RentHistoryService rentHistoryService) {
        this.rentHistoryService = rentHistoryService;
    }

    @GetMapping("/all")
    public Iterable<RentHistory> getAll() {
        return rentHistoryService.findAll();
    }

    @GetMapping
    public Optional<RentHistory> getById(@RequestParam Long id) {
        return rentHistoryService.findById(id);
    }

    @PostMapping
    public RentHistory addRentHistory(@RequestBody RentHistory rentHistory) {
        return rentHistoryService.save(rentHistory);
    }


}
