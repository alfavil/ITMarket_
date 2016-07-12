package entities;

import javax.persistence.*;

@Entity
@Table(name ="items")

public class Item {
@Id
   @GeneratedValue
    int id;
    @Column
    String title;
    @Column
    int price;
    @Column
    String description;


}
