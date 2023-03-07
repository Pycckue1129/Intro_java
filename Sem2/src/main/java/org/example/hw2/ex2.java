package org.example.hw2;

import java.util.Scanner;

/*
2) Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
 */
public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int amount = sc.nextInt();
        int num = sc.nextInt();
        boolean flag = false;
        for (int i = 1; i < amount; i++) {
            int num2 = sc.nextInt();
            if (num2 > num){
                num = num2;
                flag = true;
            }else {
                flag = false;
            }
        }
        System.out.println(flag);
    }
}
