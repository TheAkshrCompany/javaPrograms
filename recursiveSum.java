//Java Program to find recursive sum of digits.
public class recursiveSum {
    public static void main(String[] args){
        String binary=args[0];
        int answer=0;
        int len=binary.length();
        for (int i = 0; i < len; i++) {
         answer=answer+ (binary.charAt(i) -'0');
        }    
        System.out.print(answer);
    }
}
