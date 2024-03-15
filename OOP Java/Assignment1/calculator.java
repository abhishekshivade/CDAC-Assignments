import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1");
        int num1 = sc.nextInt();

        System.out.println("Enter number 2");
        int num2 = sc.nextInt();

        System.out.println("Enter your choice\n");
        System.out.println("1. Addition");
        System.out.println("2. Substract");
        System.out.println("3. Multiplication");
        System.out.println("4. Division\n");

        int result=0;
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                result=num1+num2;
                System.out.println(num1+" + "+num2+" = "+result);
                break;
            
            case 2:
                result=num1-num2;
                System.out.println(num1+" - "+num2+" = "+result);
                break;
        
            case 3:
                result=num1*num2;
                System.out.println(num1+" * "+num2+" = "+result);
                break;
        
            case 4:
                result=num1/num2;
                System.out.println(num1+" / "+num2+" = "+result);
                break;
        
            default:
                System.out.println("Wrong choice");
                break;
        }

        sc.close();
    }    
}
