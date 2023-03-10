package org.example.hw2.model;

/*
2. Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта. Получить наименования товаров заданного сорта с наименьшей ценой.
 */

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product2 {
    private String productName;
    private String manCountry;
    private Double weight;
    private Double price;
    private Integer sort;
}