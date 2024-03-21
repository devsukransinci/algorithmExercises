package com.tobeto.rentacar.webApi.controllers;

import com.tobeto.rentacar.business.abstracts.BrandService;
import com.tobeto.rentacar.business.requests.create.brand.CreateBrandRequest;
import com.tobeto.rentacar.business.responses.get.brand.GetAllBrandResponse;
import com.tobeto.rentacar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
@AllArgsConstructor
public class BrandsController {
    private BrandService brandService;

    @PostMapping
  public void add(@RequestBody CreateBrandRequest request){

        brandService.add(request);
  }
  @GetMapping("getall")
  public List<GetAllBrandResponse>getAll(){
        return brandService.getAll();
  }


}
