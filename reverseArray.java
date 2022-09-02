import java.util.Scanner;;
public class reverseArray {
    public static void main(String[] args) {
        Scanner readeScanner = new Scanner(System.in);
        System.out.print("Enter the row of array- ");

        int m =readeScanner.nextInt();
        System.out.print("Enter the column of array- ");

        int n =readeScanner.nextInt();
        int [][]values=new int[m][n];

        /// for filling the array from the user
        for (int i = 0; i < m; i++) {
            
            for (int j = 0; j < n; j++) {
                System.out.print("Enter the element- ");

                values[i][j]=readeScanner.nextInt();
                 
            }
        }

        /// for reversing the values of in array
        for (int i = 0; i < m; i++) {
            
            for (int j = 0; j < n/2; j++) {
                values[i][j]=values[i][j]+values[i][n/2-j+1];
                values[i][n/2-j+1]=values[i][j]-values[i][n/2-j+1];
                values[i][j]=values[i][j]-values[i][n/2-j+1];
                 
            }
        }
        int[] address;
        for(int i=0;i<m/2;i++){
            
            address=values[i];
            values[i]=values[m/2-i+1];
            values[m/2-i+1]=address;
            
        }



        /// For printing the array 
        for (int i = 0; i < m; i++) {
            
            for (int j = 0; j < n; j++) {
                System.out.print(" "+values[i][j]);
            }
        }
    }
}
