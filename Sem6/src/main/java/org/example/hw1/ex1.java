package org.example.hw1;

import org.example.hw1.model.Notebook;
import org.example.hw1.model.NotebookStore;

import java.util.*;

//Задание на дом :
//        • Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.Реализовать в java.
//        • Создать множество ноутбуков.
//        • Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
//        отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
//        “Введите цифру, соответствующую необходимому критерию:
//        1 - ОЗУ
//        2 - Объем ЖД
//        3 - Операционная система
//        4 - Цвет …
//        • Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
//        • Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
public class ex1 {
    public static void main(String[] args) {
        NotebookStore store = new NotebookStore();

        Notebook notebook1 = new Notebook("Asus", 8, 256, "Windows", "серый");
        Notebook notebook2 = new Notebook("HP", 16, 512, "Windows", "черный");
        Notebook notebook3 = new Notebook("Lenovo", 4, 128, "Windows", "белый");
        Notebook notebook4 = new Notebook("Apple", 8, 256, "MacOs", "серебристый");

        store.addNotebook(notebook1);
        store.addNotebook(notebook2);
        store.addNotebook(notebook3);
        store.addNotebook(notebook4);

        Scanner scanner = new Scanner(System.in);
        Map<String, Object> filters = new HashMap<>();

        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");
        System.out.println("5 - Модель");

        int filterType = scanner.nextInt();

        switch (filterType) {
            case 1 -> {
                System.out.print("Минимальный объем ОЗУ (в Гб): ");
                int minRam = scanner.nextInt();
                filters.put("ram", minRam);
            }
            case 2 -> {
                System.out.print("Минимальный объем ЖД (в Гб): ");
                int minHdd = scanner.nextInt();
                filters.put("hdd", minHdd);
            }
            case 3 -> {
                System.out.print("Операционная система: ");
                scanner.nextLine();
                String os = scanner.nextLine();
                filters.put("os", os.toLowerCase());
            }
            case 4 -> {
                System.out.print("Цвет: ");
                scanner.nextLine();
                String color = scanner.nextLine();
                filters.put("color", color.toLowerCase());
            }
            case 5 -> {
                System.out.print("Модель: ");
                scanner.nextLine();
                String model = scanner.nextLine();
                filters.put("model", model.toLowerCase());
            }
            default -> {
                System.out.println("Неверный ввод.");
                return;
            }
        }

        store.filter(filters);
    }
}
