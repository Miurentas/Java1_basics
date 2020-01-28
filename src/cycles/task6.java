package cycles;

//6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        for (int a = 0; a<65535;a++){
            char b = (char)a;
            System.out.println(a + " - " + b);
        }
    }
}
