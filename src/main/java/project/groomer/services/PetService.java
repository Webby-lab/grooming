package project.groomer.services;

import project.groomer.models.Allergies;
import project.groomer.models.Dog;

import java.util.List;

public interface PetService {
    List<Dog> getAll();
    void save(Dog dog);
    List<Allergies> getAllAllergies();
    void saveAllergies(Allergies allergies);
}
