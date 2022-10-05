package project.groomer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import project.groomer.models.Allergy;
import project.groomer.models.Dog;

import project.groomer.models.Treatment;
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

		Dog dog1 = new Dog("Pist", 2, Arrays.asList(Allergy.GYÓGYSZER, Allergy.SAMPON), Treatment.WASH);
		Dog dog2 = new Dog("Pityu", 2, Arrays.asList(Allergy.TISZTÍTÓSZER), Treatment.CUT);
		Dog dog3 = new Dog("Liliu", 2, Arrays.asList(Allergy.TISZTÍTÓSZER), Treatment.DRY);
		Dog dog4 = new Dog("Lilla", 2, Arrays.asList(Allergy.NONE), Treatment.CUT);

//		Dog dog1 = new Dog("Pist", 2, Allergy.GYÓGYSZER);
//		Dog dog2 = new Dog("Pityu", 2, Allergy.NONE);
//		Dog dog3 = new Dog("Liliu", 2, Allergy.SAMPON);
//		Dog dog4 = new Dog("Lilla", 2, Allergy.ÉLELMISZER);

		dogInMemoryRepository.saveAll(Arrays.asList(dog1, dog2, dog3, dog4));



	}
}
