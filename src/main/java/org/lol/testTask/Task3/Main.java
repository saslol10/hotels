package org.lol.testTask.Task3;

/**
 * Написать метод/функцию, который/которая на вход принимает число (int),
 * а на выходе выдает слово “компьютер” в падеже, соответствующем указанному количеству.
 * Например, «25 компьютеров», «41 компьютер», «1048 компьютеров».
 */
//15 минут
public class Main {
    public static String computerStr(int n) {
        String str;
        if(n%100 == 11){
            str = n + " компьютеров";
        }
        else if (n % 10 == 1) {
            str = n + " компьютер";
        } else if (n % 100 == 12 || n % 100 == 13 || n % 100 == 14) {
            str = n + " компьютеров";
        }
        else if(n%10 == 2 || n%10 == 3 || n%10 == 4){
            str = n + " компьютера";
        }
        else str = n + " компьютеров";
        //1, 21, 31... компьютер
        //2, 3, 4, 22, 23, 24, 32, 33, 34... компьютера
        //5 - 20 компьютеров
        return str;
    }
    public static void main(String[] args) {
//        for(int i = 0; i < 1000; i++)
//        System.out.println(computerStr(i));
        System.out.println(computerStr(25));

    }
}
