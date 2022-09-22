package project.groomer.models;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Entity
public class Dog extends Pet{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer age;
    @Enumerated(EnumType.STRING)
    private Allergies allergies;
    private List<Allergies> all = new ArrayList<Allergies>();

//    @Column(length = 200)
//    private List<String> allergies = new ArrayList<>();

    public Dog() {

    }

    public Dog(String name, Integer age) {

        this.name = name;
        this.age = age;
    }

    public Dog(String name, Integer age, List<Allergies> all) {
        this.name = name;
        this.age = age;
        this.all = all;
    }

    public List<Allergies> getAll() {
        return all;
    }

    public void setAll(List<Allergies> all) {
        this.all = all;
    }
    //    public Dog(String name, Integer age, List<String> allergies) {
//
//        this.name = name;
//        this.age = age;
//        this.allergies = allergies;
//    }


    public Dog(String name, Integer age, Allergies allergies) {
        this.name = name;
        this.age = age;
        this.allergies = allergies;
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

    public Allergies getAllergies() {
        return allergies;
    }

    public void setAllergies(Allergies allergies) {
        this.allergies = allergies;
    }

    @Override
    public String toString() {
        return all.toString();
    }
    //    public List<String> getAllergies() {
//        return allergies;
//    }
//
//    public void setAllergies(List<String> allergies) {
//        this.allergies = allergies;
//    }
//
//    @Override
//    public String toString() {
//        return allergies.toString();
//    }
}
