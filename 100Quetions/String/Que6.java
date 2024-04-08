// Write a program to reverse a String in C/Java/Python or choice of your programming language. You can write either the recursive or iterative solution. For example, if a given input is "abcd," then your function should return "dcba".

public interface Que6 {

    static String reverse(String s){
        if(s==null || s.length()==1) return s;

        return reverse(s.substring(1))+s.charAt(0);
    }

    public static void main(String[] args) {
        String s="abcd";

        System.out.print(reverse(s));
    }
}
