package project.groomer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import project.groomer.models.Allergy;
import project.groomer.models.Appointment;
import project.groomer.models.Dog;

import project.groomer.models.Treatment;
import project.groomer.repositories.AppointmentRepository;
import project.groomer.repositories.DogRepository;


import java.time.LocalDateTime;
import java.util.Arrays;

@SpringBootApplication
public class GroomerApplication implements CommandLineRunner {
	private DogRepository dogInMemoryRepository;
	private AppointmentRepository appointmentRepository;

	public GroomerApplication(DogRepository dogInMemoryRepository, AppointmentRepository appointmentRepository) {
		this.dogInMemoryRepository = dogInMemoryRepository;
		this.appointmentRepository = appointmentRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(GroomerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Dog dog1 = new Dog("Pist", 2, Arrays.asList(Allergy.GYÓGYSZER, Allergy.SAMPON));
		Dog dog2 = new Dog("Pityu", 2, Arrays.asList(Allergy.TISZTÍTÓSZER, Allergy.GYÓGYSZER));
		Dog dog3 = new Dog("Liliu", 2, Arrays.asList(Allergy.TISZTÍTÓSZER, Allergy.SAMPON));
		Dog dog4 = new Dog("Lilla", 2, Arrays.asList(Allergy.NONE));

//		Dog dog1 = new Dog("Pist", 2, Allergy.GYÓGYSZER);
//		Dog dog2 = new Dog("Pityu", 2, Allergy.NONE);
//		Dog dog3 = new Dog("Liliu", 2, Allergy.SAMPON);
//		Dog dog4 = new Dog("Lilla", 2, Allergy.ÉLELMISZER);

		dogInMemoryRepository.saveAll(Arrays.asList(dog1, dog2, dog3, dog4));

		Appointment app1 = new Appointment(dog1, LocalDateTime.now(), Treatment.WASH);
		Appointment app2 = new Appointment(dog2, LocalDateTime.now(), Treatment.CUT);

		appointmentRepository.saveAll(Arrays.asList(app1, app2));


	}
}
