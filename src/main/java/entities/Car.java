package entities;

import javax.persistence.*;

@Entity
@Table
public class Car {
    @Id
    int idfg;

    @Column(name = "model2")
    String model;
    @Column(name = "year")
    int year;
}
