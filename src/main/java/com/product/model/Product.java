package com.product.model;

import javax.persistence.*;

@Entity
@Table( name = "products" )
public class Product {
    @Id
    private int id;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private String imageUrl;

    public Product() {
    }

    public Product(int id, String name, String description, String imageUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
