package project.groomer.repositories;

import org.springframework.data.repository.CrudRepository;
import project.groomer.models.Allergies;

import java.util.List;

public interface AllergiesRepository extends CrudRepository<Allergies, String> {
    List<Allergies> findAll();
}
