
import java.util.Scanner;

class Vehicle {
    String name ="wr-v";
    int price=1050000;
    String category="SUV";

    public void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("Price : " + price);
        System.out.println("Category : " + category);
    }

    public void setDetails() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Vehicle Name");
        name = sc.nextLine();

        System.out.println("Enter price");
        price=sc.nextInt();

        System.out.println("Enter category");
        category=sc.next();

        sc.close();
    }

    public void setDetails(String name, int price, String category){
        this.name=name;
        this.price=price;
        this.category=category;
    }

    public void setDetails(String n, int p){
        this.name=n;
        this.price=p;
    }
}
