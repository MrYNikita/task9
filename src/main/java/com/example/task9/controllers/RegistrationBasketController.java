package com.example.task9.controllers;

import com.example.task9.models.products.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistrationBasketController {

    @GetMapping("/shopping")
    public String shopping(
            Model model

    ) {

        model.addAttribute("products", Product.getProducts());
        return "shopping";

    }

}
