package org.example.hw3;

import org.example.hw3.model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
3. Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно.
 */
public class ex3 {
    public static void main(String[] args) {
        Book book1 = new Book("капитанская дочька", "ПАШКИН", 25.0, 2010, 523);
        Book book2 = new Book("бесы", "ДОСТОЕВСКИЙ", 24.0, 1872, 782);
        Book book3 = new Book("игрок", "ТАРАСОВ", 23.0, 2011, 199);
        Book book4 = new Book("двойник", "ПУШКИН", 22.0, 1836, 735);
        Book book5 = new Book("подросток", "АЛЕКСАНДРОВ", 21.0, 2020, 146);
        Book book6 = new Book("памятник", "АБРАМОВ", 20.0, 1836, 735);
        Book book7 = new Book("метель", "БАЛАШЕВА", 19.0, 2015, 964);

        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);
        bookList.add(book7);

        String primePage = "";


        for (Book el : bookList) {
            int k = 0;
            for (int i = 2; i < el.getSumPage() - 1; i++) {
                if (el.getSumPage() % i == 0) {
                    k++;
                }
            }
            if (k == 0 && el.getYearPublish() >= 2010 && el.getFamilyAuthor().contains("А")) {
                System.out.println(el.getNameBook());
            }
        }
    }
}
