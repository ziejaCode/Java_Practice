package academy.learnprogramming;

public class characters_char {

    public static void main(String[] args) {


        /**
         * char occupy 16 bytes of memory or 2bits
         * its 1 0 0 0 0 0 1 0 1 0 0 0 0 0 1 0 - places in binary number
         */
        char myChar = 'D';

        // char can store unicode
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);


        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;
    }
}
