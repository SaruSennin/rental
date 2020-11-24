package rental.rental.reposytory;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import rental.rental.entity.User;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByName(String name);

    @Query("SELECT u FROM User u WHERE u.name like CONCAT(:firstLetter,'%')")
    List<User> findByFirstLetter(@Param("firstLetter") String letter);
}

