/*
The Java code for printing a mirrored right triangle star pattern is given below:

         *
       * *
     * * *
   * * * *
 * * * * *

*/

public class Que6 {
    public static void main(String[] args) {
        int n=5;

        for(int i=0;i<n;i++){
            for(int j=2*(n-i-1);j>=0;j--) System.out.print(" ");

            for(int j=0;j<=i;j++) System.out.print("* ");
            System.out.println();
        }
    }
}
