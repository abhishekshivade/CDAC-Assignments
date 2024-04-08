// Write a program in any programming language you to find the first non-repeated character in a given String, for example, if the given String is "Java" then the first non-repeated character is "J"

public class Que9 {
    public static void main(String[] args) {
        String s="jjava";
        char[] chars=new char[256];

        for(int i=0;i<s.length();i++){
            chars[s.charAt(i)]++;
        }
        
        for(int i=0;i<s.length();i++){
            if(chars[s.charAt(i)]==1){
                System.out.println(s.charAt(i));
                break;
            }
        }
    }
}
