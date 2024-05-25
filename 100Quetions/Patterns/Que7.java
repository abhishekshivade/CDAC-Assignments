/*
 The Java code for printing a reversed pyramid star pattern is given below:

 * * * * * 
  * * * * 
   * * * 
    * * 
     * 
 
 */

public class Que7 {
 public static void main(String[] args) {
    
    int n=5;

    for (int i = n; i >0; i--) {

        for (int j = 0; j <= n - i; j++)
            System.out.print(" ");

        for (int j = 0; j < i; j++)
            System.out.print("* ");

        System.out.println();
    }
 }   
}
