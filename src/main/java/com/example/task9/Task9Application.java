package com.example.task9;

import com.example.task9.methods.StringMethods;
import com.example.task9.models.products.Category;
import com.example.task9.models.products.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Task9Application {

	public static void main(String[] args) {

		SpringApplication.run(Task9Application.class, args);

		StringMethods.printLine();

		StringMethods.printHeader("генерация_товаров");

		new Product("хлеб",1000, Category.FOOD);
		new Product("яйца",7800,Category.FOOD);
		new Product("пакет_молока",800, Category.FOOD);

		StringMethods.printHeader("работа_приложения");

		StringMethods.printInfo("ожидается_подключение_к_сайту");

	}

}
