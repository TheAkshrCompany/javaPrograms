//Java Program to check whether a char is vowel or 
//Consonant using Switch Case

public class VowelCheck {
    public static void main(String[] args) {
        switch (args[0]) {
            case "a":
                System.out.println(args[0] + " is a vowel");

                break;
            case "e":
                System.out.println(args[0] + " is a vowel");

                break;
            case "i":
                System.out.println(args[0] + " is a vowel");

                break;
            case "o":
                System.out.println(args[0] + " is a vowel");

                break;
            case "u":
                System.out.println(args[0] + " is a vowel");

                break;
            default:
            System.out.println(args[0] + " is not a vowel");

                break;
        }

    }
}
