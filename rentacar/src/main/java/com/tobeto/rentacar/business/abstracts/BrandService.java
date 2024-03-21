package com.tobeto.rentacar.business.abstracts;

import com.tobeto.rentacar.business.requests.create.brand.CreateBrandRequest;
import com.tobeto.rentacar.business.responses.get.brand.GetAllBrandResponse;
import com.tobeto.rentacar.entities.concretes.Brand;

import java.util.List;

public interface BrandService {

    void add(CreateBrandRequest request);
    List<GetAllBrandResponse> getAll();
}
