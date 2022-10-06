package project.groomer.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "appointments")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    private Dog dog;
    private LocalDateTime date;
    @Enumerated(EnumType.STRING)
    private Treatment treatment;

    public Appointment() {
    }

    public Appointment(Dog dog, LocalDateTime date, Treatment treatment) {
        this.dog = dog;
        this.date = date;
        this.treatment = treatment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Treatment getTreatment() {
        return treatment;
    }

    public void setTreatment(Treatment treatment) {
        this.treatment = treatment;
    }
}
