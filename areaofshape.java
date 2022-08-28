//Java Program to calculate area of circle,rectangle and triangle.
import java.util.Scanner;

public class areaofshape {
    static Scanner readeScanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Area calculator");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.println("Enter your choice");
        int choice = readeScanner.nextInt();
        switch (choice) {
            case 1: circle();break;
            case 2: rectangle();break;
            case 3: triangle();break;
            default: System.out.print("You entered the wrong choice"); break;
        }
    }

    public static void circle() {
        System.out.print("Enter the radius of the circle ");
        float r = readeScanner.nextFloat();
        System.out.println("Area of circle is " + (r * r * 3.14));
    }

    public static void rectangle() {
        System.out.print("Enter the length of the rectangle ");
        float r = readeScanner.nextFloat();
        System.out.print("Enter the breadth of the rectangle ");
        float r1 = readeScanner.nextFloat();
        System.out.println("Area of circle is " + (r * r1));
    }

    public static void triangle() {
        System.out.print("Enter the height of the triangle ");
        float r = readeScanner.nextFloat();
        System.out.print("Enter the base of the triangle ");
        float r1 = readeScanner.nextFloat();
        System.out.println("Area of circle is " + (r * r1 * 0.5));
    }
}
