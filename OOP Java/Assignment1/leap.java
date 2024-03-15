import java.util.Scanner;

class Leap{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag = 0;

        int year = sc.nextInt();

        if(year%100==0){
            flag=1;
        }else{
            flag=0;
        }

        switch (flag) {
            case 0:
                if (year % 4 == 0) {
                    System.out.println(year + " is leap year");
                } else {
                    System.out.println(year + " Not a leap year");
                }
                break;

            case 1:
                if (year % 400 == 0) {
                    System.out.println(year + " is leap year");
                } else {
                    System.out.println(year + " Not a leap year");
                }
                break;

            default:
                break;
        }

        sc.close();
    }
}
