package rental.rental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import rental.rental.entity.Item;
import rental.rental.entity.Role;
import rental.rental.entity.User;
import rental.rental.reposytory.ItemRepository;
import rental.rental.reposytory.UserRepository;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class ItemService {

    private ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Optional<Item> findById(Long id){
        return  itemRepository.findById(id);
    }

    public Iterable<Item> findAll(){
        return itemRepository.findAll();
    }

    public Item save(Item item){
        return itemRepository.save(item);
    }

    public void deleteById(Long id){
        itemRepository.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDB(){
        save(new Item(1L,"nazwa","autor","opis",LocalDate.of(2020,5,30),"blabla".getBytes()));

    }

}
