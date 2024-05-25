/*
The Java code for printing a pyramid is given below:

    *
   * *
  * * *
 * * * *
* * * * *

*/

import java.util.Scanner;

class Que1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            
            for(int j=0;j<n-i;j++)
                System.out.print(" ");

            for(int j=0;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }

        sc.close();
    }
}