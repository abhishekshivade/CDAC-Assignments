/*Write an efficient program to print all permutations of a given String in Java/C/Python or any programming language of your choice. For example, if given input is "123" then your program should print all 6 permutations e.g. "123", "132", "213", "231", "312" and "321".
*/
import java.util.Arrays;

public class Que8 {
    public static void main(String[] args) {
        String s="123";

        char[] chars=s.toCharArray();
        System.out.println(Arrays.toString(chars));
        int n=chars.length;
        
        int[] index=new int[n];

        for(int i=0;i<n;i++){
            index[i]=0;
        }

        int i=0;

        while(i<n){
            if(index[i]<i){
                if(i%2==0){
                    char temp=chars[0];
                    chars[0]=chars[i];
                    chars[i]=temp;
                }else{
                    char temp=chars[index[i]];
                    chars[index[i]]=chars[i];
                    chars[i]=temp;
                }

                System.out.println(Arrays.toString(chars));

                index[i]++;
                i=0;
            }else{
                index[i]=0;
                i++;
            }
        }
    }
}
