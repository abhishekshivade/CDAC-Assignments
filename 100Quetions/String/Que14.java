/*
Implement atoi() like function in C/C++/Java to convert a string to an integer. Consider all possible cases e.g. positive and negative String, the presence of + or - character, etc. For example, if the given input String is "123" then your program should return 123 and if a given input is "+231" then your program should return 231.
 */

public class Que14 {
    public static void main(String[] args) {
        String s="+123";

        int result=0;
        int sign=1;
        int i=0;

        if(i<s.length() && (s.charAt(i)=='+' || s.charAt(i)=='-')){
            sign=(s.charAt(i++)== '-')?-1:1;
        }

        while(i<s.length()){
            int digit=s.charAt(i)-'0';

            result=result*10+digit;
            i++;
        }

        System.out.println(result*sign);
    }
}
