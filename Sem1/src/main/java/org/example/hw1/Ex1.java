package org.example.hw1;

//public class Ex1 {
//    public static void main(String[] args) {
//        String s = " the sky is   blue ".replaceAll("\\s+", " ");
//        System.out.println(s);
//        String[] arr = s.split(" ");
//        for (int i = arr.length - 1; i > 0; i--) {
//            if (i != 1) {
//                System.out.print(arr[i] + " ");
//            }else {
//                System.out.print(arr[i]);
//            }
//        }
//    }
//}

public class Ex1 {
    public static void main(String[] args) {
    reverseWords("  a good   example");
    }

    public static void reverseWords(String s) {
        s = s.replaceAll("\\s+", " ");
        s = s.trim();
        String[] arr = s.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arr[i] + " ");
            } else {
                System.out.print(arr[i]);
            }
        }
    }
}