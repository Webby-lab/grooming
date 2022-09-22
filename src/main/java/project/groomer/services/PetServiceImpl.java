package project.groomer.services;

import org.springframework.stereotype.Service;
import project.groomer.models.Allergies;
import project.groomer.models.Dog;
import project.groomer.repositories.AllergiesRepository;
import project.groomer.repositories.DogInMemoryRepository;

import java.util.List;
@Service
public class PetServiceImpl implements PetService {
    DogInMemoryRepository dogInMemoryRepository;
AllergiesRepository allergiesRepository;

    public PetServiceImpl(DogInMemoryRepository dogInMemoryRepository, AllergiesRepository allergiesRepository) {
        this.dogInMemoryRepository = dogInMemoryRepository;
        this.allergiesRepository = allergiesRepository;
    }

    @Override
    public List<Dog> getAll() {
        return dogInMemoryRepository.findAll();
    }

    @Override
    public void save(Dog dog) {
    dogInMemoryRepository.save(dog);
    }

    @Override
    public List<Allergies> getAllAllergies() {
        return allergiesRepository.findAll();
    }

    @Override
    public void saveAllergies(Allergies allergies) {
    allergiesRepository.save(allergies);
    }
}
