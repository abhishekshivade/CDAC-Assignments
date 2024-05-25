/*Write an efficient Java/c/Python function that takes two strings as arguments and removes the characters from the first string, which are present in the second string. For example, if the first String "India is great" and the second String is "in" then the output should be "da s great"
*/
public class Que4 {
	public static void main(String[] args){
		String s1="India is great";
		String s2="in";

		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		for(int i=0;i<s2.length();i++){
		//for(char c:s2){
			char c = s2.charAt(i);
			//if(s1.contains(c)){
				s1=s1.replace(String.valueOf(c),"");
			//}
		}

		System.out.println(s1);
	}
}
