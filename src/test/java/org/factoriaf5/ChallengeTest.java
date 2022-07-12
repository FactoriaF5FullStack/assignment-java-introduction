package org.factoriaf5;

import org.junit.jupiter.api.Test;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

class ChallengeTest {

    @Test
    void it_adds_two_numbers() {
        int result = Challenge.addTwoNumbers(1,1);
        assertThat(result, equalTo(2));
    }

    @Test
    void greeting() {
        assertEquals(Challenge.greetingFor("Mohamed"), "Hola Mohamed");
        assertEquals(Challenge.greetingFor("Andrea"), "Hola Andrea");
    }

    @Test
    void oddNumbers() {
        assertTrue(Challenge.isOdd(17));
        assertFalse(Challenge.isOdd(8));
    }

    @Test
    void evenNumbers() {
        assertFalse(Challenge.isEven(17));
        assertTrue(Challenge.isEven(8));
    }

    @Test
    void rounding() {
        assertEquals(Challenge.roundNumber(17.56), 17);
        assertEquals(Challenge.roundNumber(8.44), 8);
    }

    @Test
    void swapTwoNumbers() {
        assertEquals(Challenge.swapTwoNumbers(), "First number = 2.45f - Second number = 1.2");
    }

    @Test
    void calculatingRectangleArea() {
        assertEquals(Challenge.rectangleArea(9,3), 27);
    }

    @Test
    void convertKilometersToMiles() {
        assertEquals(Challenge.kilometersToMiles(54.6), 34.125);
    }
}