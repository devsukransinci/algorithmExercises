package org.example;

import java.text.DecimalFormat;

public class PruductManager implements IProductService{

    @Override
    public void Sell(Product product, Customer customer) {

        Double price = product.Price;

        if (customer.IsStudent){
         price=   product.Price * (double) 0.90;

        }
    }
}
