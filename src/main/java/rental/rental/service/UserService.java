package rental.rental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import rental.rental.entity.User;
import rental.rental.reposytory.UserRepository;

import java.time.LocalDate;
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

    @EventListener(ApplicationReadyEvent.class)
    public void fillDB(){
        save(new User(1L,"Bartek", "Palys", false, "blabla".getBytes(), LocalDate.of(2020,5,30)));
        save(new User(2L,"Iwan", "Grozny", false, "blabla".getBytes(), LocalDate.of(2020,5,30) ));
        save(new User(3L,"Dimitr", "Rozdupcow", false, "blabla".getBytes(), LocalDate.of(2020,5,30) ));
        save(new User(4L,"Tenshou", "Bankai", false, "blabla".getBytes(), LocalDate.of(2020,5,30) ));
        save(new User(5L,"Kame-hame", "Ha", false, "blabla".getBytes(), LocalDate.of(2020,5,30) ));
    }
}

