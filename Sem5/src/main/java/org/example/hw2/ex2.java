package org.example.hw2;

import java.util.*;

//Подсчитать кол-во искомого слова, через map (наполнением значение, где искомое
//слово будет являться ключом), вносить все слова не нужно
//
public class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = "Россия идет впереди планеты всей. Планета - это не Россия а а а";
        System.out.println("Введите слово:");
        String word1 = scan.nextLine().toLowerCase();
        text = text.replaceAll("[-+.^:,]", "").toLowerCase();
        String[] words = text.split(" ");
        Map<String, Integer> wordCount = new HashMap<>();
        int count1 = 0;
        wordCount.put(word1, 0);
        for (String word : words) {
            if (word1.equals(word)) {
                int count = wordCount.get(word);
                wordCount.put(word, count + 1);
            }
        }

        for (String word : wordCount.keySet()) {
            if (Objects.equals(word, word1)){
                int count = wordCount.get(word);
                System.out.println("Количество вхождений искомого слова " + count + " раза");
            }
        }
    }
}
