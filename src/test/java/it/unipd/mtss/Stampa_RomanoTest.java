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

    @Test
    public void testNumero4() {
        StringBuilder expected = new StringBuilder();
        expected.append("***\n");
        expected.append(" * \n");
        expected.append(" * \n");
        expected.append(" * \n");
        expected.append("***\n");
        expected.append("\n");
        expected.append("*        *\n");
        expected.append(" *      * \n");
        expected.append("  *    *  \n");
        expected.append("   *  *   \n");
        expected.append("     *    \n");
        expected.append(" \n");

        assertEquals(expected.toString(), Stampa_Romano.print(4));
    }


    @Test
    public void testNumero5() {
        StringBuilder expected = new StringBuilder();
        expected.append("*        *\n");
        expected.append(" *      * \n");
        expected.append("  *    *  \n");
        expected.append("   *  *   \n");
        expected.append("     *    \n");
        expected.append(" \n");

        assertEquals(expected.toString(), Stampa_Romano.print(5));
    }

    @Test
    public void testNumero6() {
        StringBuilder expected = new StringBuilder();
        expected.append("*        *\n");
        expected.append(" *      * \n");
        expected.append("  *    *  \n");
        expected.append("   *  *   \n");
        expected.append("     *    \n");
        expected.append(" \n");        
        expected.append("***\n");
        expected.append(" * \n");
        expected.append(" * \n");
        expected.append(" * \n");
        expected.append("***\n");
        expected.append("\n");
        
        assertEquals(expected.toString(), Stampa_Romano.print(6));
    }

    @Test
    public void testNumero7() {
        StringBuilder expected = new StringBuilder();
        expected.append("*        *\n");
        expected.append(" *      * \n");
        expected.append("  *    *  \n");
        expected.append("   *  *   \n");
        expected.append("     *    \n");
        expected.append(" \n");
        expected.append("***\n");
        expected.append(" * \n");
        expected.append(" * \n");
        expected.append(" * \n");
        expected.append("***\n");
        expected.append("\n");
        expected.append("***\n");
        expected.append(" * \n");
        expected.append(" * \n");
        expected.append(" * \n");
        expected.append("***\n");
        expected.append("\n");

        assertEquals(expected.toString(), Stampa_Romano.print(7));
    }

    @Test
    public void testNumero8() {
        StringBuilder expected = new StringBuilder();
        expected.append("*        *\n");
        expected.append(" *      * \n");
        expected.append("  *    *  \n");
        expected.append("   *  *   \n");
        expected.append("     *    \n");
        expected.append(" \n");
        expected.append("***\n");
        expected.append(" * \n");
        expected.append(" * \n");
        expected.append(" * \n");
        expected.append("***\n");
        expected.append("\n");
        expected.append("***\n");
        expected.append(" * \n");
        expected.append(" * \n");
        expected.append(" * \n");
        expected.append("***\n");
        expected.append("\n");
        expected.append("***\n");
        expected.append(" * \n");
        expected.append(" * \n");
        expected.append(" * \n");
        expected.append("***\n");
        expected.append("\n");

        assertEquals(expected.toString(), Stampa_Romano.print(8));
    }

    @Test
    public void testNumero9() {
        StringBuilder expected = new StringBuilder();
        expected.append("***\n");
        expected.append(" * \n");
        expected.append(" * \n");
        expected.append(" * \n");
        expected.append("***\n");
        expected.append("\n");
        expected.append("*    * \n");
        expected.append(" *  * \n");
        expected.append("  *   \n");
        expected.append(" *  * \n");
        expected.append("*    *\n");
        expected.append(" \n");

        assertEquals(expected.toString(), Stampa_Romano.print(9));
    }

    @Test
    public void testNumero10() {
        StringBuilder expected = new StringBuilder();

        expected.append("*    * \n");
        expected.append(" *  * \n");
        expected.append("  *   \n");
        expected.append(" *  * \n");
        expected.append("*    *\n");
        expected.append(" \n");

        assertEquals(expected.toString(), Stampa_Romano.print(10));
    }

    @Test
    public void testNumero11() {
        StringBuilder expected = new StringBuilder();

        expected.append("*    * \n");
        expected.append(" *  * \n");
        expected.append("  *   \n");
        expected.append(" *  * \n");
        expected.append("*    *\n");
        expected.append(" \n");
        expected.append("***\n");
        expected.append(" * \n");
        expected.append(" * \n");
        expected.append(" * \n");
        expected.append("***\n");
        expected.append("\n");

        assertEquals(expected.toString(), Stampa_Romano.print(11));
    }

    @Test
    public void testNumero12() {
        StringBuilder expected = new StringBuilder();

        expected.append("*    * \n");
        expected.append(" *  * \n");
        expected.append("  *   \n");
        expected.append(" *  * \n");
        expected.append("*    *\n");
        expected.append(" \n");
        expected.append("***\n");
        expected.append(" * \n");
        expected.append(" * \n");
        expected.append(" * \n");
        expected.append("***\n");
        expected.append("\n");expected.append("***\n");
        expected.append(" * \n");
        expected.append(" * \n");
        expected.append(" * \n");
        expected.append("***\n");
        expected.append("\n");

        assertEquals(expected.toString(), Stampa_Romano.print(12));
    }

    @Test
    public void testNumero20() {
        StringBuilder expected = new StringBuilder();

        expected.append("*    * \n");
        expected.append(" *  * \n");
        expected.append("  *   \n");
        expected.append(" *  * \n");
        expected.append("*    *\n");
        expected.append(" \n");
        expected.append("*    * \n");
        expected.append(" *  * \n");
        expected.append("  *   \n");
        expected.append(" *  * \n");
        expected.append("*    *\n");
        expected.append(" \n");

        assertEquals(expected.toString(), Stampa_Romano.print(20));
    }

    @Test
    public void testNumero30() {
        StringBuilder expected = new StringBuilder();

        expected.append("*    * \n");
        expected.append(" *  * \n");
        expected.append("  *   \n");
        expected.append(" *  * \n");
        expected.append("*    *\n");
        expected.append(" \n");
        expected.append("*    * \n");
        expected.append(" *  * \n");
        expected.append("  *   \n");
        expected.append(" *  * \n");
        expected.append("*    *\n");
        expected.append(" \n");
        expected.append("*    * \n");
        expected.append(" *  * \n");
        expected.append("  *   \n");
        expected.append(" *  * \n");
        expected.append("*    *\n");
        expected.append(" \n");

        assertEquals(expected.toString(), Stampa_Romano.print(30));
    }

    @Test
    public void testNumero40() {
        StringBuilder expected = new StringBuilder();

        expected.append("*    * \n");
        expected.append(" *  * \n");
        expected.append("  *   \n");
        expected.append(" *  * \n");
        expected.append("*    *\n");
        expected.append(" \n");
        expected.append("*       \n");
        expected.append("*       \n");
        expected.append("*       \n");
        expected.append("*       \n");
        expected.append("* * * * \n");
        expected.append(" \n");

        assertEquals(expected.toString(), Stampa_Romano.print(40));
    }

    @Test
    public void testNumero50() {
        StringBuilder expected = new StringBuilder();

        expected.append("*       \n");
        expected.append("*       \n");
        expected.append("*       \n");
        expected.append("*       \n");
        expected.append("* * * * \n");
        expected.append(" \n");

        assertEquals(expected.toString(), Stampa_Romano.print(50));
    }

    @Test
    public void testNumero70() {
        StringBuilder expected = new StringBuilder();

        expected.append("*       \n");
        expected.append("*       \n");
        expected.append("*       \n");
        expected.append("*       \n");
        expected.append("* * * * \n");
        expected.append(" \n");
        expected.append("*    * \n");
        expected.append(" *  * \n");
        expected.append("  *   \n");
        expected.append(" *  * \n");
        expected.append("*    *\n");
        expected.append(" \n");
        expected.append("*    * \n");
        expected.append(" *  * \n");
        expected.append("  *   \n");
        expected.append(" *  * \n");
        expected.append("*    *\n");
        expected.append(" \n");


        assertEquals(expected.toString(), Stampa_Romano.print(70));
    }
    
    @Test
    public void testNumero90() {
        StringBuilder expected = new StringBuilder();

        expected.append("*    * \n");
        expected.append(" *  * \n");
        expected.append("  *   \n");
        expected.append(" *  * \n");
        expected.append("*    *\n");
        expected.append(" \n");
        expected.append("* * * *\n");
        expected.append("*      \n");
        expected.append("*      \n");
        expected.append("*      \n");
        expected.append("* * * *\n");
        expected.append(" \n");

        assertEquals(expected.toString(), Stampa_Romano.print(90));
    }   
    
    @Test
    public void testNumero100() {
        StringBuilder expected = new StringBuilder();

    
        expected.append("* * * *\n");
        expected.append("*      \n");
        expected.append("*      \n");
        expected.append("*      \n");
        expected.append("* * * *\n");
        expected.append(" \n");

        assertEquals(expected.toString(), Stampa_Romano.print(100));
    }

    @Test
    public void testNumero200() {
        StringBuilder expected = new StringBuilder();


        expected.append("* * * *\n");
        expected.append("*      \n");
        expected.append("*      \n");
        expected.append("*      \n");
        expected.append("* * * *\n");
        expected.append(" \n");
        expected.append("* * * *\n");
        expected.append("*      \n");
        expected.append("*      \n");
        expected.append("*      \n");
        expected.append("* * * *\n");
        expected.append(" \n");

        assertEquals(expected.toString(), Stampa_Romano.print(200));
    }

    @Test
    public void testNumero350() {
        StringBuilder expected = new StringBuilder();


        expected.append("* * * *\n");
        expected.append("*      \n");
        expected.append("*      \n");
        expected.append("*      \n");
        expected.append("* * * *\n");
        expected.append(" \n");
        expected.append("* * * *\n");
        expected.append("*      \n");
        expected.append("*      \n");
        expected.append("*      \n");
        expected.append("* * * *\n");
        expected.append(" \n");
        expected.append("* * * *\n");
        expected.append("*      \n");
        expected.append("*      \n");
        expected.append("*      \n");
        expected.append("* * * *\n");
        expected.append(" \n");
        expected.append("*       \n");
        expected.append("*       \n");
        expected.append("*       \n");
        expected.append("*       \n");
        expected.append("* * * * \n");
        expected.append(" \n");

        assertEquals(expected.toString(), Stampa_Romano.print(350));
    }

    @Test
    public void testNumero600() {
        StringBuilder expected = new StringBuilder();

        expected.append("* * *   \n");
        expected.append("*     * \n");
        expected.append("*      *\n");
        expected.append("*     * \n");
        expected.append("* * *   \n");
        expected.append(" \n");
        expected.append("* * * *\n");
        expected.append("*      \n");
        expected.append("*      \n");
        expected.append("*      \n");
        expected.append("* * * *\n");
        expected.append(" \n");

        assertEquals(expected.toString(), Stampa_Romano.print(600));
    }

    @Test
    public void testNumero750() {
        StringBuilder expected = new StringBuilder();

        expected.append("* * *   \n");
        expected.append("*     * \n");
        expected.append("*      *\n");
        expected.append("*     * \n");
        expected.append("* * *   \n");
        expected.append(" \n");
        expected.append("* * * *\n");
        expected.append("*      \n");
        expected.append("*      \n");
        expected.append("*      \n");
        expected.append("* * * *\n");
        expected.append(" \n");
        expected.append("* * * *\n");
        expected.append("*      \n");
        expected.append("*      \n");
        expected.append("*      \n");
        expected.append("* * * *\n");
        expected.append(" \n");
        expected.append("*       \n");
        expected.append("*       \n");
        expected.append("*       \n");
        expected.append("*       \n");
        expected.append("* * * * \n");
        expected.append(" \n");

        assertEquals(expected.toString(), Stampa_Romano.print(750));
    }

    @Test
    public void testNumero1000() {
        StringBuilder expected = new StringBuilder();

        expected.append("*       *\n");
        expected.append("* *   * *\n");
        expected.append("*  * *  *\n");
        expected.append("*   *   *\n");
        expected.append("*       *\n");
        expected.append(" \n");

        assertEquals(expected.toString(), Stampa_Romano.print(1000));
    }
    
}