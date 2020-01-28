package linear.programs;
/*6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
принадлежит закрашенной области, и false — в противном случае: */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String k = reader.readLine();
        int x = Integer.parseInt(s);
        int y = Integer.parseInt(k);
        boolean result;
        if (x<=2 && y<=4) {
            result = true;
        } else if (x<=4 && y<=-3 ){
            result = true;
        } else if (x<=-4 && y<=-3) {
            result = true;
        } else if (x<=-2 && y<=4) {
            result = true;
        } else result = false;
        System.out.println(result);
    }
}
