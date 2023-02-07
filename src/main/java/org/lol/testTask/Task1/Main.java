package org.lol.testTask.Task1;

/**
 * Написать метод/функцию, который/которая на вход принимает массив городов.
 * В качестве результата возвращает строку, где города разделены запятыми, а в конце стоит точка.
 * Пример:
 * «Москва, Санкт-Петербург, Воронеж.»
 */


public class Main {

    public static void printArrStr(String[] str){
        for(int i = 0; i < str.length - 1; i++){
            System.out.print(str[i] + ", ");
        }
        System.out.print(str[str.length - 1] + ".");
    }

    public static void main(String[] args) {
        int n = 3;
        String[] arrStr = new String[n];
        arrStr[0] = "Москва";
        arrStr[1] = "Санкт-Петербург";
        arrStr[2] = "Воронеж";
        printArrStr(arrStr);
    }





}
