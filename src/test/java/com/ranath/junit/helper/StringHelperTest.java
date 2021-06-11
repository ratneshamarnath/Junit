package com.ranath.junit.helper;

import org.junit.Test;
import static org.junit.Assert.*;


public class StringHelperTest {

    StringHelper helper = new StringHelper();

    @Test
    public void testTruncateAInFirst2Positions_less_Or_Equal_length_two() {
        assertEquals("", helper.truncateAInFirst2Positions("AA"));
    }

    @Test
    public void testTruncateAInFirst2Positions_greater_length_two() {
        assertEquals( "CD", helper.truncateAInFirst2Positions("AACD"));
    }

    // ABAB => true, ABA => false, AB => true, A => false
    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_size_one() {
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_size_two() {
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_size_three() {
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABA"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_size_four() {
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }
}