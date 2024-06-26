////////////////////////////////////////////////////////////////////
// Riccardo Stefani 2068225
// Leonardo Salviato 2068222
////////////////////////////////////////////////////////////////////

package org.tryHard;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class IntegerToRomanTest
{
    @Test(expected=IllegalArgumentException.class)
    public void testConvertZeroNumber() {
        int num = 0;

        String res = IntegerToRoman.convert(num);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testConvertNegativeNumber() {
        int num = -1;

        String res = IntegerToRoman.convert(num);
    }

    @Test
    public void testConvertFirstThreeNumbers() {
        int[] inputDecimalNumbers = {1,2,3};
        String[] expectedRomanNumbers = {"I", "II", "III"};

        String[] outputRomanNumbers = new String[expectedRomanNumbers.length];
        for (int i=0; i<inputDecimalNumbers.length; i++){
            outputRomanNumbers[i] =
                    IntegerToRoman.convert(inputDecimalNumbers[i]);
        }

        assertArrayEquals(expectedRomanNumbers, outputRomanNumbers);
    }
}
