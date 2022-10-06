package project.groomer.services;

import project.groomer.models.Appointment;

import java.util.List;

public interface AppointmentService {
    List<Appointment> getAllAppointments();
   Appointment update(Integer id, Appointment appointment);
}
