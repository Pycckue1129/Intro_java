package org.example.hw2;

import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        String text1 = "(){}";
        String text2 = "()[]{}";
        String text3 = "(]";
        String text4 = "(){{}";

        System.out.println(isValid(text1));
        System.out.println(isValid(text2));
        System.out.println(isValid(text3));
        System.out.println(isValid(text4));
    }

    public static boolean isValid(String s) {
        String[] arr = s.split("");
        if (arr.length % 2 != 0) {
            return false;
        }
        for (int i = arr.length - 2; i >= 0; i -= 2) {
            if (Objects.equals(arr[i], "(") && !Objects.equals(arr[i + 1], ")")
                    || Objects.equals(arr[i], "{") && !Objects.equals(arr[i + 1], "}")
                    || Objects.equals(arr[i], "[") && !Objects.equals(arr[i + 1], "]")){
                return false;
            }
        }
        return true;
    }
}
