package rental.rental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rental.rental.entity.UserItem;
import rental.rental.reposytory.UserItemRepository;

import java.util.Optional;

@Service
public class UserItemService {

    private UserItemRepository userItemRepository;

    @Autowired
    public UserItemService(UserItemRepository userItemRepository) {
        this.userItemRepository = userItemRepository;
    }

    public Optional<UserItem> findById(Long id) {
        return userItemRepository.findById(id);
    }

    public Iterable<UserItem> findAll() {
        return userItemRepository.findAll();
    }

    public UserItem save(UserItem userItem) {
        return userItemRepository.save(userItem);
    }

    public void deleteById(Long id) {
        userItemRepository.deleteById(id);
    }
}
