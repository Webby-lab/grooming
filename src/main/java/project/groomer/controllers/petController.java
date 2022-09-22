package project.groomer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import project.groomer.services.PetService;
import project.groomer.services.PetServiceImpl;

@Controller
public class petController {

    PetService petService;

    public petController(PetService petService) {
        this.petService = petService;
    }

    @GetMapping("/")
    public String renderMainPage() {
        return "mainPage";
    }
    @GetMapping("/pets")
        public String renderPetsPage(Model model) {
        model.addAttribute("dogs", petService.getAll());
        return "pets";
    }
}
