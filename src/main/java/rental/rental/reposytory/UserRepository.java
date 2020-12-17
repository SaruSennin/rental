package rental.rental.reposytory;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import rental.rental.entity.User;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByName(String name);

    @Query(value = "SELECT u FROM User u WHERE u.name like CONCAT(:firstLetter,'%')")
    List<User> findByFirstLetter(@Param("firstLetter") String letter);

    @Transactional
    @Modifying
    @Query(value = "INSERT INTO USER_ITEM (USER_ID, ITEM_ID) VALUES (:idUser, :idItem) ", nativeQuery = true)
    void addItemToUser(@Param("idUser") Long idUser, @Param("idItem") Long idItem);
}

