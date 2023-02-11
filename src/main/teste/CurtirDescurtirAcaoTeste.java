package main.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CurtirDescurtirAcaoTeste {

    private int counter = 0;

    @Test
    public void curtirAcaoTest() {
        counter++;
        assertEquals(1, counter);
    }

    @Test
    public void descurtirAcaoTest() {
        counter--;
        assertEquals(-1, counter);
    }
}