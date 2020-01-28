package cycles;

//8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class task8 {
        public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int a, b;
            int number;
            int temp;
            ArrayList<Boolean> list = new ArrayList<>(10);
            for (int i = 0; i < 10; i++) {
                list.add(false);
            }

            System.out.println("Number a = ");
            a = Integer.parseInt(reader.readLine());
            System.out.println("Number b = ");
            b = Integer.parseInt(reader.readLine());

            while (a > 0) {
                number = a % 10;
                a /= 10;
                temp = b;

                while (temp > 0) {
                    if (temp % 10 == number) {
                        list.set(number, true);
                        break;
                    }
                    temp /= 10;
                }
            }

            for (int i = 0; i < 10; i++) {
                if (list.get(i))
                    System.out.print(i + " ");

            }
        }
    }
