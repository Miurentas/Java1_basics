package linear.programs;

public class task3 {
    public static void main(String[] args) {
        double x = 90;
        double y = 30;
        double z = ((Math.sin(x) + Math.cos(y))/(Math.cos(x) -Math.sin(y)))*Math.tan(x*y);
        System.out.println("выражение z = " + z);
    }
}
