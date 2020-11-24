package rental.rental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import rental.rental.entity.User;
import rental.rental.reposytory.UserRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> findById(Long id){
        return userRepository.findById(id);
    }

    public Iterable<User> findAll(){
        return userRepository.findAll();
    }

    public User save(User user){
        return userRepository.save(user);
    }

    public void deleteById(Long id){
        userRepository.deleteById(id);
    }

    public List<User> findByName(String userName){
        return userRepository.findByName(userName);
    }

    public List<User> findByFirstLetter(String firstLetter){
        return userRepository.findByFirstLetter(firstLetter);
    }




    @EventListener(ApplicationReadyEvent.class)
    public void fillDB(){
        save(new User(1L,"Naruto", "Uzumaki", false, "link_do_zdjecia_01".getBytes(), LocalDate.of(2001,1,1)));
        save(new User(2L,"Iwan", "Grozny", false, "link_do_zdjecia_02".getBytes(), LocalDate.of(2002,2,2) ));
        save(new User(3L,"Dimitr", "Rozdupcow", false, "link_do_zdjecia_03".getBytes(), LocalDate.of(2003,3,3) ));
        save(new User(4L,"Son", "Goku", false, "link_do_zdjecia_04".getBytes(), LocalDate.of(2004,4,4) ));
        save(new User(5L,"Chin", "Chan", false, "link_do_zdjecia_05".getBytes(), LocalDate.of(2005,5,5) ));
        save(new User(6L,"Rick", "Sanchez", false, "link_do_zdjecia_06".getBytes(), LocalDate.of(2006,6,6)));
        save(new User(7L,"Morty", "Smith", false, "link_do_zdjecia_07".getBytes(), LocalDate.of(2007,8,8) ));
        save(new User(8L,"Robert", "Makłowicz", false, "link_do_zdjecia_08".getBytes(), LocalDate.of(2008,9,9) ));
        save(new User(9L,"Jacek", "Sasin", false, "link_do_zdjecia_09".getBytes(), LocalDate.of(70000000,7,7) ));
        save(new User(10L,"Donald", "Trump", false, "link_do_zdjecia_10".getBytes(), LocalDate.of(2010,10,10) ));
    }
}

