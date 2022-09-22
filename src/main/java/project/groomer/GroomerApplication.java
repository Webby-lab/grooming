package project.groomer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import project.groomer.models.Allergies;
import project.groomer.models.Dog;
import project.groomer.repositories.DogInMemoryRepository;

import java.util.Arrays;

@SpringBootApplication
public class GroomerApplication implements CommandLineRunner {
	private DogInMemoryRepository dogInMemoryRepository;

	public GroomerApplication(DogInMemoryRepository dogInMemoryRepository) {
		this.dogInMemoryRepository = dogInMemoryRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(GroomerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Dog dog1 = new Dog("Pist", 2, Allergies.TEJ);
		Dog dog2 = new Dog("Pityu", 2, Allergies.VAJ);
		Dog dog3 = new Dog("Liliu", 2, Allergies.TEJ);
		Dog dog4 = new Dog("Lilla", 2, Allergies.VAJ);
		dogInMemoryRepository.saveAll(Arrays.asList(dog1, dog2, dog3, dog4));

	}
}
