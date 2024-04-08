import java.util.Scanner;

public class PrimeFact {

    static boolean isPrime(int n){
        boolean flag=false;
        if(n<=3) flag=true;
        else{
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    flag=false;
                    break;
                }else flag=true;
            }
        }
        
        return flag;
    }

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n=sc.nextInt();

        System.out.print("Prime factors of "+n+" : ");

	// cheking factors upto 100 are prime or not
        for(int i=2;i<100;i++){
            if(n%i==0 && isPrime(i)){
                System.out.print(i+", ");
            }
        }

        sc.close();
    }
}
