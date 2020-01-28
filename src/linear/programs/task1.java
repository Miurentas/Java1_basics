package linear.programs;

//1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.

public class task1 {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        int c = 5;
        double z = (double)((a-3)*b/2) + c;
        System.out.println("z = " + z);
    }
}
