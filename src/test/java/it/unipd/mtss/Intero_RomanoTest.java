////////////////////////////////////////////////////////////////////
// RICCARDO BALDIN 2075548
// ALDO TOFFOLI 2113202
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.*;

import org.junit.Test;

public class Intero_RomanoTest{
    
    // TEST DEI PRIMI TRE NUMERI
    @Test
    public void TestPrimiTre(){
        assertEquals("I", Intero_Romano.convert(1));
        assertEquals("II", Intero_Romano.convert(2));
        assertEquals("III", Intero_Romano.convert(3));
    }

     // TEST DEI PRIMI SEI NUMERI 
    @Test
    public void TestPrimiSei(){
        assertEquals("IV", Intero_Romano.convert(4));
        assertEquals("V", Intero_Romano.convert(5));
        assertEquals("VI", Intero_Romano.convert(6));
    }

    // TEST DEI PRIMI DIECI NUMERI 
    @Test
    public void TestPrimiDieci(){
        assertEquals("VII", Intero_Romano.convert(7));
        assertEquals("VIII", Intero_Romano.convert(8));
        assertEquals("IX", Intero_Romano.convert(9));
        assertEquals("X", Intero_Romano.convert(10));
    }
    

    // TEST DEI PRIMI VENTI NUMERI 
    @Test
    public void TestPrimiVenti(){
        assertEquals("XI", Intero_Romano.convert(11));
        assertEquals("XII", Intero_Romano.convert(12));
        assertEquals("XX", Intero_Romano.convert(20));
    }

    // TEST DI VALORI NON AMMESSI DALLA FUNZIONE

    @Test(expected = IllegalArgumentException.class)
    public void testZero(){
        Intero_Romano.convert(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPiuDiMille(){
        Intero_Romano.convert(1001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativo(){
        Intero_Romano.convert(-3);
    }
}