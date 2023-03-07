package org.example.hw1;

import java.util.Scanner;

/*
Дана последовательность N целых чисел. Найти сумму простых чисел
 */
public class ex1 {
    public static void main(String[] args) {
        System.out.println("Введите количество чисел: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Введите число: ");
            int num = sc.nextInt();
            boolean flag = true;
            if (num == 1){
                flag = false;
            }
            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                sum += num;
            }
        }
        System.out.println("Сумма простых чисел: " + sum);
    }
}
