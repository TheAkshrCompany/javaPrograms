//Java Program to find Fibonacci using while loop
import java.util.Scanner;

public class Fibonacci_whileLoop {
    public static void main(String[] args){
        System.out.print("till now many pairs of numbers you want to print for this series - ");
        Scanner readeScanner=new Scanner(System.in);
        int b = readeScanner.nextInt();
        int i=0;
        int a = 0;
        int c=1;
        while (b>i) {
            System.out.print(" "+a+ " "+ c+" ");
            a=a+c;
            c=a+c;
            i++;
        }
    }
}
