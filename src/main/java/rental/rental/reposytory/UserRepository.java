package rental.rental.reposytory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rental.rental.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}

