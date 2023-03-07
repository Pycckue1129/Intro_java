package org.example.hw3;

/*
3) Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
 */
public class ex3 {
    public static void main(String[] args) {
        int[] array = {4, -63, 20, 7 ,1, 7, -1, -6, -33};
        int sumIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] / 10 < 10 && array[i] / 10 > 0 || array[i] / 10 > -10 && array[i] / 10 < 0){
                sumIndex += i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0){
                array[i] = sumIndex;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
