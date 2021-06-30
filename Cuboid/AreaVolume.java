package Cuboid;

import java.util.Scanner;

public class AreaVolume {
    public static void main(String[] args) {
        float length, breadth, height;
        double totalArea, volume;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length, breadth and height");
        length = sc.nextFloat();
        breadth = sc.nextFloat();
        height = sc.nextFloat();

        totalArea = 2 * (length * breadth + breadth * height + height * length);
        volume = length * breadth * height;

        System.out.println("Total Area " + totalArea);
        System.out.println("Volume " + volume);
        sc.close();

    }
}
