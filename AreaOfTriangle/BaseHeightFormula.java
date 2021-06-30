import java.util.*;

public class BaseHeightFormula {
    public static void main(String[] args) {
        float base, height, area;
        System.out.println("Enter Base and Height");
        Scanner sc = new Scanner(System.in);
        base = sc.nextFloat();
        height = sc.nextFloat();
        area = base * height * 0.5f; // area=1f/2f*base*height; //area=base*height/2;
        System.out.println("Area of Triangle is " + area);
        sc.close();
    }
}