package com.theironyard.charlotte;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mfahrner on 8/20/16.
 */
public class MainTest {


    @Test
    public void love6ReturnsAppropriateBooleans() {
        assertTrue(Main.love6(6,4));
        assertFalse(Main.love6(7,4));
        assertTrue(Main.love6(1,5));
    }

    @Test
    public void more20ReturnsAppropriateBooleans() {
        assertFalse(Main.more20(20));
        assertTrue(Main.more20(21));
        assertTrue(Main.more20(22));
        assertFalse(Main.more20(25));
    }

    @Test
    public void nearTenReturnsAppropriateBooleans() {
        assertFalse(Main.nearTen(4));
        assertTrue(Main.nearTen(12));
        assertTrue(Main.nearTen(141));
    }

    @Test
    public void firstHalfReturnsFirstHalfOfGivenString() {




    }

    @Test
    public void nonStartReturnsConcatOfTwoGivenStringsOmittingFirstLetterOfEach() {

    }

    @Test
    public void theEndReturnsFirstLetterOfStringIfBooleanTrueReturnsLastLetterOfStringIfBooleanFalse() {

    }

    @Test
    public void endsLyReturnsTrueIfStringEndsInLy() {
        assertTrue(Main.endsLy("Emily"));
        assertFalse(Main.endsLy("YaMAMA"));
        assertTrue(Main.endsLy("softLY"));
    }

    @Test
    public void middleThreeReturnsThreeMiddleLettersFromOddLengthString() {


    }

    @Test
    public void lastCharsReturnsStringMadeUpOFFirstLetterAndLastLetterOfTwoGivenStrings() {

    }

    @Test
    public void seeColorReturnsRedOrBlueIfGivenStringStartsWithColorOtherwiseEmptyString() {

    }

    @Test
    public void lastDigitReturnsTrueIfRightDigitsOfTwoOrMoreGivenNumbersAreSame() {
        assertTrue(Main.lastDigit(15,5,23));
        assertFalse(Main.lastDigit(17,5,23));
        assertTrue(Main.lastDigit(1115,5,23));
        assertTrue(Main.lastDigit(-15,5,23));
    }

    @Test
    public void maxMod5ReturnsZeroIfTwoIntsSameReturnLargerIntUnlessBothDivisableByFiveInWhichCaseReturnSmallerInt() {

    }

    @Test
    public void makeBricksReturnsTrueIfCombinationOfBrickSizesCanCompleteGoalSize() {
        assertTrue(Main.makeBricks(3,1,8));
        assertFalse(Main.makeBricks(3,1,9));
        assertTrue(Main.makeBricks(5,10,53));
    }

    @Test
    public void blackjackReturnsClosestOfGivenIntsToTwentyOneWithoutGoingOverIfBothGoOverReturnZero() {

    }

    @Test
    public void loneSumReturnsSumOfThreeIntsIfTwoIntsAreTheSameTheyDoNotCountTowardTheSum() {

    }

    @Test
    public void roundTenReturnsRoundsAnIntUpToNextMultipleOfTenIfRightDigitIsFiveOrMoreOtherwiseRoundsDownToMultipleofTen() {

    }

    @Test
    public void roundSumReturnsSumOfThreeIntsRoundedToMultiplesOfTen() {

    }

    @Test
    public void fixTeenReturnsIntValueForEveryNumberExcept13And14And17Thru19() {

    }

    @Test
    public void noTeenSumReturnsSumOfThreeIntsExcluding13And14And17Thru19() {

    }















}