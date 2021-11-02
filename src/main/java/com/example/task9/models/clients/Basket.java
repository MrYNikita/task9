package com.example.task9.models.clients;

import com.example.task9.models.products.Product;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private Integer id;
    private Integer sum = 0;
    private List<Product> contain = new ArrayList<>();

    private static Integer count = 0;
    private static List<Basket> baskets = new ArrayList<>();

    public Basket(

            List<Product> contain

    ) {

        new Basket(++count,contain);

    }
    public Basket(

            Integer id,
            List<Product> contain

    ) {

        this.id = id;
        this.contain = contain;

        baskets.add(id,this);

    }

}
