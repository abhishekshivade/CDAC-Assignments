/*Write an efficient program in your favorite programming language to check if a Given a string is a palindrome, considering only alphanumeric characters and ignoring cases. For example,"121" is a palindrome, but "123" is not. Your function should return true if given String is a palindrome, false otherwise*/

public class Que13 {
    public static void main(String[] args) {
        String s="123";

        s=s.toLowerCase();

        boolean flag=false;

        for(int i=0,j=s.length()-1;i<=s.length()/2;i++,j--){
            if(s.charAt(i)==s.charAt(j)) flag=true;
            else{
                flag=false;
                break;
            }
        }

        if(flag)System.out.println(s+" is a palindrome");
        else System.out.println(s+" is not a palindrome");
    }
}
