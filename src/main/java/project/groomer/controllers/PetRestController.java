package project.groomer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.groomer.models.Appointment;
import project.groomer.models.Dog;
import project.groomer.services.AppointmentService;
import project.groomer.services.PetService;

import java.util.List;

@RestController
public class PetRestController {

    private PetService petService;
    private AppointmentService appointmentService;
    @Autowired
    public PetRestController(PetService petService, AppointmentService appointmentService) {
        this.petService = petService;
        this.appointmentService = appointmentService;
    }

    @GetMapping("/api/pets")
    public List<Dog> getDogs() {
        return petService.getAll();
    }

    @GetMapping("api/pets/names")
    public List<String> getDogsNames() {
        return petService.getNames();
    }

    @GetMapping("/api/appointments")
    public List<Appointment> getAllAppointments() {
        return appointmentService.getAllAppointments();
    }

    @PostMapping("/api/pets")
    public ResponseEntity createDod(@RequestBody Dog dog) {
    petService.save(dog);
    return ResponseEntity.status(201).body(dog);
    }

    @DeleteMapping("/api/pets/{dogId}")
    public ResponseEntity deletePet(@PathVariable Integer dogId) {
        petService.deleteDogById(dogId);
        return ResponseEntity.ok().build();
    }
    @PutMapping("/api/appointments/{appId}")
    public ResponseEntity updateAppointment(@PathVariable Integer appId, @RequestBody Appointment appointment) {
        Appointment modifiedAppointment = appointmentService.update(appId, appointment);
        return ResponseEntity.ok(modifiedAppointment);
    }
}
