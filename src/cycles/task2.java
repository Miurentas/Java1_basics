package cycles;

public class task2 {
    public static void main(String[] args) {
        int a =5;
        int b = 10;
        int h = 3;
        double y;
        for (int x = a; x<=b; x+=h){
            if (x>2){
                y = x;
                System.out.println("Значение функции = " + y);
            }if (x<=2){
                y = -x;
                System.out.println("Значение функции = " + y);            }
        }
    }
}
