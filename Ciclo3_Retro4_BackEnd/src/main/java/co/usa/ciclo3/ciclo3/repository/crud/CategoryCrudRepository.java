package co.usa.ciclo3.ciclo3.repository.crud;

/**
 *
 * @author César Alerto Meza González CC79429945
 */

import co.usa.ciclo3.ciclo3.model.Category;
import org.springframework.data.repository.CrudRepository;


public interface CategoryCrudRepository extends CrudRepository<Category,Integer> {
    
}

