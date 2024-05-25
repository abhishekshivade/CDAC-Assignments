/*This is the reverse of problem 17, In this problem, you need to write a function in Java/C or C++ to convert a given integer into an equivalent Roman numeral. For example, if a given integer is 5, then your program should print "V".*/

public class Que20 {

    public static String intToRoman(int num) {
        String[] romanSymbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

        StringBuilder roman = new StringBuilder();
        int index = 0;

        while (num > 0) {
            if (num >= values[index]) {
                roman.append(romanSymbols[index]);
                num -= values[index];
            } else {
                index++;
            }
        }

        return roman.toString();
    }

    public static void main(String[] args) {
        int num = 19;
        System.out.println(num + " : " + intToRoman(num));
    }
}
