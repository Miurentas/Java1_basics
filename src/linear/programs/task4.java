package linear.programs;
/*4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
дробную и целую части числа и вывести полученное значение числа.*/

public class task4 {
    public static void main(String[] args) {
        double R = 345.643;
        double N = R*1000;
        double D = N%1000;
        N -= D;
        double RNew = D + N/1000000;
        System.out.println("Новое значение R = " + RNew);
    }
}
