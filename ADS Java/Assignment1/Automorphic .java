/*A number is called an Automorphic number if and only if its square ends in the same digits as the number itself.*/

import java.util.Scanner;;

class Automorphic{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number : ");
        int num=sc.nextInt();

// calculating square and converting to string
        int sq=num*num;
        String numstr= String.valueOf(num);
        String sqstr=String.valueOf(sq);

// chehcking square end with number or not
        if(sqstr.endsWith(numstr)) System.out.println(num+" is an automorphic number");
        else System.out.println(num+" is not an automorphic number");

        sc.close();
    }
}
