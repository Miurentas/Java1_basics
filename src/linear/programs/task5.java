package linear.programs;
/*5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.*/

public class task5 {
     public static void main(String[] args) {
            int T = 345693;
            int Hour = T/3600;
            int Min = (T%3600)/60;
            int Sec = (T%3600)%60;
            System.out.print(Hour + "ч " + Min + "мин " + Sec + "с.");
    }
}
