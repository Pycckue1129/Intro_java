package org.example.cw3;

public class ex3 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 2, 5, 7, 3, 9, 4, 2, 1}));
    }

    public static int solution(int[] inputArr){
        int count = 0;
        for (int i = 1; i < inputArr.length; i++) {
            if (inputArr[i - 1] == inputArr[i] * 2) {
                count ++;
            }
        }
        return count;
    }
}


