package org.example.hw1.model;


import lombok.AllArgsConstructor;
import lombok.Data;

/*
1. Дан массив записей: наименование товара, цена, сорт. Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
 */
@Data
@AllArgsConstructor
public class Product1 {
    private String productName;
    private Double price;
    private Integer sort;
}
