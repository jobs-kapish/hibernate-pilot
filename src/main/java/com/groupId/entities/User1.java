package com.groupId.entities;





import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;

    @OneToMany(cascade = CascadeType.ALL)
            @JoinColumn(name = "f_key", referencedColumnName = "id")
    List<Vehicle> vehicles;

    public User1() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Vehicle> getVehicles() {
        if (vehicles == null) vehicles = new ArrayList<>();
        return vehicles;
    }
}
