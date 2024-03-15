import java.util.Scanner;

class Grade{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Marks");
        int marks = sc.nextInt();

        if(marks>=75){
            System.out.println("A+");
        }else if(marks>=60){
            System.out.println("A");
        }else if(marks>=45){
            System.out.println("B");
        }else if(marks>=35){
            System.out.println("Pass");
        }else{
            System.out.println("fail");
        }

        sc.close();
    }
}