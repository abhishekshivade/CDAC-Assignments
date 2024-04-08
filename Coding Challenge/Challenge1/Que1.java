class Que1{
    public static void main(String[] args){
        int[] arr=new int[256];
        int max1=0,max2=0;

        String s="Classrooms";           //acmo2rs3
        s=s.toLowerCase();

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>=97 && c<=122){
                arr[c]++;
            }
        }

        for(int i:arr){
            if(max1<i){
                max2=max1; //max2=2
                max1=i; //max1=3
            }else if(max2<i && max1>i) max2=i;
        }

        System.out.println("2nd most Occurece : ");

        // for(int i:arr){
            for(int i=0;i<arr.length;i++){
            if(arr[i]==max2){
                System.out.print((char)i+" ");
                // break;
            }
       }
    }
}