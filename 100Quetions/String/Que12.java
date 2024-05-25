/*Write an efficient program in Java/C/C++ to check if two String is an anagram of each other. An anagram contains are of the same length and contains the same character, but in a different order, for example, "Army" and "Mary" is the anagram. Your program should return true if both Strings are the anagram, false otherwise */

import java.util.Arrays;

public class Que12 {
    public static void main(String[] args) {
        String s1="Mary";
        String s2="Army";

        boolean flag=false;

        if(s1.length()!=s2.length()) flag=false;

        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        char[] arrS1=s1.toCharArray();
        char[] arrS2=s2.toCharArray();

        Arrays.sort(arrS1);
        Arrays.sort(arrS2);

        if(Arrays.equals(arrS1, arrS2)) flag=true;
        else flag=false;

        if(flag)System.out.println("Strings are Anagram");
        else System.out.println("Strings are not Anagram");
    }    
}