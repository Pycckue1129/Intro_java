package org.example.hw1;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

//1)Вывести список на экран в перевернутом виде (без массивов и ArrayList)
//        Пример:
//        1 -> 2->3->4
//        Вывод:
//        4->3->2->1
public class ex1 {
    public static void main(String[] args) {
        Deque<Integer> someList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        reverseList(someList);
    }

    public static void reverseList(Deque<Integer> someList) {
        Deque<Integer> reverseLinkedList = new LinkedList<>();
        for (Integer el: someList) {
            reverseLinkedList.addFirst(el);
        }
        System.out.println(reverseLinkedList);
    }
}
