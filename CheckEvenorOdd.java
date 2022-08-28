// Java Program to check if number is even or odd
public class CheckEvenorOdd {

    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);

        if (a%2==1) {
            System.out.println(a+" is odd number");
        } else {
            System.out.println(a+" is even number");

        }
    }
}