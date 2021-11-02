package com.example.task9;

import com.example.task9.models.products.Category;
import com.example.task9.models.products.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class Handler {

    @RequestMapping(path = "/products",method= RequestMethod.POST)
    private String doUpdate(

            @ModelAttribute("input_name") String name,
            @ModelAttribute("input_count") String count

    ) {

        Product p = Product.getProduct(name);

        if (p != null) {

            if (count.equals("")) {

                count = "0";
                p.setBuy();

            }

            p.setCount(p.getCount() + Integer.parseInt(count));

            if (p.getCount() < 0) {

                Product.removeProduct(name);

            }
        } else {

            if (Integer.parseInt(count) > 0) {

                new Product(name,Integer.parseInt(count),Category.DEFAULT);

            }

        }

        return "redirect:/shopping";
    }

}
