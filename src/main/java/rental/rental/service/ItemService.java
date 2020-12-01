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
        save(new Item(1L,"nazwa01","autor01","opis01",LocalDate.of(2001,1,1),"link_do_zdjecia_01".getBytes()));
        save(new Item(2L,"nazwa02","autor02","opis02",LocalDate.of(2002,2,2),"link_do_zdjecia_02".getBytes()));
        save(new Item(3L,"nazwa03","autor03","opis03",LocalDate.of(2003,3,3),"link_do_zdjecia_03".getBytes()));
        save(new Item(4L,"nazwa04","autor04","opis04",LocalDate.of(2004,4,4),"link_do_zdjecia_04".getBytes()));
        save(new Item(5L,"nazwa05","autor05","opis05",LocalDate.of(2005,5,5),"link_do_zdjecia_05".getBytes()));
        save(new Item(6L,"nazwa06","autor06","opis06",LocalDate.of(2006,6,6),"link_do_zdjecia_06".getBytes()));
        save(new Item(7L,"nazwa07","autor07","opis07",LocalDate.of(2007,7,7),"link_do_zdjecia_07".getBytes()));
        save(new Item(8L,"nazwa08","autor08","opis08",LocalDate.of(2008,8,8),"link_do_zdjecia_08".getBytes()));
        save(new Item(9L,"nazwa09","autor09","opis09",LocalDate.of(2009,9,9),"link_do_zdjecia_09".getBytes()));
        save(new Item(10L,"nazwa10","autor10","opis10",LocalDate.of(2010,10,10),"link_do_zdjecia_10".getBytes()));

    }

}
