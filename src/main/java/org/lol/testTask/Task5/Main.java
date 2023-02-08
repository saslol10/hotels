package org.lol.testTask.Task5;

import javax.print.attribute.SetOfIntegerSyntax;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


/**
 * Написать метод, который определяет,
 * какие элементы присутствуют в двух экземплярах в каждом из массивов
 * (= в двух и более, причем в каждом). На вход подаются два массива.
 * На выходе массив с необходимыми совпадениями.
 * Пример:
 * [7, 17, 1, 9, 1, 17, 56, 56, 23], [56, 17, 17, 1, 23, 34, 23, 1, 8, 1]
 * На выходе [1, 17]
 */
public class Main {

    public static Object[] doubleNumberArr(int[] arr1, int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        Set<Integer> temp = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        for(int i = 0; i< arr1.length-1; i++){
            for(int j = i+1; j < arr1.length;j++) {
                if (arr1[i] == arr1[j]) {
                    temp.add(arr1[i]);;
                }
            }
        }
        Integer[] newTemp = temp.toArray(Integer[]::new);
        int count = 0;
        for(Integer x: newTemp){
            count = 0;
            for(int j = 0; j < arr2.length; j++){
                if (x == arr2[j]) {
                    count++;
                }
            }
            if(count>=2){
                res.add(x);
            }
        }
        return res.toArray();
    }
    public static void main(String[] args) {
        int[] arr1 = {7, 17, 1, 9, 1, 17, 56, 56, 23};
        int[] arr2 = {56, 17, 17, 1, 23, 34, 23, 1, 8, 1};
        System.out.println(Arrays.toString(doubleNumberArr(arr1, arr2)));
    }
}
