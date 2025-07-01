package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {

    @Test
    public void testSum_TwoAndThree_ReturnsFive() {
        Calculate calc = new Calculate();
        assertEquals(5, calc.sum(2, 3));
    }

    @Test
    public void testAverage_TwoAndFour_ReturnsThree() {
        Calculate calc = new Calculate();
        assertEquals(3.0, calc.average(2, 4),0.0001);
    }

    @Test
    public void testSumBetween_OneToFive_ReturnsFifteen() {
        Calculate calc = new Calculate();
        assertEquals(15, calc.sumBetween(1, 5));
    }

    @Test
    public void testSumBetween_FiveToOne_ReturnsZero() {
        Calculate calc = new Calculate();
        assertEquals(0, calc.sumBetween(5, 1)); // ループが一度も実行されないパス
    }


    @Test
    public void testSumEvenBetween_OneToTen_ReturnsThirty() {
        Calculate calc = new Calculate();
        assertEquals(30, calc.sumEvenBetween(1, 10));
    }

    @Test
    public void testSumOddBetween_OneToTen_ReturnsTwentyFive() {
        Calculate calc = new Calculate();
        assertEquals(25, calc.sumOddBetween(1, 10));
    }
}
