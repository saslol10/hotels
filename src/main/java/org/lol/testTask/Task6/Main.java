package org.lol.testTask.Task6;

/**
 * Написать метод, который в консоль выводит таблицу умножения.
 * На вход метод получает число, до которого выводит таблицу умножения.
 * В консоли должна появиться таблица. Например, если на вход пришло число 5, то получим:
 *   1  2  3  4  5
 * 1 1  2  3  4  5
 * 2 2  4  6  8 10
 * 3 3  6  9 12 15
 * 4 4  8 12 16 20
 * 5 5 10 15 20 25
 *
 * Важно:
 * В последней строке между числами ровно по одному пробелу должно выводиться.
 * В каждом столбце числа должны быть выровнены по правому краю.
 */
//20-30 минут
public class Main {

    public static void multiTable(int n){
        String[][] table = new String[n+1][n+1];
        int[] strLens = new int[n+1];
        table[0][0] = " ";
        for(int k = 1; k < n + 1; k++) {
            table[0][k] = "" + k;
        }

        for(int i = 1; i < n + 1; i++) {
            table[i][0] = "" + i;
            for (int j = 1; j < n + 1; j++) {
                table[i][j] = "" + i * j;
                strLens[j] = table[i][j].length();
            }

        }
        strLens[0] = table[n][0].length();
        for(int i = 0; i < n + 1; i++){
            for(int j = 0; j < n + 1; j++){
                while(table[i][j].length()!= strLens[j]){
                    table[i][j] = " " + table[i][j];
                }
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int n = 10;
        multiTable(n);
    }
}
