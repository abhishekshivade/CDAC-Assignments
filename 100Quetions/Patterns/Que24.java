/*
The Java code for printing a ones pattern is given below:

    1
   111
  11111
 1111111
111111111

 */

public class Que24 {
    public static void main(String[] args) {
        int n=5;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++) System.out.print(" ");

            for(int k=1;k<=(2*i)-1;k++) System.out.print("1");

            System.out.println();
        }
    }
}
