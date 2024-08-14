package com.panha.java.phoneTest.Controller;

import com.panha.java.phoneTest.Entity.Brand;
import com.panha.java.phoneTest.Service.BrandService;
import com.panha.java.phoneTest.dto.BrandDTO;
import com.panha.java.phoneTest.util.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> create(@RequestBody BrandDTO brandDTO){
        Brand brand = Mapper.toBrand(brandDTO);
        brand = brandService.create(brand);
        return ResponseEntity.ok(brand);
    }
    @GetMapping("{id}")
    public ResponseEntity<?> getOneBrand(@PathVariable Integer id){
        Brand brand = brandService.getByID(id);
        return ResponseEntity.ok(brand);
    }

    @PutMapping ("{id}")
    public ResponseEntity<?> updateBrand(@PathVariable Integer id,@RequestBody BrandDTO brandDTO){
        Brand brand = Mapper.toBrand(brandDTO);
        Brand Updated = brandService.update(id,brand);
        return ResponseEntity.ok(Updated);
    }
}
