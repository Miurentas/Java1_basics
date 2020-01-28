package branch;
//2. Найти max{min(a, b), min(c, d)}

public class task2 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 8;
        int d = 6;
        int min1;
        int min2;
        int max;

        if (a<b) min1 = a;
        else min1 = b;

        if (c<d) min2 = c;
        else min2 = d;

        if (min1<min2) max = min2;
        else max = min1;

        System.out.println("Max = " + max);

    }
}
