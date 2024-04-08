    // Write a program to reverse a String in C/Java/Python or choice of your programming language. You can write either the recursive or iterative solution. For example, if a given input is "abcd," then your function should return "dcba".

public interface Que7 {

    public static void main(String[] args) {
        String s="abcd";

        for(int i=s.length()-1;i>=0;i--)
            System.out.print(s.charAt(i));
    }
}
