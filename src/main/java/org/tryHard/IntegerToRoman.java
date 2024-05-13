////////////////////////////////////////////////////////////////////
// Riccardo Stefani 2068225
// Leonardo Salviato 2068222
////////////////////////////////////////////////////////////////////

package org.tryHard;

import java.util.HashMap;

public class IntegerToRoman {
    public static String convert(int number) throws IllegalArgumentException {
        if(number == 0) {
            throw new IllegalArgumentException("E' stato passato " +
                    "come parametro un numero uguale a zero");
        }

        if(number < 0) {
            throw new IllegalArgumentException("E' stato passato " +
                    "come parametro un numero minore di zero");
        }

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");

        int[] decimalValues = { 1000, 900, 500, 400, 100, 90, 50, 40,
                10, 9, 5, 4, 1 };
        StringBuilder romanNumeral = new StringBuilder();

        for (int decimalValue : decimalValues) {
            while (number >= decimalValue) {
                romanNumeral.append(map.get(decimalValue));
                number -= decimalValue;
            }
        }

        return romanNumeral.toString();
    }
}