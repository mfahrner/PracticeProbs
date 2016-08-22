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
        assertEquals("hello", Main.firstHalf("helloworld"));
        assertEquals("helLO", Main.firstHalf("helLOworld"));
        assertEquals("YaM", Main.firstHalf("YaMama"));
    }

    @Test
    public void nonStartReturnsConcatOfTwoGivenStringsOmittingFirstLetterOfEach() {
        assertEquals("avaucky", Main.nonStart("java", "lucky"));
        assertEquals("AVAucky", Main.nonStart("jAVA", "lucky"));
        assertEquals("avauCkY", Main.nonStart("java", "luCkY"));
    }

    @Test
    public void theEndReturnsFirstLetterOfStringIfBooleanTrueReturnsLastLetterOfStringIfBooleanFalse() {
        assertEquals("H", Main.theEnd("Hello", true));
        assertEquals("o", Main.theEnd("hello", false));
        assertEquals("h", Main.theEnd("hello", true));
        assertEquals("O", Main.theEnd("hellO", false));
    }

    @Test
    public void endsLyReturnsTrueIfStringEndsInLy() {
        assertTrue(Main.endsLy("Emily"));
        assertFalse(Main.endsLy("YaMAMA"));
        assertTrue(Main.endsLy("softLY"));
    }

    @Test
    public void middleThreeReturnsThreeMiddleLettersFromOddLengthString() {
        assertEquals("and", Main.middleThree("candy"));
        assertEquals("eLL", Main.middleThree("HeLLo"));
        assertEquals("oWo", Main.middleThree("HelloWorlds"));
    }

    @Test
    public void lastCharsReturnsStringMadeUpOfFirstLetterAndLastLetterOfTwoGivenStrings() {
        assertEquals("ya", Main.lastChars("yo","java"));
        assertEquals("YA", Main.lastChars("Yo","javA"));
        assertEquals("yA", Main.lastChars("yo","JAVA"));
    }

    @Test
    public void seeColorReturnsRedOrBlueIfGivenStringStartsWithColorOtherwiseEmptyString() {
        assertEquals("red", Main.seeColor("redbull"));
        assertEquals("blue", Main.seeColor("blueox"));
        assertEquals("", Main.seeColor("yamama"));
        assertEquals("red", Main.seeColor("redrumredrumredrum"));

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
        assertEquals(6, Main.maxMod5(6,3));
        assertEquals(6, Main.maxMod5(3,6));
        assertEquals(5, Main.maxMod5(10,5));
        assertEquals(0, Main.maxMod5(6,6));

    }

    @Test
    public void makeBricksReturnsTrueIfCombinationOfBrickSizesCanCompleteGoalSize() {
        assertTrue(Main.makeBricks(3,1,8));
        assertFalse(Main.makeBricks(3,1,9));
        assertTrue(Main.makeBricks(5,10,53));
    }

    @Test
    public void blackjackReturnsClosestOfGivenIntsToTwentyOneWithoutGoingOverIfBothGoOverReturnZero() {
        assertEquals(21, Main.blackjack(21,3));
        assertEquals(0, Main.blackjack(22,23));
        assertEquals(20, Main.blackjack(2,20));
        assertEquals(3, Main.blackjack(22,3));
        assertEquals(4, Main.blackjack(4, 22));

    }

    @Test
    public void loneSumReturnsSumOfThreeIntsIfTwoIntsAreTheSameTheyDoNotCountTowardTheSum() {
        assertEquals(6, Main.loneSum(1,2,3));
        assertEquals(2, Main.loneSum(3,2,3));
        assertEquals(0, Main.loneSum(3,3,3));
        assertEquals(-2, Main.loneSum(3,2,-7));
        assertEquals(326, Main.loneSum(102,104,120));
    }

    @Test
    public void roundTenReturnsRoundsAnIntUpToNextMultipleOfTenIfRightDigitIsFiveOrMoreOtherwiseRoundsDownToMultipleofTen() {
        assertEquals(20, Main.roundTen(15));
        assertEquals(10, Main.roundTen(14));
        assertEquals(-20, Main.roundTen(-16));
        assertEquals(-10, Main.roundTen(-14));
    }

    @Test
    public void roundSumReturnsSumOfThreeIntsRoundedToMultiplesOfTen() {
        assertEquals(50, Main.roundSum(15,14,20));
        assertEquals(-50, Main.roundSum(-16,-14,-22));
        assertEquals(840, Main.roundSum(122,256,464));
    }

    @Test
    public void fixTeenReturnsIntValueForEveryNumberExcept13And14And17Thru19() {
        assertEquals(0, Main.fixTeen(13));
        assertEquals(15, Main.fixTeen(15));
        assertEquals(0, Main.fixTeen(18));
        assertEquals(-8, Main.fixTeen(-8));
        assertEquals(99, Main.fixTeen(99));
    }

    @Test
    public void noTeenSumReturnsSumOfThreeIntsExcluding13And14And17Thru19() {
        assertEquals(15, Main.noTeenSum(13,14,15));
        assertEquals(0, Main.noTeenSum(17,18,19));
        assertEquals(60, Main.noTeenSum(10,20,30));
        assertEquals(56, Main.noTeenSum(56,13,19));
    }

    @Test
    public void evenlySpacedReturnsTrueIfTheDiffereceBetweenGivenThreeIntsIsTheSame() {
        assertTrue(Main.evenlySpaced(25,15,5));
        assertTrue(Main.evenlySpaced(-3,0,3));
        assertFalse(Main.evenlySpaced(47,12,4));
    }

    @Test
    public void luckySumReturnsSumOfThreeGivenIntsHoweverThirteenAndNumbersToRightDoNotCountTowardSum() {
        assertEquals(56, Main.luckySum(56,13,19));
        assertEquals(70, Main.luckySum(56,14,13));
        assertEquals(0, Main.luckySum(13,13,19));
        assertEquals(33, Main.luckySum(10,11,12));
    }

    @Test
    public void closeFarReturnsTrueIfGivenThreeIntsIntBOrIntCDifferFromIntAByOneAndTheOtherVariableDiffersByMoreThanTwo() {
        assertTrue(Main.closeFar(1,2,10));
        assertTrue(Main.closeFar(-1,-2,-10));
        assertFalse(Main.closeFar(1,2,3));
    }

    @Test
    public void makeChocolateReturnsIntForNumberOfSmallBarsToUseToReachGoalReturnsNegOneIfNotEnoughSmallBarsWereProvided() {
        assertEquals(4, Main.makeChocolate(4,1,9));
        assertEquals(-1, Main.makeChocolate(4,1,10));
        assertEquals(2, Main.makeChocolate(4,1,7));
        assertEquals(2, Main.makeChocolate(4,7,37));
    }

    @Test
    public void countCodeReturnsNumberOfTimesStringCodeAppearsInAStringWillAcceptAnyThirdLetter(){
        assertEquals(1, Main.countCode("coderules"));
        assertEquals(1, Main.countCode("coYerules"));
        assertEquals(4, Main.countCode("codecodecodecode"));
        assertEquals(1, Main.countCode("rulescode"));
    }



















}