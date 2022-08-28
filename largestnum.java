//Java Program to find the largest of three numbers using if..else..if
public class largestnum {
    public static void main(String args[]) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if (a > b) {
            if (b > c) {
                System.out.print(a + " is greatest number");

            }
        } else if (b > c) {
            if (b > a) {
                System.out.print(b + " is greatest number");

            }
        } else {
            System.out.print(c + " is greatest number");
        }
    }
}