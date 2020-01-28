package branch;
//1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
//он прямоугольным.

public class task1 {
    public static void main(String[] args) {
        int A = 30;
        int B = 40;
        int C = 180 - (A + B);
        if (A + B >= 180) {
            System.out.println("the triangle doesn't exist");
        }
        else {
            System.out.println("the triangle exists");
            if (A == 90 || B == 90 || C == 90) {
                System.out.println("The triangle is right");
            }
        }
    }
}
