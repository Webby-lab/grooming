package project.groomer.services;

import org.springframework.stereotype.Service;
import project.groomer.models.Dog;

import project.groomer.repositories.DogInMemoryRepository;

import java.util.List;

@Service
public class PetServiceImpl implements PetService {
    DogInMemoryRepository dogInMemoryRepository;


    public PetServiceImpl(DogInMemoryRepository dogInMemoryRepository) {
        this.dogInMemoryRepository = dogInMemoryRepository;
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
    public Dog findByName(String name) {
        return dogInMemoryRepository.findByName(name);
    }




}
