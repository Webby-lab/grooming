package project.groomer.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import project.groomer.models.Dog;
import project.groomer.services.PetService;

import java.util.List;

@RestController
public class PetRestController {

    private PetService petService;

    public PetRestController(PetService petService) {
        this.petService = petService;
    }

    @GetMapping("/api/pets")
    public List<Dog> getDogs() {
        return petService.getAll();
    }
}
