////////////////////////////////////////////////////////////////////
// RICCARDO BALDIN 2075548
// ALDO TOFFOLI 2113202
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class Intero_Romano {
    public static String convert(int number) {
        if (number <= 0 || number > 1000) {
            throw new IllegalArgumentException("Il numero deve essere compreso tra 1 e 1000");
        }

        String[] migliaia = {"", "M"};
        String[] centinaia = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] decine = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] unita = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return migliaia[number / 1000] +
                centinaia[(number % 1000) / 100] +
                decine[(number % 100) / 10] +
                unita[number % 10];
    }
}