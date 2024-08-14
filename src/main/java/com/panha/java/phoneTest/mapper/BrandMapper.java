package com.panha.java.phoneTest.mapper;

import com.panha.java.phoneTest.Entity.Brand;
import com.panha.java.phoneTest.dto.BrandDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BrandMapper {
    BrandMapper INSTANCE = Mappers.getMapper(BrandMapper.class);
    Brand toBrand(BrandDTO brandDTO);
    BrandDTO toBrandDTO(Brand entity);
}
