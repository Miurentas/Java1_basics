package cycles;


import java.util.Scanner;
/*Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е. Общий член ряда имеет вид*/


public class task5 {
    public static void main(String[] args) {
        int n = 7;
        double e = 0.4;
        double numbers []= new double [n];
        double sum = 0;
        for (int i = 0; i < n; ++i) {
            numbers[i] =Math.abs(1/Math.pow(2, i)+1/Math.pow(3, i));
            System.out.println(numbers[i]);
        }
        for (int i = 0; i < n; i++) {
            if (numbers[i]>=e)
                sum += numbers [i];
        }
        System.out.println("Сумма членов ряда равна: " + sum);
    }
}
