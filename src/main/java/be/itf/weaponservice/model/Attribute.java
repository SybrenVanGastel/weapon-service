package be.itf.weaponservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "attributes")
public class Attribute {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private double scaleFactor;
    @ManyToOne
    @JsonIgnore
    private Weapon weapon;

    public Attribute() {
    }

    public Attribute(String name, double scaleFactor, Weapon weapon) {
        this.name = name;
        this.scaleFactor = scaleFactor;
        this.weapon = weapon;
    }

    public Attribute(String name, double scaleFactor) {
        this.name = name;
        this.scaleFactor = scaleFactor;
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

    public double getScaleFactor() {
        return scaleFactor;
    }

    public void setScaleFactor(double scaleFactor) {
        this.scaleFactor = scaleFactor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
