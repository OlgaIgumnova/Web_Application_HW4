package ru.geekbrains.sem4HW4.domain;

import lombok.Data;

@Data
public class Product {

    private int id; // Идентификатор

    private String phoneModel; //Модель телефона

    private String manufacturer; //Производитель

    private double price; // Цена

}
