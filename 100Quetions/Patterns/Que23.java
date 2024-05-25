/*
 The Java code for printing a right triangle numeric pattern is given below:

1 
1 2
1 2 3
1 2 3 4
1 2 3 4 5

 */

public class Que23 {
    public static void main(String[] args) {
        int n=5;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++) System.out.print(j+" ");
            System.out.println();
        }
    }    
}
