package org.lol.testTask.Task4;

/**
 * Написать метод/функцию,
 * который/которая на вход принимает целое число,
 * а на выходе возвращает то,
 * является ли число простым (не имеет делителей кроме 1 и самого себя).
 */
//10 минут
//оптимизированный алгоритм Решето Эратосфена
public class Main {
    public static boolean isPrimeNumber(int n) {
        if (n == 0) return false;
        if (n == 1) return false;
        if (n == 2) return true;
        for (int i = 2; i < Math.sqrt(n) + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 13;
        System.out.println(isPrimeNumber(n));
    }
}
