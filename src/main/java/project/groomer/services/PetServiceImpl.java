package project.groomer.services;

import org.springframework.stereotype.Service;
import project.groomer.models.Dog;

import project.groomer.repositories.DogRepository;

import java.util.List;

@Service
public class PetServiceImpl implements PetService {
    DogRepository dogRepository;


    public PetServiceImpl(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    @Override
    public List<Dog> getAll() {
        return dogRepository.findAll();
    }

    @Override
    public void save(Dog dog) {
    dogRepository.save(dog);
    }

    @Override
    public Dog findByName(String name) {
        return dogRepository.findByName(name);
    }

    @Override
    public List<String> getNames() {
        return dogRepository.findAllNames();
    }

    @Override
    public void deleteDogById(Integer id) {
        dogRepository.deleteById(id);
    }


}
