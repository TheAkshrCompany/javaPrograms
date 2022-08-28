//Java Program to make a Simple Calculator(+,-,*,%,/) 
//using Switch case

import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Remainder");
        System.out.println("Enter your choice");

        Scanner readeScanner = new Scanner(System.in);
        int choice = readeScanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You chose addition");
                System.out.println("Enther first number ");

                Double b = readeScanner.nextDouble();
                System.out.println("Enter Second number ");

                Double c = readeScanner.nextDouble();
                System.out.println("The answer is " + (b + c));

                break;
            case 2:
                System.out.println("You chose Subtraction");
                System.out.println("Enther first number ");

                Double be = readeScanner.nextDouble();
                System.out.println("Enter Second number ");

                Double ce = readeScanner.nextDouble();
                System.out.println("The answer is " + (be - ce));

                break;
            case 3:
                System.out.println("You chose Multiplication");
                System.out.println("Enther first number ");

                Double ba = readeScanner.nextDouble();
                System.out.println("Enter Second number ");

                Double ca = readeScanner.nextDouble();
                System.out.println("The answer is " + (ba * ca));

                break;
            case 4:
                System.out.println("You chose Division");
                System.out.println("Enther first number ");

                Double bg = readeScanner.nextDouble();
                System.out.println("Enter Second number ");

                Double cg = readeScanner.nextDouble();
                System.out.println("The answer is " + (bg /cg));

                break;
            case 5:
                System.out.println("You chose Remainder");
                System.out.println("Enther first number ");

                Double bq = readeScanner.nextDouble();
                System.out.println("Enter Second number ");

                Double cq = readeScanner.nextDouble();
                System.out.println("The answer is " + (bq % cq));

                break;
          
            default:
            System.out.print("You entered the wrong choice");
                break;
        }
    }
}
