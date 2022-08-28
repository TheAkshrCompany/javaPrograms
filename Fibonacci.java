//Program to print Fibonacci Series using for loop
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
       
        System.out.print("till now many pairs of numbers you want to print for this series - ");
        Scanner readeScanner=new Scanner(System.in);
        int b = readeScanner.nextInt();
        
        int a = 0;
        int c=1;
        for (int i = 1; b >= i; i++) {
            System.out.print(" "+a+ " "+ c+" ");
            a=a+c;
            c=a+c;

        }
        
    }
}
