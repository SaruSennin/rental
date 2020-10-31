package rental.rental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rental.rental.entity.Role;
import rental.rental.service.RoleService;

import java.util.Optional;


@RestController
@RequestMapping("/api/role")
public class RoleController {

    private RoleService roleService;

    @Autowired
    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping("/all")
    public Iterable<Role> getAll(){
        return  roleService.findAll();
    }

    @GetMapping
    public Optional<Role> getById(@RequestParam Long index){
        return roleService.findById(index);
    }

    @PostMapping
    public Role addRole(@RequestBody Role role){
        return  roleService.save(role);
    }

    @PutMapping
    public Role updateRole(@RequestParam Role role){
        return  roleService.save(role);
    }

    @DeleteMapping
    public void deleteRole(@RequestParam Long index){
        roleService.deleteById(index);
    }
}
