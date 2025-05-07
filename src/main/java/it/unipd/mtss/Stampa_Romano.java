////////////////////////////////////////////////////////////////////
// RICCARDO BALDIN 2075548
// ALDO TOFFOLI 2113202
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class Stampa_Romano {
    public static String print(int num){
        return printAsciiArt(Intero_Romano.convert(num));
    }

    public static String printAsciiArt(String romanNumber){
        StringBuilder result = new StringBuilder();
        int length = romanNumber.length();
        for (int i = 0; i < length; i++) {
            char c = romanNumber.charAt(i);
            switch(c) {
                case 'I':

                    result.append("***\n");
                    result.append(" * \n");
                    result.append(" * \n");
                    result.append(" * \n");
                    result.append("***\n");
                    result.append("\n");
                    break;

                case 'V':
                    result.append("*        *\n");
                    result.append(" *      * \n");
                    result.append("  *    *  \n");
                    result.append("   *  *   \n");
                    result.append("     *    \n");
                    result.append(" \n");
                    break;

                case 'X':
                    result.append("*    * \n");
                    result.append(" *  * \n");
                    result.append("  *   \n");
                    result.append(" *  * \n");
                    result.append("*    *\n");
                    result.append(" \n");
                    break;

                case 'L':
                    result.append("*       \n");
                    result.append("*       \n");
                    result.append("*       \n");
                    result.append("*       \n");
                    result.append("* * * * \n");
                    result.append(" \n");
                    break;

                case 'C':
                    result.append("* * * *\n");
                    result.append("*      \n");
                    result.append("*      \n");
                    result.append("*      \n");
                    result.append("* * * *\n");
                    result.append(" \n");
                    break;

                case 'D':
                    result.append("* * *   \n");
                    result.append("*     * \n");
                    result.append("*      *\n");
                    result.append("*     * \n");
                    result.append("* * *   \n");
                    result.append(" \n");
                    break;

                case 'M':
                    result.append("*       *\n");
                    result.append("* *   * *\n");
                    result.append("*  * *  *\n");
                    result.append("*   *   *\n");
                    result.append("*       *\n");
                    result.append(" \n");
                    break;

                default:
                    throw new IllegalArgumentException("Invalid Roman numeral: " + c);
            }
        }
        return result.toString();
    }
}