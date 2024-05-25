/*Write an efficient method in Java to remove all occurrences of a given character in Java. For example, if the given String is "Programming" and the given character to remove is "m" then your function should return "Prograing".
*/
public class Que16 {
    public static void main(String[] args) {
        String s="Programming";

        while(s.contains("m")){
            s=s.replace("m", "");
        }

        System.out.println(s);
    }
}
