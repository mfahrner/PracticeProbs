package com.theironyard.charlotte;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

    }
//    The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6.
//    Or if their sum or difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.

    public static boolean love6(int a, int b) {
        if (a == 6 || b == 6) {
            return true;
        } else if ((a + b) == 6 || (a -b) == 6) {
            return true;
        }
        else {
            return false;
        }

    }

//    Return true if the given non-negative number is 1 or 2 more than a multiple of 20.

    public static boolean more20(int n) {
        if (n >= 20 && (n % 20 == 1 || n % 20 == 2)) {
            return true;
        }
            return false;
    }

//    Given a non-negative number "num", return true if num is within 2 of a multiple of 10.

    public static boolean nearTen(int num) {
        int r = num % 10;

        if (r <= 2) {
            return true;
        }
            return false;
    }

//    Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

    public static String firstHalf(String input) {
        int subStringLength = (input.length() / 2);

        String answer = input.substring(0, subStringLength);

        return answer;
    }

//    Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.

    public static String nonStart(String a, String b) {
        String firstWord = a.substring(1, a.length());

        String secondWord = b.substring(1, b.length());

        return firstWord + secondWord;
    }

//    Given a string, return a string length 1 from its front, unless front is false,
//    in which case return a string length 1 from its back. The string will be non-empty.
//
//    theEnd("Hello", true) → "H"
//    theEnd("Hello", false) → "o"
//    theEnd("oh", true) → "o"

    public static String theEnd(String input, boolean front) {
        if (front == true) {
            return input.substring(0, 1);
        }
            return input.substring(input.length() - 1, input.length());
    }

//    Given a string, return true if it ends in "ly".

    public static boolean endsLy(String input) {
        String lastTwo = input.substring(input.length() - 2, input.length());

        if (lastTwo.equalsIgnoreCase("ly")) {
            return true;
        }
            return false;
    }

//    Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and".
//    The string length will be at least 3.

    public static String middleThree(String input) {
        int middle = input.length() / 2;

        String middleLetters = input.substring(middle - 1, middle +2);

        return middleLetters;
    }

//    Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java"
//    yields "ya". If either string is length 0, use '@' for its missing char.

    public static String lastChars(String a, String b) {
        String firstChar = a.substring(0, 1);

        String lastChar = b.substring(b.length() - 1, b.length());

        String mashup = firstChar + lastChar;

        return mashup;
    }

//    Given a string, if the string begins with "red" or "blue" return that color string,
//    otherwise return the empty string.

    public static String seeColor(String input) {
        String red = "red";

        String blue = "blue";

        String zippy = "";

        if (input.startsWith("red")) {
            return red;
        }
        else if (input.startsWith("blue")) {
            return blue;
        }
        else {
            return zippy;
        }
    }

//    Given three ints, a b c, return true if two or more of them have the same rightmost digit.
//    The ints are non-negative

    public static boolean lastDigit(int a, int b, int c) {
        int lastA = Math.abs(a % 10);

        int lastB = Math.abs(b % 10);

        int lastC = Math.abs(c % 10);

        if (lastA == lastB || lastA == lastC || lastB == lastC) {
            return true;
        }
            return false;
    }

//    Given two int values, return whichever value is larger.
//    However if the two values have the same remainder when divided by 5, then the return the smaller value.
//    However, in all cases, if the two values are the same, return 0

    public static int maxMod5(int a, int b) {
        if (a == b) {
            return 0;
        } else if (a % 5 == b % 5) {
            return Integer.min(a, b);
        }
        else {
            return Integer.max(a, b);
        }
    }
//    This starts med diff


//    We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each)
//    and big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks.
//    This is a little harder than it looks and can be done without any loops.

    public static boolean makeBricks(int small, int big, int goal) {
        int bigBrick = 5;

        int firstStep = goal % (big * bigBrick);

        if (firstStep <= small) {
            return true;
        }
        else {
            return false;
        }
    }

