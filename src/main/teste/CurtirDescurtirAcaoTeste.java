package main.teste;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

import main.java.entidades.Postagem;

public class CurtirDescurtirAcaoTeste {


    

    @Test
    public void curtirAcaoTest() {
    	Postagem postagem = new Postagem("Texto de exemplo", new Date(), "Local de exemplo");
        postagem.curtirAcao();
        assertEquals(1, postagem.getCurtir());
    }

    @Test
    public void descurtirAcaoTest() {
    	Postagem postagem = new Postagem("Texto de exemplo", new Date(), "Local de exemplo");
        postagem.descurtirAcao();
        assertEquals(-1, postagem.getCurtir());
    }
}