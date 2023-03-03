package org.example.hw2;

import java.util.Scanner;

//2) Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму
//        положительных чисел, после которых следует отрицательное число.
//        Пример ввода:
//        1 2 1 2 -1 1 3 1 3 -1 0
//        Логика расчета:
//        2 -1 переход -> 2 в сумму
//        3 -1 переход -> 3 в сумму
//        Пример вывода: 5
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = 1;
        int a = sc.nextInt();
        if (a == 0){
            return;
        }
        while (n != 0){
            n = sc.nextInt();
            if (n < 0 && a > 0) {
                sum += a;
            }
            a = n;
        }
        System.out.println("Summ : " + sum);
    }
}
