package project.groomer.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import project.groomer.models.Dog;

import java.util.List;

public interface DogRepository extends CrudRepository<Dog, Integer> {

    List<Dog> findAll();
    Dog findByName(String name);
    void deleteById(Integer id);

        @Query(value = "SELECT name FROM dogrepair.dogs", nativeQuery = true)
    List<String> findAllNames();

        @Query(value = "SELECT * FROM dogrepair.dogs order by name asc", nativeQuery = true)
    List<Dog> findAllSortedByName();

}
