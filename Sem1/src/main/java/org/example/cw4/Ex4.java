package org.example.cw4;

public class Ex4 {
    public static void main(String[] args) {
        System.out.println(isArraySymmetrical(new int[]{3, 4, 5, 6, 5, 4, 3}));
    }

    public static boolean isArraySymmetrical(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
