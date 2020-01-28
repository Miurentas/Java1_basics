package branch;
//4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
//отверстие.

public class task4 {
    public static void main(String[] args) {
        int A = 1, B = 1;
        int x = 3, y = 5, z = 9;
        boolean result;

        if (x <= A && y <= B) {
            result = true;
        } else if (x <= A && z <= B) {
            result = true;
        } else if (y <= A && z <= B) {
            result = true;
        } else {
            result = false;
        }

        if (x <= B && y <= A) {
            result = true;
        } else if (x <= B && z <= A) {
            result = true;
        } else if (y <= B && z <= A) {
            result = true;
        } else {
            result = false;
        }

        if (result) {
            System.out.println("Кирпич проходит через отверстие");
        } else {
            System.out.println("Кирпич не проходит через отверстие");
        }
    }
}

