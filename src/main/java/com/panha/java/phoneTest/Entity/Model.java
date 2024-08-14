package com.panha.java.phoneTest.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Models")
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "Medel_id")
    private Integer id;
    @Column(name = "Model_name")
    private String name;
    @ManyToOne
    @JoinColumn(name = "brand_brand_id")
    private Brand brand;

}
