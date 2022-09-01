import java.util.Scanner;

public class martixarray {
    public static void main(String[] args) {
        int [][]values=new int[3][3];
        Scanner readeScanner = new Scanner(System.in);
        int largestvalue =0,smallestvalue=0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++) {
                System.out.print("Enter the mark of " +(i+1)+" branch");
                values[i][j]=readeScanner.nextInt();

                if (largestvalue<= values[i][j]) {
                   largestvalue= values[i][j];
                }
                else{
                    smallestvalue= values[i][j];

                }
                if (smallestvalue>= values[i][j]) {
                    smallestvalue= values[i][j];
                 }
            }
        }
        System.out.println(largestvalue+" is the largest value");
        System.out.println(smallestvalue+" is the smallest value");


    }
}
