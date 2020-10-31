package rental.rental.reposytory;

import org.springframework.data.repository.CrudRepository;
import rental.rental.entity.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
}
