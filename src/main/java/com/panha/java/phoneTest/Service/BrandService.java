package com.panha.java.phoneTest.Service;

import com.panha.java.phoneTest.Entity.Brand;

import java.util.List;

public interface BrandService{
    Brand create (Brand brand);
    Brand getByID(Integer id);
    Brand update(Integer id, Brand nameUpdate);
    List<Brand> getAllBrand();
    List<Brand> getBrandByName(String name);
}
