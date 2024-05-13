////////////////////////////////////////////////////////////////////
// Riccardo Stefani 2068225
// Leonardo Salviato 2068222
////////////////////////////////////////////////////////////////////

package org.tryHard;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class RomanPrinterTest
{
    // Test di printAsciiArt
    @Test(expected=IllegalArgumentException.class)
    public void testAsciiArtEmptyString() {
        String romanNum = "";

        String res = RomanPrinter.printAsciiArt(romanNum);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testAsciiArtNumberNotRomanCharacter() {
        String romanNum = "Z";

        String res = RomanPrinter.printAsciiArt(romanNum);
    }

    @Test
    public void testAsciiArtFirstThreeNumbers() {
        String[] inputRomanNumbers = {"I","II","III"};
        String[][] expectedPrint = {
                { "  _____ ",
                  " |_   _|",
                  "   | |  ",
                  "   | |  ",
                  "  _| |_ ",
                  " |_____|"    },
                {"  _____   _____ ",
                 " |_   _| |_   _|",
                 "   | |     | |  ",
                 "   | |     | |  ",
                 "  _| |_   _| |_ ",
                 " |_____| |_____|"    },
                {"  _____   _____   _____ ",
                 " |_   _| |_   _| |_   _|",
                 "   | |     | |     | |  ",
                 "   | |     | |     | |  ",
                 "  _| |_   _| |_   _| |_ ",
                 " |_____| |_____| |_____|"    }
        };

        String[] expectedStringPrint = {
                RomanPrinter.convertToString(expectedPrint[0]),
                RomanPrinter.convertToString(expectedPrint[1]),
                RomanPrinter.convertToString(expectedPrint[2])
        };

        String[] outputPrint = new String[expectedStringPrint.length];
        for (int i=0; i<inputRomanNumbers.length; i++){
            outputPrint[i] = RomanPrinter.printAsciiArt(inputRomanNumbers[i]);
        }

        assertArrayEquals(expectedStringPrint, outputPrint);
    }




    // Test di print
    @Test(expected=IllegalArgumentException.class)
    public void testPrintZeroNumber() {
        int num = 0;

        String res = RomanPrinter.print(num);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testPrintNegativeNumber() {
        int num = -1;

        String res = RomanPrinter.print(num);
    }

    @Test
    public void testPrintFirstThreeNumbers() {
        int[] inputDecimalNumbers = {1,2,3};
        String[][] expectedPrint = {
                { "  _____ ",
                  " |_   _|",
                  "   | |  ",
                  "   | |  ",
                  "  _| |_ ",
                  " |_____|"    },
                {"  _____   _____ ",
                 " |_   _| |_   _|",
                 "   | |     | |  ",
                 "   | |     | |  ",
                 "  _| |_   _| |_ ",
                 " |_____| |_____|"    },
                {"  _____   _____   _____ ",
                 " |_   _| |_   _| |_   _|",
                 "   | |     | |     | |  ",
                 "   | |     | |     | |  ",
                 "  _| |_   _| |_   _| |_ ",
                 " |_____| |_____| |_____|"    }
        };

        String[] expectedStringPrint = {
                RomanPrinter.convertToString(expectedPrint[0]),
                RomanPrinter.convertToString(expectedPrint[1]),
                RomanPrinter.convertToString(expectedPrint[2])
        };

        String[] outputPrint = new String[expectedStringPrint.length];
        for (int i=0; i<inputDecimalNumbers.length; i++){
            outputPrint[i] = RomanPrinter.print(inputDecimalNumbers[i]);
        }

        assertArrayEquals(expectedStringPrint, outputPrint);
    }
}
