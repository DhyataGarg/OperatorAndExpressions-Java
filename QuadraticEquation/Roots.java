package QuadraticEquation;

import java.lang.Math;
import java.util.Scanner;

public class Roots {
    public static void main(String[] args) {
        float a, b, c;
        double discriminant, root1, root2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the values of a ,b and c");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();

        discriminant = Math.sqrt(b * b - 4 * a * c);

        root1 = (-b + discriminant) / (2 * a);
        root2 = (-b - discriminant) / (2 * a);
        System.out.println("Roots are " + root1 + " " + root2);
        sc.close();
    }
}
