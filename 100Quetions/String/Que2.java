// Write a program to remove all the duplicate characters from a given input String, like, if the given String is "Java" then the output should be "Java". The second or further occurrence of duplicates should be removed

class Que2{
	public static void main(String[] args){
		String s1="Javaa";
		String s2="";
		
		for(int i=0;i<s1.length();i++){

				if(s2.indexOf(s1.charAt(i))==-1)s2+=s1.charAt(i);
		}

		System.out.println(s2);
	}
}