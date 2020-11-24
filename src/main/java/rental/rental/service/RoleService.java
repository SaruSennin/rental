package rental.rental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import rental.rental.entity.Role;
import rental.rental.entity.UserItem;
import rental.rental.reposytory.RoleRepository;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class RoleService {

    private RoleRepository roleRepository;

    @Autowired
    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }


    public Optional<Role> findById(Long id){
        return roleRepository.findById(id);
    }

    public Iterable<Role> findAll(){
        return roleRepository.findAll();
    }

    public Role save (Role role){
        return roleRepository. save(role);
    }

    public void deleteById(Long id){
        roleRepository.deleteById(id);
    }


    @EventListener(ApplicationReadyEvent.class)
    public void fillDB(){
        save(new Role(1L,"admin"));
        save(new Role(2L,"user"));
    }
}
