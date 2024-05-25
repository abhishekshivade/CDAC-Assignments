import java.util.Scanner;

/**
 * main
 */
public class InventoryManagementSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Product product= new Product();
        Inventory inventory=new Inventory();
        Report report=new Report();


        int choice=0;
        do{
            System.out.print("Enter your choice : ");
            choice=sc.nextInt();

            System.out.println("Welcome to Inventory Management System.");
            System.out.println("1. Add New product");
            System.out.println("2. Remove Product");
            System.out.println("3. Manage Inventory");
            System.out.println("4. Generate Report");
            System.out.println("5.Exit");


            switch (choice) {
                case 1:
                    //Add product
                    break;

                case 2:
                    //Manage inventory
                    break;

                case 3:
                    //remove prodyct
                    break;
                case 4:
                    //Manage inentory to edit product
                    break;

                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter correct input");
                    break;
            }
        }while(choice!=0);



        sc.close();
    }
}