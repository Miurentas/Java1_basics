package cycles;

//7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
//m и n вводятся с клавиатуры

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in) ;
        int m = scr.nextInt();
        int n = scr.nextInt();
        if (n>0 && m>0) {
            for (int i = m; i<=n; i++) { // перечисляем все числа от m до n
                for (int j = 2; j <= i-1; j++) { // проверяем возможные делители
                    if (i % j == 0) {
                        System.out.println("для числа " + i + " делитель " + j);
                    }
                }
            }
        }
        else System.out.println("введите натуральное число");
    }
}
