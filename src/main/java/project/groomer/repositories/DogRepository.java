package project.groomer.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import project.groomer.models.Dog;

import java.util.List;

public interface DogRepository extends CrudRepository<Dog, Integer> {

    List<Dog> findAll();
    Dog findByName(String name);

        @Query(value = "SELECT name FROM dogrepair.dog", nativeQuery = true)
    List<String> findAllNames();
    void deleteById(Integer id);
}
