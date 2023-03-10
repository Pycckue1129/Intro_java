package org.example.hw1;

import org.example.hw1.model.Product1;

import java.util.ArrayList;
import java.util.List;

/*
1. Дан массив записей: наименование товара, цена, сорт. Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
 */
public class ex1 {
    public static void main(String[] args) {
        Product1 product = new Product1("apple higher", 29.0, 1);
        Product1 product1 = new Product1("peach", 16.0, 3);
        Product1 product2 = new Product1("banana higher", 45.0, 2);
        Product1 product3 = new Product1("raspberries", 20.0, 3);
        Product1 product4 = new Product1("orange", 18.0, 2);

        List<Product1> productList= new ArrayList<>();
        productList.add(product);
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);

        double highestPrice = 0;
        double temp = 0;
        for (Product1 el : productList) {
            if (el.getProductName().endsWith("higher") && (el.getSort().equals(1) || el.getSort().equals(2))) {
                temp = el.getPrice();
                if(el.getPrice() > highestPrice) {
                    highestPrice = temp;
                }
            }
        }
        System.out.println("highestPrice : " + highestPrice);
    }
}
