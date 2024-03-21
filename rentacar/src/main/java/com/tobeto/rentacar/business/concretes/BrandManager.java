package com.tobeto.rentacar.business.concretes;

import com.tobeto.rentacar.business.abstracts.BrandService;
import com.tobeto.rentacar.business.requests.create.brand.CreateBrandRequest;
import com.tobeto.rentacar.business.responses.get.brand.GetAllBrandResponse;
import com.tobeto.rentacar.dataAccess.abstracts.BrandRepository;
import com.tobeto.rentacar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//bu Bir servise baglı oldugu için bunu IOC yapısına dahil etmemiz lazım
// Çünkü bir class bir interface'i implamente ediyor başına Service yazdıgımızda bu görevi yapıyor
@Service
@AllArgsConstructor //Repository Constructera dahil ediyoruz
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;

    @Override
    public void add(CreateBrandRequest request) {
Brand brand =new Brand();

        brandRepository.save(brand);
    }

    @Override
    public List <GetAllBrandResponse> getAll() {
       List<Brand> brands =brandRepository.findAll();
       List <GetAllBrandResponse> brandResponses =
               new ArrayList<GetAllBrandResponse>();
       for (Brand brand:brands){
           GetAllBrandResponse getAllBrandResponse =new GetAllBrandResponse();
           getAllBrandResponse.setId(brand.getId());
           getAllBrandResponse.setBrandName(brand.getName());

           brandResponses.add(getAllBrandResponse);
       }
       return brandResponses;


    }

}
