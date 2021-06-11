
package com.ranath.junit.helper;

// This Two lines create problem
/*
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
*/

// Below two lines work well
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {

    StringHelper helper = new StringHelper();

    private final String input;
    private final String expectedOutput;

    public StringHelperParameterizedTest(String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<String[]> testConditions() {
        String[][] expectedOutputs = { {"AACD", "CD"},
                        {"ACD", "CD"}};
        return Arrays.asList(expectedOutputs);
    }

    @Test
    public void testTruncateAInFirst2Positions() {
        assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
    }
}