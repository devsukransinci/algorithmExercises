package org.example;

import java.text.DecimalFormat;

public class Product implements IEntity {

    public  int Id;
    public String Name;
    public double Price;

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


}
