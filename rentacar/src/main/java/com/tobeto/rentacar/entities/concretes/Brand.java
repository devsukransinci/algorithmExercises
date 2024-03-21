package com.tobeto.rentacar.entities.concretes;

import com.tobeto.rentacar.core.entities.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.util.List;

@Data //getter setterları oluşturuyor
@AllArgsConstructor //parametreli Constructor oluşturuyor
@NoArgsConstructor //
@Entity  //veri tabanı iletişim kurması için
@Table(name="brands") // veri tabanına map etmek için kullanıyoruz clasın veri tabaınındaki ismini yazıyoruz
// veri tabanında tablo isimleri çogul olur
@EqualsAndHashCode(callSuper = true)
public class Brand extends BaseEntity<Integer> {

    @Column(name="name")
    private String name;

    @OneToMany(mappedBy = "brand")
    private List<Model> models;


}