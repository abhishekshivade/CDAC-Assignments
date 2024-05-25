/*
The Java code for printing the diamond pattern program is given below:

   1
  212
 32123
4321234
 32123
  212
   1

*/

public class Que18 {
    public static void main(String[] args) {
        int n=4;

        for(int i=1;i<=n;i++){

            for(int j=0;j<=n-i;j++)System.out.print(" ");

            int j=i;
            for(;j>=1;j--)System.out.print(j);
            for(j++;j<i;j++)System.out.print(j+1);

            System.out.println();
        }

        for(int i=n-1;i>0;i--){
            for(int j=i;j<=n;j++)System.out.print(" ");
            int j=i;
            for(;j>=1;j--)System.out.print(j);
            for(++j;j<i;j++)System.out.print(j+1);
            
            System.out.println();
        }
    }
}
