package main.teste;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.java.entidades.Perfil;
import main.java.entidades.Usuario;
import main.java.negocio.UsuarioNegocio;
import main.java.repositorio.UsuarioRepositorio;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EditarPerfilImagemErrada {

	@Test
	public void editarPerfilErradoImagemTest() throws ParseException {
		String dataEmString = "05/05/2000";
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date data = formato.parse(dataEmString);
		Perfil perfil = new Perfil("Rei", "Arthur", "Praça do marco zero", data, "1234 5678 9012 3456", "imagem.jpg");

        try {
            perfil.setImagem("");
	        assertTrue(true);
        } catch (IllegalArgumentException e) {
            assertEquals("Imagem não pode ser vazia", e.getMessage());
        }
	}
	
}
