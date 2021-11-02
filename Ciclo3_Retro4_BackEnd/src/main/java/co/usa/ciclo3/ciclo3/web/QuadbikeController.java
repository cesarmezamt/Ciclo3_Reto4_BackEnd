package co.usa.ciclo3.ciclo3.web;

/**
 *
 * @author César Alerto Meza González CC79429945
 */

import co.usa.ciclo3.ciclo3.model.Quadbike;
import co.usa.ciclo3.ciclo3.service.QuadbikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Quadbike")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})

public class QuadbikeController {

    @Autowired
    private QuadbikeService quadbikeService;

    @GetMapping("/all")
    public List<Quadbike> getQuadbike(){
        return quadbikeService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Quadbike> getQuadbike(@PathVariable("id") int qbikeId){
        return quadbikeService.getQuadbike(qbikeId);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Quadbike save(@RequestBody Quadbike quadbike){
        return quadbikeService.save(quadbike);
    }
    
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Quadbike update(@RequestBody Quadbike quadbike) {
        return quadbikeService.update(quadbike);
    }
    
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int qbikeId) {
        return quadbikeService.deleteQuadbike(qbikeId);
    } 
    
    




}
