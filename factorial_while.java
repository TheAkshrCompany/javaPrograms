//Java Program to find factorial using while loop
public class factorial_while {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int i=1;
        int answer=1;
        while (a>=i) {
            answer = answer *i;
            i++;
        }
        System.out.println("Factorial of "+ a+" is "+answer);        
    }
}