//    Given 2 int values greater than 0, return whichever value is nearest to 21 without going over.
//    Return 0 if they both go over.

    public static int blackjack(int a, int b) {
        int highNumber = Integer.max(a, b);
        if (a > 21 && b > 21) {
            return 0;
        }
        else if (highNumber > 21) {
            return Integer.min(a, b);
        }
            return highNumber;
    }

//    Given 3 int values, a b c, return their sum.
//    However, if one of the values is the same as another of the values, it does not count towards the sum.

    public static int loneSum(int a, int b, int c) {

        if (a == b && b == c) {
            return 0;
        }
        else if (a == b) {
            return c;
        }
        else if (b == c) {
            return a;
        }
        else if (a == c) {
            return b;
        }
        else {
            return a + b + c;
        }
    }

//    For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more,
//    so 15 rounds up to 20. Alternately, round down to the previous multiple of 10 if its rightmost digit is
//    less than 5, so 12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded values.
//    To avoid code repetition, write a separate helper "public int round10(int num) {" and call it 3 times.
//    Write the helper entirely below and at the same indent level as roundSum().

    public static int roundTen(int num) {
        double decimal = (double)num/10;

        double rounded = Math.round(decimal);

        int finalValue = (int)rounded * 10;

        return finalValue;
    }

    public static int roundSum(int a, int b, int c) {
        int answer = (roundTen(a) + roundTen(b) + roundTen(c));

        return answer;
    }

//    Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the range 13..19
//    inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens. Write a separate helper
//    "public int fixTeen(int n) {"that takes in an int value and returns that value fixed for the teen rule.
//    In this way, you avoid repeating the teen code 3 times (i.e. "decomposition").
//    Define the helper below and at the same indent level as the main noTeenSum().

    public static int fixTeen(int n) {
        if ((n == 13 || n == 14) || (n>= 17 && n <= 19)) {
            n = 0;
            return Integer.valueOf(n);
        }
        else {
            return Integer.valueOf(n);
        }
    }

    public static int noTeenSum(int a, int b, int c) {
        int answer = (fixTeen(a) + fixTeen(b) + fixTeen(c));
        return answer;
    }
//
//    Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are
//    evenly spaced, so the difference between small and medium is the same as the difference between medium and large

    public static boolean evenlySpaced(int a, int b, int c) {
        int[] spaced = {a, b, c};

        Arrays.sort(spaced, 0, 3);

        int firstDiff = spaced[1] - spaced [0];

        int secondDiff = spaced[2] - spaced [1];

        if (firstDiff == secondDiff) {
            return true;
        }
            return false;
    }

//    Given 3 int values, a b c, return their sum. However, if one of the values is 13
//    then it does not count towards the sum and values to its right do not count. So for example,
//    if b is 13, then both b and c do not count.

    public static int luckySum(int a, int b, int c) {
        if (a == 13) {
            return 0;
        }
        else if (b == 13) {
            return a;
        }
        else if (c == 13) {
            return a + b;
        }
        else {
            return a + b + c;
        }
    }

//    Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other
//    is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number.

    public static boolean closeFar(int a, int b, int c) {
        int first = Math.abs(a - b);
        int second = Math.abs(a - c);
        if ((first == 1 || second == 1) && (first > 2 || second > 2)) {
            return true;
        }
        return false;
    }

//    We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each).
//    Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.


    public static int makeChocolate(int small, int big, int goal) {
        int remainder = goal - (5 * big);

        if (remainder > small) {
            return -1;
        }
        return remainder;
    }

//    Return the number of times that the string "code" appears anywhere in the given string,
//    except we'll accept any letter for the 'd', so "cope" and "cooe" count.

    public static int countCode(String input) {

        int count = 0;
        for (int i = 0; i < input.length() - 3; i++)

            if (input.substring(i, (i + 2)).equals("co") && input.charAt(i + 3) == 'e') {
                count++;
            }
        return count;
    }
}
