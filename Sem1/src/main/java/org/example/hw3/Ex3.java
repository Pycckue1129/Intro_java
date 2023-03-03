package org.example.hw3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {
        int a1 = Integer.parseInt(a , 2);
        int b1 = Integer.parseInt(b, 2);
        int sum = a1 + b1;
        return Integer.toBinaryString(sum);
    }
}
