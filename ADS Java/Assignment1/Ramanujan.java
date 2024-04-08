/*the sum of two perfect cubes is equal to sum of two different perfect cubes. 12³+1³=10³+9³=1729*/

import java.util.Scanner;

public class Ramanujan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = sc.nextInt();

        int sum1 = 0, sum2 = 0;

	// loops for finding cube 
        for (int a = 1; a*a*a< num; a++) {
            for (int b = a + 1; b*b*b < num; b++) {
                for (int c = a + 1; c*c*c < num; c++) {
                    for (int d = c + 1; d*d*d < num; d++) {

			// adding cube of a and b, c and d 
                        sum1 = a*a*a+b*b*b;
                        sum2 = c*c*c+d*d*d;

			// checking sum are equal or not
                        if (sum1 == sum2 && sum1 == num){
                            System.out.println(num + " is a Ramanujan number");
                            sc.close();
                            return;
                        }
                    }
                }
            }
        }
        System.out.println(num+" is not a Ramanujan number");

        sc.close();
    }
}
