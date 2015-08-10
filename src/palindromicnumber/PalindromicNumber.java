package palindromicnumber;

/**
 *
 * @author gaku
 */
public class PalindromicNumber {

    public static int getPalindromicNumber(int input) {
        int reversed;

        while (!PalindromicNumber.isPalindromicNumber(input)) {
            reversed = PalindromicNumber.getReversedNumber(input);
            input += reversed;
        }

        return input;
    }

    public static boolean isPalindromicNumber(int input) {
        int reversed = PalindromicNumber.getReversedNumber(input);
        return input == reversed;
    }

    public static int getReversedNumber(int input) {
        StringBuilder sb = new StringBuilder(String.valueOf(input));
        String reversed = sb.reverse().toString();
        int retval = Integer.parseInt(reversed);
        return retval;
    }
}
