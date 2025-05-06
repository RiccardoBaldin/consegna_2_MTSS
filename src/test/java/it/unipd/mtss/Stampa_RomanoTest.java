////////////////////////////////////////////////////////////////////
// RICCARDO BALDIN 2075548
// ALDO TOFFOLI 2113202
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Stampa_RomanoTest {

    @Test(expected = IllegalArgumentException.class)
    public void SbagliatoSbagliato(){
        Stampa_Romano.printAsciiArt("formaldeide");
        Stampa_Romano.printAsciiArt("cloroformio");
        Stampa_Romano.printAsciiArt("acidodesossiribonucleico");
        Stampa_Romano.printAsciiArt(null);
    }
    
    @Test
    public void testNumero1() {
        StringBuilder expected = new StringBuilder();
        expected.append("***\n");
        expected.append(" * \n");
        expected.append(" * \n");
        expected.append(" * \n");
        expected.append("***\n");
        expected.append("\n");

        assertEquals(expected.toString(), Stampa_Romano.print(1));
    }

    @Test
    public void testNumero2() {
        StringBuilder expected = new StringBuilder();

        for (int i = 0; i < 2; i++) {
            expected.append("***\n");
            expected.append(" * \n");
            expected.append(" * \n");
            expected.append(" * \n");
            expected.append("***\n");
            expected.append("\n");
        }
        assertEquals(expected.toString(), Stampa_Romano.print(2));
    }

    @Test
    public void testNumero3() {
        StringBuilder expected = new StringBuilder();
        // Tre volte il blocco per 'I'
        for (int i = 0; i < 3; i++) {
            expected.append("***\n");
            expected.append(" * \n");
            expected.append(" * \n");
            expected.append(" * \n");
            expected.append("***\n");
            expected.append("\n");
        }
        assertEquals(expected.toString(), Stampa_Romano.print(3));
    }
    
}