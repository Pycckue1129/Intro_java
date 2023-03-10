package org.example.hw3.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/*
3. Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно.
 */
@Data
@AllArgsConstructor
public class Book {
    private String nameBook;
    private String familyAuthor;
    private Double price;
    private Integer yearPublish;
    private Integer sumPage;
}
