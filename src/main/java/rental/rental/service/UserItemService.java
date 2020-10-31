package rental.rental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import rental.rental.entity.Role;
import rental.rental.entity.User;
import rental.rental.entity.UserItem;
import rental.rental.reposytory.UserItemRepository;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class UserItemService {

    private UserItemRepository userItemRepository;

    @Autowired
    public UserItemService(UserItemRepository userItemRepository) {
        this.userItemRepository = userItemRepository;
    }

    public Optional<UserItem> findById(Long id){
        return userItemRepository.findById(id);
    }

    public Iterable<UserItem> findAll(){
        return userItemRepository.findAll();
    }

    public UserItem save(UserItem userItem){
        return userItemRepository.save(userItem);
    }

    public void deleteById(Long id){
        userItemRepository.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDB(){
        save(new UserItem(1L, LocalDate.of(2020,5,30), LocalDate.of(2020,5,30)));
    }

}
