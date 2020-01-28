package branch;

//3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class task3 {
    public static void main(String[] args) {
        double x1 = 4, y1 = 2;
        double x2 = -3, y2 = 2;
        double x3 = 3, y3 = -4;
        double m1 = (y2 - y1)/(x2 - x1);
        double m2 = (y3 - y2)/(x3 - x2);
        if (m1 == m2) {
            System.out.println("Точки на одной прямой");
        }
        else System.out.println( "Точки не на одной прямой");
    }

}
