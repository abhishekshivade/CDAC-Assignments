public class Que5 {
    public static void main(String[] args) {
        int[] arr1={-2,5,1,-10,5};
        int[] arr2={-2,-10};
        // int[] arr1={10,-4,2,0,2,3,7};
        // int[] arr2={7,3,-4,0,3,2};
        boolean flag=false;
        int min=arr1[0];

        for(int i:arr1){
            for(int j:arr2){
                if(i==j){
                    flag=true;
                    break;
                }else{
                    flag=false;
                    // if(min>i) min=i;
                }
            }

            if(!flag) System.out.print(i);
        }
        
        // if(flag) System.out.print(min);
    }
}
