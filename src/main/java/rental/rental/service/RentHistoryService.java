package rental.rental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rental.rental.entity.RentHistory;
import rental.rental.reposytory.RentHistoryRepository;

import java.util.Optional;

@Service
public class RentHistoryService {

    private RentHistoryRepository rentHistoryRepository;

    @Autowired
    public RentHistoryService(RentHistoryRepository rentHistoryRepository) {
        this.rentHistoryRepository = rentHistoryRepository;
    }

    public Optional<RentHistory> findById(Long id) {
        return rentHistoryRepository.findById(id);
    }

    public Iterable<RentHistory> findAll() {
        return rentHistoryRepository.findAll();
    }

    public RentHistory save(RentHistory rentHistory) {
        return rentHistoryRepository.save(rentHistory);
    }

    public void deleteById(Long id) {
        rentHistoryRepository.deleteById(id);
    }
}
