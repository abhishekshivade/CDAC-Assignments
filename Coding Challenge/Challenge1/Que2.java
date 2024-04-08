class Que2{
    public static void main(String[] args){
        
        String s= "classrooms";

        char[] chars=s.toCharArray();

        for(int i=0;i<chars.length;i++){
            if(chars[i]>='a' && chars[i]<='z'){
                chars[i]=(char)(chars[i]-'a'+'A');
            }
        }

        System.out.println(new String(chars));
    }
}