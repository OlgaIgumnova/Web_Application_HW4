package ru.geekbrains.sem4HW4.service;

import org.springframework.stereotype.Service;
import ru.geekbrains.sem4HW4.domain.Product;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product prod) {
        products.add(prod);
    }
    public List<Product> findAll() {
        return products;
    }
}



