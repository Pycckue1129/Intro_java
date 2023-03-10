package org.example.hw2;

import org.example.hw2.model.Product2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
2. Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
Получить наименования товаров заданного сорта с наименьшей ценой.
 */
public class ex2 {
    public static void main(String[] args) {
        Product2 product1 = new Product2("apple", "russia", 0.2, 20.0, 1);
        Product2 product2 = new Product2("peach", "france", 0.3, 19.0, 2);
        Product2 product3 = new Product2("banana", "italy", 0.25, 16.0, 3);
        Product2 product4 = new Product2("raspberries", "azerbaijan", 0.1, 25.0, 1);
        Product2 product5 = new Product2("orange", "russia", 0.22, 20.0, 2);
        Product2 product6 = new Product2("grape", "russia", 0.15, 19.0, 1);

        List<Product2> productList1= new ArrayList<>();
        productList1.add(product1);
        productList1.add(product2);
        productList1.add(product3);
        productList1.add(product4);
        productList1.add(product5);
        productList1.add(product6);

        double lowestPrice = 0;
        double temp = 0;
        String nameProductSorted = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сорт товара : ");
        Integer searchSort = scanner.nextInt();
        for (Product2 el: productList1) {
            temp = el.getPrice();
            lowestPrice = temp;
        }

        for (Product2 el: productList1) {
            if (el.getSort().equals(searchSort) && el.getPrice() < temp) {
                lowestPrice = el.getPrice();
                nameProductSorted = el.getProductName();
            }
        }

        for (Product2 el: productList1) {
            if (el.getSort().equals(searchSort) && el.getPrice() == lowestPrice){
                System.out.println(el.getProductName());
            }
        };
    }
}
