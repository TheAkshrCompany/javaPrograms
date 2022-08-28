//Java Program to find equvelent hexadecimal number of given binary number.
public class hexadecimaltobinary {
    public static void main(String[] args){
        String binary=args[0];
        int len=binary.length();
        for (int i = 0; i < len; i++) {
           value(binary.charAt(i));
        }        
       

      }
      public static void value(char a){
        switch(a){
            case 48: System.out.print("0000");break;
            case '1': System.out.print("0001");break;
            case '2': System.out.print("0010");break;
            case '3': System.out.print("0011");break;
            case '4': System.out.print("0100");break;
            case '5': System.out.print("0101");break;
            case '6': System.out.print("0110");break;
            case '7': System.out.print("0111");break;
            case '8': System.out.print("1000");break;
            case '9': System.out.print("1001");break;
            case 'A': System.out.print("1010");break;
            case 'B': System.out.print("1011");break;
            case 'C': System.out.print("1100");break;
            case 'D': System.out.print("1101");break;
            case 'E': System.out.print("1110");break;
            case 'F': System.out.print("1111");break;


        }
      
    }
    
}
