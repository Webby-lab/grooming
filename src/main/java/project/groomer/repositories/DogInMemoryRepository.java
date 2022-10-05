package project.groomer.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import project.groomer.models.Dog;

import java.util.List;

public interface DogInMemoryRepository extends CrudRepository<Dog, Integer> {
//    @Query(value = "SELECT * FROM dogrepair.dog", nativeQuery = true)
    List<Dog> findAll();
Dog findByName(String name);
}
