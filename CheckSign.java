//Java Program to check if number is positive or negative

public class CheckSign {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        if (a>=0) {
            System.out.print(a+"  is a positive number");
        }
        else{
            System.out.println(a+" is a negative number");
        }
    }
}
