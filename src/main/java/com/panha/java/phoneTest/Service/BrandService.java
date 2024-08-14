package com.panha.java.phoneTest.Service;

import com.panha.java.phoneTest.Entity.Brand;

public interface BrandService{
    Brand create (Brand brand);
    Brand getByID(Integer id);
    Brand update(Integer id, Brand nameUpdate);
}
