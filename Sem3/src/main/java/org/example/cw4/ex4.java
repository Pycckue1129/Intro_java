package org.example.cw4;

import org.example.cw4.model.Coub1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class ex4 {
    /**
     * 4. Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.
     */
    public static void main(String[] args) {
        Coub1 coub1 = new Coub1("зеленый", 13, "деревянный");
        Coub1 coub2 = new Coub1("желтый", 73, "металлический");
        Coub1 coub3 = new Coub1("красный", 23, "картонный");
        Coub1 coub5 = new Coub1("красный", 23, "картонный");
        Coub1 coub6 = new Coub1("красный", 23, "картонный");
        Coub1 coub4 = new Coub1("желтый", 3, "металлический");

        List<Coub1> listCoub = new ArrayList<>();
        listCoub.add(coub1);
        listCoub.add(coub2);
        listCoub.add(coub3);
        listCoub.add(coub4);
        listCoub.add(coub5);
        listCoub.add(coub6);
        System.out.println("коллекция "+ listCoub.size());
        System.out.println("уникальная коллекция : "+ unicumCollections(listCoub).size());

    }

    private static Collection<Coub1> unicumCollections(List<Coub1> listCoub) {
        return new HashSet<>(listCoub);
    }
}
