/* Write an efficient program in Java or C++ to reverse the words in a given String sentence. For example, if the input is "Java is best," then your program should print "best is Java". There is no restriction on preserving white space.
*/
public class Que10 {
    public static void main(String[] args) {
        String s="Java is best";
        String r="";

        String[] arr=s.split(" ");

        for(int i=arr.length-1;i>=0;i--)
            r+=arr[i]+" ";

        System.out.println(r);
    }
}