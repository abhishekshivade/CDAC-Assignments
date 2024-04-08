import java.util.Scanner;

class Calci {

    static Scanner sc = new Scanner(System.in);

    static int readNumerator() {
        System.out.print("Enter Numerator : ");
        int numerator = sc.nextInt();
        return numerator;
    }

    static int readDenominator() {
        System.out.print("Enter Denominator : ");
        int denominator = sc.nextInt();
        return denominator;
    }

    static void add(RationalNumber num1, RationalNumber num2) {
        int n1 = num1.getNumerator();
        int d1 = num1.getDenominator();
        int n2 = num2.getNumerator();
        int d2 = num2.getDenominator();

        int n = (n1 * d2) + (n2 * d1);
        int d = d1 * d2;
        simplify(n, d);
    }

    static void sub(RationalNumber num1, RationalNumber num2) {
        int n1 = num1.getNumerator();
        int d1 = num1.getDenominator();
        int n2 = num2.getNumerator();
        int d2 = num2.getDenominator();

        int n = (n1 * d2) - (n2 * d1);
        int d = d1 * d2;
        simplify(n, d);
    }

    static void mul(RationalNumber num1, RationalNumber num2) {
        int n1 = num1.getNumerator();
        int d1 = num1.getDenominator();
        int n2 = num2.getNumerator();
        int d2 = num2.getDenominator();

        int n = n1 * n2;
        int d = d1 * d2;
        simplify(n, d);
    }

    static void div(RationalNumber num1, RationalNumber num2) {
        int n1 = num1.getNumerator();
        int d1 = num1.getDenominator();
        int n2 = num2.getNumerator();
        int d2 = num2.getDenominator();

        int n = n1 * d2;
        int d = n2 * d1;
        simplify(n, d);
    }

    static void simplify(int n, int d) {
        int gcd = gcd(n, d);
        int numr = n / gcd;
        int denr = d / gcd;
        System.out.println("Result : "+numr + "/" + denr);
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    static void menu(RationalNumber num1, RationalNumber num2) {
        int choice;

        do {
            System.out.println("Rational Number Calculator");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("0. Exit");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    add(num1, num2);
                    break;
                case 2:
                    sub(num1, num2);
                    break;
                case 3:
                    mul(num1, num2);
                    break;
                case 4:
                    div(num1, num2);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Select correct option");
            }
        } while (choice != 0);
    }

    public static void main(String[] args) {
        System.out.println("Enter Num1 : ");
        RationalNumber num1 = new RationalNumber(readNumerator(), readDenominator());

        System.out.println("Enter Num2 : ");
        RationalNumber num2 = new RationalNumber(readNumerator(), readDenominator());

        menu(num1, num2);
    }
}
