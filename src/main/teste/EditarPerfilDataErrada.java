package main.teste;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.java.entidades.Perfil;
import main.java.entidades.Usuario;
import main.java.negocio.PerfilNegocio;
import main.java.negocio.UsuarioNegocio;
import main.java.repositorio.UsuarioRepositorio;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import java.util.Calendar;
import java.util.Date;

public class EditarPerfilDataErrada {

	@SuppressWarnings("deprecation")
	@Test
	public void editarPerfilErradoDataTest() {
		Perfil perfil = new Perfil("Rei", "Arthur", "Praça do marco zero", "05/05/2000", "1234 5678 9012 3456", "imagem.jpg");

		 try {
	            perfil.setDataNascimento("02/30/2002");
	            fail("Deve lançar exceção de data inválida");
	        } catch (IllegalArgumentException e) {
	            assertEquals("Data inválida", e.getMessage());
	        }
	}
	
}
