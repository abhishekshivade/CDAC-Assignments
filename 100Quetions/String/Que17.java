/*Write a program to count a number of words in a given String. The words are separated by the following characters: space (‘ ‘) or newline (‘\n’) or tab (‘\t’) or a combination of these. For example, if input "Java is great" your program should print 3.*/

public class Que17 {
  public static void main(String[] args) {
    String s="Java is great";
    
    // String[] arr=s.split(" ");

    // System.out.println(arr.length);

    
    if(s.isEmpty()){
        System.out.println("empty string");
        return;
    }

    int count=1;

    for(int i=0;i<s.length();i++){
        if(s.charAt(i)==' ' || s.charAt(i)=='\t' || s.charAt(i)=='\n') count++;
    }

    System.out.println(count);
  }  
}
