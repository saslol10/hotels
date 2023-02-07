package org.lol.testTask.Task2;

/**
 * Написать метод/функцию, который/которая на вход принимает число (float),
 * а на выходе получает число, округленное до пятерок.
 * Пример:
 * 27 => 25, 27.8 => 30, 41.7 => 40.
 *
 */
//5-10 минут
public class Main {

    public static float fiveNumbers(float f){
        float x = f % 5;
        float res = 0;
        if(x >= 2.5) {
            res = f - x + 5;
        }
        else {
            res = f - x;
        }
        return res;
    }
    public static void main(String[] args) {
        float f = 27.5f;
        System.out.println(fiveNumbers(f));
    }
}
