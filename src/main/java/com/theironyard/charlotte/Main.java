package com.theironyard.charlotte;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println();



    }
//    The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6.
//    Or if their sum or difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.

    public boolean love6(int a, int b) {
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

    public boolean more20(int n) {
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

    public String firstHalf(String input) {
        int subString = (input.length() / 2);
        String answer = input.substring(0, subString);
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

    public String theEnd(String input, boolean front) {
        if (front == true) {
            return input.substring(0, 1);
        }
            return input.substring(input.length() - 1, input.length());
    }

//    Given a string, return true if it ends in "ly".

    public boolean endsLy(String input) {
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

    public boolean lastDigit(int a, int b, int c) {
        int lastA = a % 10;
        int lastB = b % 10;
        int lastC = c % 10;

        if (lastA == lastB || lastA == lastC || lastB == lastC) {
            return true;
        }
            return false;
    }

//    Given two int values, return whichever value is larger.
//    However if the two values have the same remainder when divided by 5, then the return the smaller value.
//    However, in all cases, if the two values are the same, return 0

    public int maxMod5(int a, int b) {
        if (a == b) {
            return 0;
        } else if (a % 5 == b % 5) {
            return Integer.min(a, b);
        }
        else {
            return Integer.max(a, b);
        }
    }
//    This starts med diff logic


//    We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each)
//    and big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks.
//    This is a little harder than it looks and can be done without any loops.

    public static boolean makeBricks(int small, int big, int goal) {
        int bigBrick = 5;
        int firstStep = goal % (big * bigBrick);

        if (firstStep == small) {
            return true;
        }
        else {
            return false;
        }
    }








}
