////////////////////////////////////////////////////////////////////
// Riccardo Stefani 2068225
// Leonardo Salviato 2068222
////////////////////////////////////////////////////////////////////

package org.tryHard;

public class RomanPrinter {
    public static String print(int num) throws IllegalArgumentException {
        return printAsciiArt(IntegerToRoman.convert(num));
    }
    public static String printAsciiArt(String romanNumber)
            throws IllegalArgumentException {
        if(romanNumber.isEmpty()) {
            throw new IllegalArgumentException("E' stata passata " +
                    "come parametro una stringa vuota");
        }

        String[] matriceUnione = new String[6]; // La lunghezza della matrice
                               // dipende dalle righe di ogni matrice di base

        // Inizializza matriceUnione a una stringa vuota
        for (int i = 0; i < matriceUnione.length; i++) {
            matriceUnione[i] = "";
        }

        appendMatrices(matriceUnione, romanNumber);

        // Conversione della matrice in una stringa unica con \n
        // per andare a capo
        return convertToString(matriceUnione);
    }

    public static void appendMatrices(String[] destination,
                                      String romanNumber) {
        String[][] matrices = {
                { "  _____ ",
                  " |_   _|",
                  "   | |  ",
                  "   | |  ",
                  "  _| |_ ",
                  " |_____|" },
                { " __      __",
                  " \\ \\    / /",
                  "  \\ \\  / / ",
                  "   \\ \\/ /  ",
                  "    \\  /   ",
                  "     \\/    " },
                { " __   __",
                  " \\ \\ / /",
                  "  \\ V / ",
                  "   > <  ",
                  "  / . \\ ",
                  " /_/ \\_\\" },
                { "  _      ",
                  " | |     ",
                  " | |     ",
                  " | |     ",
                  " | |____ ",
                  " |______|" },
                { "   _____ ",
                  "  / ____|",
                  " | |     ",
                  " | |     ",
                  " | |____ ",
                  "  \\_____|" },
                { "  _____  ",
                  " |  __ \\ ",
                  " | |  | |",
                  " | |  | |",
                  " | |__| |",
                  " |_____/ " },
                { "  __  __ ",
                  " |  \\/  |",
                  " | \\  / |",
                  " | |\\/| |",
                  " | |  | |",
                  " |_|  |_|" }
        };

        for (char c : romanNumber.toCharArray()) {
            switch (c) {
                case 'I':
                    appendMatrix(destination, matrices[0]);
                    break;
                case 'V':
                    appendMatrix(destination, matrices[1]);
                    break;
                case 'X':
                    appendMatrix(destination, matrices[2]);
                    break;
                case 'L':
                    appendMatrix(destination, matrices[3]);
                    break;
                case 'C':
                    appendMatrix(destination, matrices[4]);
                    break;
                case 'D':
                    appendMatrix(destination, matrices[5]);
                    break;
                case 'M':
                    appendMatrix(destination, matrices[6]);
                    break;
                default:
                    throw new IllegalArgumentException("Carattere romano " +
                            "non valido: " + c);
            }
        }
    }

    public static void appendMatrix(String[] destination, String[] source) {
        for (int i = 0; i < destination.length; i++) {
            destination[i] += source[i];
        }
    }

    public static String convertToString(String[] matrice) {
        StringBuilder matriceStringBuilder = new StringBuilder();
        for (String riga : matrice) {
            matriceStringBuilder.append(riga).append("\n");
        }
        return matriceStringBuilder.toString();
    }

}