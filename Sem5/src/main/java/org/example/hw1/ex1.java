package org.example.hw1;
import java.util.*;
import java.util.HashMap;

// Подсчитать кол-во вхождений каждого слова
//Россия идет впереди планеты всей. Планета - это не Россия.
public class ex1 {
    public static void main(String[] args) {
        String text = "Россия идет впереди планеты всей. Планета - это не Россия.";
        text = text.replaceAll("[-+.^:,]", "");
        String[] words = text.split(" ");
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                int count = wordCount.get(word);
                wordCount.put(word, count + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        System.out.println("Количество вхождений каждого слова:");
        for (String word : wordCount.keySet()) {
            int count = wordCount.get(word);
            System.out.println(word + ": " + count);
        }
    }
}

