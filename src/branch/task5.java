package branch;

public class task5 {
    public static void main(String[] args) {
        double x = 4;
        double y;
        if (x<=3) {
            y = x*x - 3*x + 9;
            System.out.println("Значение функции = " + y);
        }
        if (x>3) {
            y = 1/(x*x*x + 6);
            System.out.println("Значение функции = " + y);
        }
    }
}
