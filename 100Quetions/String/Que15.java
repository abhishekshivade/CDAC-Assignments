/*Write a function in your favorite programming language to convert a given Roman numeral to equivalent String. For example, if the given String is "X" then your program should print 10. Input will be within the range from 1 to 2000. You can also ignore case, like both "x" and "X" should return 10
*/
public class Que15 {

    static int value(String s) {
        s = s.toUpperCase();

        int result = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int key = getValue(c);

            if (key < prev)
                result -= key;
            else
                result += key;

            prev = key;
        }

        return result;
    }

    static int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default : return 0;
        }
    }

    public static void main(String[] args) {
        String s = "xIV";

        System.out.println(value(s));
    }
}
