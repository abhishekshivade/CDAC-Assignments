/*In number theory, a perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself.*/

import java.util.Scanner;

public class Perfect {
    
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    
    System.out.print("Enter number : ");
    int num=sc.nextInt(),res=0;

// calculating sum of divisors
    for(int i=1;i<=num/2;i++){
        if(num%i==0) res+=i;
    }

// checking if res and num are equal
    if(res==num)System.out.println(num+" is a perfect number");
    else System.out.println(num+" is not a perfect number");

    sc.close();
    }
}
