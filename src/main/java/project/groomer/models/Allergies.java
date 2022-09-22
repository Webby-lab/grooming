package project.groomer.models;

import javax.persistence.*;

@Entity
public class Allergies {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Id
    private String name;

    public Allergies() {
    }

    public Allergies(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
