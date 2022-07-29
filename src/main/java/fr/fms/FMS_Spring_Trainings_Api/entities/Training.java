package fr.fms.FMS_Spring_Trainings_Api.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Training  {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private double price;
    private int quantity;
    private String imgURL;
    private Long catId;

    @ManyToOne
    private Category category;

    public Training(String name, String description, double price, int quantity, String imgURL, Long catId) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.imgURL = imgURL;
        this.catId = catId;
    }

    public Training(Long id, String name, String description, double price, int quantity, String imgURL, Category category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.imgURL = imgURL;
        this.category = category;
    }

    public Training(String name, String description, double price, int quantity, String imgURL, Category category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.imgURL = imgURL;
        this.category = category;
    }
}
