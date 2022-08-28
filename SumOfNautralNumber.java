//Program to find sum of natural numbers using for loop

public class SumOfNautralNumber {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int answer = 0;
        for (int i = 0; a >= i; i++) {
            answer = answer + i;
        }
        System.out.println("Sum of natural number till "+ a+" is "+answer);
    }
}
