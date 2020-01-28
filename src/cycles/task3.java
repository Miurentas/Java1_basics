package cycles;

//3. Найти сумму квадратов первых ста чисел.

public class task3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=1; i<=100;i++){
            int n = i*i;
            sum+=n;
        }
        System.out.println("Сумма квадратов первых 100 чисел = " + sum);
    }
}
