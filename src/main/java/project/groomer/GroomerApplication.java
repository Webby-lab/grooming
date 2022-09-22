package project.groomer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import project.groomer.models.Allergies;
import project.groomer.models.Dog;
import project.groomer.repositories.AllergiesRepository;
import project.groomer.repositories.DogInMemoryRepository;

import java.util.Arrays;
import java.util.Collections;

@SpringBootApplication
public class GroomerApplication implements CommandLineRunner {
	private DogInMemoryRepository dogInMemoryRepository;

	private AllergiesRepository allergiesRepository;

	public GroomerApplication(DogInMemoryRepository dogInMemoryRepository, AllergiesRepository allergiesRepository) {
		this.dogInMemoryRepository = dogInMemoryRepository;
		this.allergiesRepository = allergiesRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(GroomerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Allergies allergie = new Allergies("Tej");
		Allergies allergie2 = new Allergies("vaj");
	allergiesRepository.saveAll(Arrays.asList(allergie, allergie2));

		Dog dog1 = new Dog("Pist", 2, Arrays.asList(allergie));
		Dog dog2 = new Dog("Pityu", 2);
		Dog dog3 = new Dog("Liliu", 2);
		Dog dog4 = new Dog("Lilla", 2);
		dogInMemoryRepository.saveAll(Arrays.asList(dog1, dog2, dog3, dog4));

	}
}
