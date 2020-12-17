package rental.rental.reposytory;

import org.springframework.data.repository.CrudRepository;
import rental.rental.entity.RentHistory;

public interface RentHistoryRepository extends CrudRepository<RentHistory, Long> {
}
