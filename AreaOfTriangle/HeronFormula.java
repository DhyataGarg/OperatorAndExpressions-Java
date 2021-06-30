import java.lang.Math;
import java.util.Scanner;

public class HeronFormula {
    public static void main(String[] args) {
        float a, b, c;
        double s, area;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Sides of a Triangle");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();

        s = (a + b + c) / 2f;

        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of Triangle is " + area);
        sc.close();
    }
}
