package rental.rental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import rental.rental.entity.Item;
import rental.rental.reposytory.ItemRepository;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class ItemService {

    private ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Optional<Item> findById(Long id) {
        return itemRepository.findById(id);
    }

    public Iterable<Item> findAll() {
        return itemRepository.findAll();
    }

    public Item save(Item item) {
        return itemRepository.save(item);
    }

    public void deleteById(Long id) {
        itemRepository.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDB() {
        save(new Item("nazwa01", "autor01", "opis01", LocalDate.of(2001, 1, 1), "link_do_zdjecia_01".getBytes(), null,true));
        save(new Item("nazwa02", "autor02", "opis02", LocalDate.of(2002, 2, 2), "link_do_zdjecia_02".getBytes(), null, true));
        save(new Item("nazwa03", "autor03", "opis03", LocalDate.of(2003, 3, 3), "link_do_zdjecia_03".getBytes(), null, true));
        save(new Item("nazwa04", "autor04", "opis04", LocalDate.of(2004, 4, 4), "link_do_zdjecia_04".getBytes(), null, true));
        save(new Item("nazwa05", "autor05", "opis05", LocalDate.of(2005, 5, 5), "link_do_zdjecia_05".getBytes(), null, true));
        save(new Item("nazwa06", "autor06", "opis06", LocalDate.of(2006, 6, 6), "link_do_zdjecia_06".getBytes(), null, true));
        save(new Item("nazwa07", "autor07", "opis07", LocalDate.of(2007, 7, 7), "link_do_zdjecia_07".getBytes(), null, true));
        save(new Item("nazwa08", "autor08", "opis08", LocalDate.of(2008, 8, 8), "link_do_zdjecia_08".getBytes(), null, true));
        save(new Item("nazwa09", "autor09", "opis09", LocalDate.of(2009, 9, 9), "link_do_zdjecia_09".getBytes(), null, true));
        save(new Item("nazwa10", "autor10", "opis10", LocalDate.of(2010, 10, 10), "link_do_zdjecia_10".getBytes(), null, true));

    }

}
