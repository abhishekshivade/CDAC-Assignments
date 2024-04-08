// Write an efficient program to test if two given String is a rotation of each other or not, e.g. if the given String is "XYZ" and "ZXY" then your function should return true, but if the input is "XYZ" and "YXZ" then return false.

public class Que5 {
    public static void main(String[] args) {
        String s1="xyz";
        String s2="yxz";
        boolean flag=false;

        if(s1.length()==s2.length()){
            for(int i=0,j=s1.length()-1;i<s1.length();i++,j--){
                if(s1.charAt(i)==s2.charAt(j)){
                    flag=true;
                }else{
                    flag=false;
                    break;
                }
            }
        }else flag=false;

        
        System.out.println("Strings s1 and s2 are "+flag);
    }
}
