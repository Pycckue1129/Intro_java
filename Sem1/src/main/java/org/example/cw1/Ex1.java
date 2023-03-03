package org.example.cw1;

import java.util.Scanner;

public class Ex1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            System.out.printf("result : %d",subtractProductAndSum(n));
        }


        public static int subtractProductAndSum(int n) {
            int multi = 1, sum = 0;
            while (n != 0) {
                sum += n % 10;
                multi *= n % 10;
                n /= 10;
            }
            return multi - sum;
        }

    }
