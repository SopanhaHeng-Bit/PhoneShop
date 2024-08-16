package com.panha.java.phoneTest.Controller;

import com.panha.java.phoneTest.Entity.Brand;
import com.panha.java.phoneTest.Service.BrandService;
import com.panha.java.phoneTest.dto.BrandDTO;
import com.panha.java.phoneTest.mapper.BrandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> create(@RequestBody BrandDTO brandDTO){
        Brand brand = BrandMapper.INSTANCE.toBrand(brandDTO);
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
        Brand brand = BrandMapper.INSTANCE.toBrand(brandDTO);
        Brand Updated = brandService.update(id,brand);
        return ResponseEntity.ok(Updated);
    }

    //    @GetMapping
//    public ResponseEntity<?> getAllBand(){
//        List<Brand> list = brandService.getBrandByName();
//        return ResponseEntity.ok(list);
//    }
    @GetMapping
    public ResponseEntity<?> getAllByName(@RequestParam Map<String, String> params) {
        List<BrandDTO> list = brandService.getBrandByName(params)
                .stream()
                .map(BrandMapper.INSTANCE::toBrandDTO)
                .toList();
        return ResponseEntity.ok(list);
    }
}
