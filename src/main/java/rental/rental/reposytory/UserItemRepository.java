package rental.rental.reposytory;

import org.springframework.data.repository.CrudRepository;
import rental.rental.entity.UserItem;

public interface UserItemRepository extends CrudRepository<UserItem, Long> {
}
