package com.panha.java.phoneTest.util;

import com.panha.java.phoneTest.Entity.Brand;
import com.panha.java.phoneTest.dto.BrandDTO;

public class Mapper {
    public static Brand toBrand(BrandDTO dto){
        Brand brand = new Brand();
        brand.setId(dto.getId());
        brand.setName(dto.getName());
        return brand;
    }

}
