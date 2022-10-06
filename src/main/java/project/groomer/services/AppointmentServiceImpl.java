package project.groomer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.groomer.models.Appointment;
import project.groomer.repositories.AppointmentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    private AppointmentRepository appointmentRepository;
    @Autowired
    public AppointmentServiceImpl(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @Override
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    @Override
    public Appointment update(Integer id, Appointment appointment) {
        Optional<Appointment> toModifie = appointmentRepository.findById(id);
        Appointment modifiedApp = modifyAppointment(toModifie.get(), appointment);
        appointmentRepository.save(modifiedApp);
        return modifiedApp;
    }

    private Appointment modifyAppointment(Appointment toModify, Appointment appointment1) {
    toModify.setDate(appointment1.getDate());
    toModify.setTreatment(appointment1.getTreatment());
    return toModify;
    }


}
