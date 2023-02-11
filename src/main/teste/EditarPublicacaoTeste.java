package main.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import main.java.entidades.Postagem;

public class EditarPublicacaoTeste {

    @Test
    public void editarPublicacaoNomeDataTest() throws ParseException {
        String dataEmString = "22/12/2022";
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formato.parse(dataEmString);
        Postagem postagem = new Postagem("Texto de exemplo", new Date(), "Local de exemplo");
        postagem.setNome("");
        postagem.setData(null);
        
        postagem.setNome("Sopa na praça");
        postagem.setData(data);

        assertNotNull(postagem.getNome());
        assertEquals("Sopa na praça", postagem.getNome());
        assertNotNull(postagem.getData());
        assertEquals(data, postagem.getData());
    }

    @Test
    public void verificarCamposVaziosTest() {
        Postagem postagem = new Postagem("", null, "");

        assertNull(postagem.getNome());
        assertNull(postagem.getData());
    }
}