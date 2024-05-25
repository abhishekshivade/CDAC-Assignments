/*
The Java code for printing a simple number program is given below:

1
1 1
1 1 1
1 1 1 1
1 1 1 1 1
PS D:\CDAC

*/

public class Que16 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++)
                System.out.print("1 ");

            System.out.println();
        }
    }
}
