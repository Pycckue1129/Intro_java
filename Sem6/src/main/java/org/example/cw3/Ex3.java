package org.example.cw3;

//3) Найти пересечения слов в массивах и указать их общее количество.
//        Пример:
//        Mas1= [“qwe”,”asd”,”qwe”,”x”]
//        Mas2=[“qwe”,”v”]
//        Результат:
//        qwe=3

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex3 {
    public static void main(String[] args) {
        List<String> inputArray1 = new ArrayList<>(List.of("qwe","asd","zxc", "v", "v"));
        List<String> inputArray2 = new ArrayList<>(List.of("qwe","v"));

        Set<String> cross = new HashSet<>(inputArray1);
        List<String> all = new ArrayList<>(inputArray1);
        all.addAll(inputArray2);
        cross.retainAll(inputArray2);

        for(String item : cross){
            int count = 0;
            for (String allItem : all){
                if(item.equals(allItem)) count++;
            }
            System.out.println(item + " " + count);
        }
    }
}



//public class Ex3 {
//    public static void main(String[] args) {
//        List<String> inputArray1 = new ArrayList<>(List.of("qwe","asd","zxc", "v", "v"));
//        List<String> inputArray2 = new ArrayList<>(List.of("qwe","v"));
//
//        Set<String> cross = new HashSet<>(inputArray1);
//        List<String> all = new ArrayList<>(inputArray1);
//        all.addAll(inputArray2);
//        cross.retainAll(inputArray2);
//
//        Map<String, Integer> count2 = new HashMap<>();
//        for(String item : cross){
//            int count = 0;
//            for (String allItem : all){
//                if(item.equals(allItem)){
//                    count++;
//                    Integer itemCount = count2.get(item);
//                    if(itemCount == null) itemCount = 0;
//                    itemCount++;
//                    count2.put(item, itemCount);
