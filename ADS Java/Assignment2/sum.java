import java.util.Scanner;

class Sum {

    static int sum(int num){
        if(num==0) return 0;
	 
	// adding num and passing decremented to function
        else return num+sum(num-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num=sc.nextInt();

        System.out.println(sum(num));

        sc.close();
    }
}
