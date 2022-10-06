package project.groomer.repositories;

import org.springframework.data.repository.CrudRepository;
import project.groomer.models.Appointment;

import java.util.List;

public interface AppointmentRepository extends CrudRepository<Appointment, Integer> {
List<Appointment> findAll();
}
