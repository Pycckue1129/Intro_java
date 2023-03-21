package org.example.hw1.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class NotebookStore {
    public List<Notebook> notebooks = new ArrayList<>();

    public void addNotebook(Notebook notebook) {
        notebooks.add(notebook);
    }

    public void filter(Map<String, Object> filters) {
        List<Notebook> filteredNotebooks = new ArrayList<>();

        for (Notebook notebook : notebooks) {
            boolean flag = true;

            for (Map.Entry<String, Object> filter1 : filters.entrySet()) {
                switch (filter1.getKey()) {
                    case "ram" -> {
                        if (notebook.getRam() > (int) filter1.getValue()) {
                            flag = false;
                        }
                    }
                    case "hdd" -> {
                        if (notebook.getHdd() < (int) filter1.getValue()) {
                            flag = false;
                        }
                    }
                    case "os" -> {
                        if (!notebook.getOs().equals(filter1.getValue())) {
                            flag = false;
                        }
                    }
                    case "color" -> {
                        if (!notebook.getColor().equals(filter1.getValue())) {
                            flag = false;
                        }
                    }
                    case "model" -> {
                        if (!notebook.getModel().equals(filter1.getValue())) {
                            flag = false;
                        }
                    }
                }
                if (!flag) {
                    break;
                }
            }
            if (flag) {
                filteredNotebooks.add(notebook);
            }
        }

        if (filteredNotebooks.isEmpty()) {
            System.out.println("Ноутбуков, удовлетворяющих условиям фильтрации, не найдено.");
        } else {
            System.out.println("Список ноутбуков для заданных критериев:");
            for (Notebook notebook : filteredNotebooks) {
                System.out.println(notebook.toString());
            }
        }
    }
}