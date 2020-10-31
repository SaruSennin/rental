package rental.rental.reposytory;

import org.springframework.data.repository.CrudRepository;
import rental.rental.entity.Item;

public interface ItemRepository extends CrudRepository<Item, Long>{


}
