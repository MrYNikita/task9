package com.example.task9.models.products;

import com.example.task9.methods.StringMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Product {

    private String name;
    private Boolean buy = false;
    private Integer id;
    private Integer count = 0;
    private Category category;

    private static Integer diversity = 0;
    private static List<Product> products = new ArrayList<>();

    public Product(

            String name,
            Category category

    ) {

        new Product(name,0,category);

    }
    public Product(

            String name,
            Integer count,
            Category category

    ) {

        new Product(diversity++,count,name,category);

    }
    public Product(

            Integer id,
            Integer count,
            String name,
            Category category

    ) {

        this.id = id;
        this.name = name;
        this.count = count;
        this.category = category;

        Product.products.add(this.id,this);

        StringMethods.printInfo(
                new String[] { "Наименование","Количество" },
                new String[] { name,count.toString() }
        );

    }

    public void setId(Integer id) {
        Product.products.remove(id);
        this.id = id;
        Product.products.add(id,this);
    }
    public void setBuy() {
        this.buy = !this.buy;
    }
    public void setBuy(Boolean buy) {
        this.buy = buy;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCount(Integer count) {
        this.count = count;
    }
    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return this.name;
    }
    public Integer getId() {
        return this.id;
    }
    public Boolean getBuy() {
        return this.buy;
    }
    public Integer getCount() {
        return this.count;
    }
    public Category getCategory() {
        return this.category;
    }
    public static List<Product> getProducts() {
        return products;
    }

    public static void removeProduct(String name) {

        Product.products.remove(Product.getProduct(name));

    }
    public static void removeProduct(Integer id) {


        Product.products.remove(id);

    }

    public static Product getProduct(String name) {

        for (Product p : Product.products) {

            if (Objects.equals(p.getName(), name)) {

                return p;

            }
        }

        return null;
    }

}
