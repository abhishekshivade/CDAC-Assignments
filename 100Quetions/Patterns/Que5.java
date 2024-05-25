/*
The Java code for printing a downward triangle star pattern is given below:

* * * * * 
* * * * 
* * * 
* * 
* 

*/

public class Que5 {
    public static void main(String[] args) {
        int n=5;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++) System.out.print("* ");
            System.out.println();
        }
    }
}
