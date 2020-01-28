package linear.programs;


public class task2 {
    public static void main(String[] args) {
        double b = 2;
        double a = 3;
        double c = 4;
        double z = (b + Math.sqrt(Math.pow (b,2) + 4*a*c))/2*a - Math.pow(a,3) + Math.pow(b,-2);
        System.out.println("значение z = " + z);

    }
}
