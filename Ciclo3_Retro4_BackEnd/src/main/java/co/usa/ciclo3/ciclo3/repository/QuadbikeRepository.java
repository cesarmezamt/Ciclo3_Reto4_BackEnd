package co.usa.ciclo3.ciclo3.repository;

/**
 *
 * @author César Alerto Meza González CC79429945
 */

import co.usa.ciclo3.ciclo3.model.Quadbike;
import co.usa.ciclo3.ciclo3.repository.crud.QuadbikeCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class QuadbikeRepository {

    @Autowired
    private QuadbikeCrudRepository quadbikeCrudRepository;
     
    public List<Quadbike> getAll(){
        return (List<Quadbike>) quadbikeCrudRepository.findAll();
    }
    public Optional<Quadbike> getQuadbike(int id){
        return  quadbikeCrudRepository.findById(id);
    }

    public Quadbike save(Quadbike quadbike){
        return quadbikeCrudRepository.save(quadbike);
    }
    
    public void delete(Quadbike quadbike){
       quadbikeCrudRepository.delete(quadbike);
    }

}
