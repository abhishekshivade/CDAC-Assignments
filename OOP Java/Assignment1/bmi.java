import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your weight in kgs");
        float weight = sc.nextFloat();

        System.out.println("Enter your height in mtr");
        float height = sc.nextFloat();

        float bmi = weight / (height*height);

        if (bmi >= 30.0)
            System.out.println("Overweight");
        else if (bmi > 18.5 && bmi < 24.9)
            System.out.println("Normal weight");
        else
            System.out.println("Underweight");

        sc.close();
    }
}
