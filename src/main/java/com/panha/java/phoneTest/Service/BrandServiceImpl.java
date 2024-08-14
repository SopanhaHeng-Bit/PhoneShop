package com.panha.java.phoneTest.Service;


import com.panha.java.phoneTest.Entity.Brand;
import com.panha.java.phoneTest.Exception.ResourceException;
import com.panha.java.phoneTest.Repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl implements BrandService{
    @Autowired
    private BrandRepository brandRepository;
    @Override
    public Brand create(Brand brand) {
        return brandRepository.save(brand);
    }

    @Override
    public Brand getByID(Integer id) {
        return brandRepository.findById(id)
//                .orElseThrow(()-> new ApiException(HttpStatus.NOT_FOUND,String.format("Brand with id = %d not found",id)));
                .orElseThrow(()-> new ResourceException("Brand",id));
    }

    @Override
    public Brand update(Integer id, Brand nameUpdate) {
        Brand brand = getByID(id);
        brand.setName(nameUpdate.getName());
        return brandRepository.save(brand);
    }

}
