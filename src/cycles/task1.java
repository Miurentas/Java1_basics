package cycles;

//1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
//все числа от 1 до введенного пользователем числа.

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        if (num>0){
            for (int n = 1; n<=num; n++) {
                sum+=n;
            }
        }
        else System.out.println("Введите целое положительное число");
        System.out.println("Sum = " + sum);
    }
}
