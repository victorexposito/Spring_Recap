package kea.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "cats")
public class Cat {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;
    private int age;
    private String color;
    private String name;

    public Cat(int age, String color, String name) {
        this.age = age;
        this.color = color;
        this.name = name;
    }



    public Cat() {
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
