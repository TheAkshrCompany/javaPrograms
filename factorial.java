// Java Program to find factorial of a number using loops
public class factorial {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int answer = 1;
        for (int i = 1; a >= i; i++) {
            answer = answer *i;
        }
        System.out.println("Factorial of "+ a+" is "+answer);        
        
    }
}
