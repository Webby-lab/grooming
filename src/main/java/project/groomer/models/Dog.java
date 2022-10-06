package project.groomer.models;

import javax.persistence.*;
import java.util.*;

@Entity
public class Dog extends Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer age;
    private List<Allergy> allergies;
    @OneToOne(mappedBy = "dog" , cascade = {CascadeType.REMOVE, CascadeType.REFRESH})
    private Appointment appointment;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name, Integer age, List<Allergy> allergies) {
        this.name = name;
        this.age = age;
        this.allergies = allergies;
    }

    public Dog(String name, Integer age, List<Allergy> allergies, Appointment appointment) {
        this.name = name;
        this.age = age;
        this.allergies = allergies;
        this.appointment = appointment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Allergy> getAllergies() {
        return allergies;
    }

    public void setAllergies(List<Allergy> allergies) {
        this.allergies = allergies;
    }


}

