package com.panha.java.phoneTest.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Brands")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "Brand_id")
    private Integer id;

    @Column(name = "Brand_name")
    private String name;

}
