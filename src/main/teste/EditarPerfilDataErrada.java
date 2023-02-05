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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EditarPerfilDataErrada {

	@SuppressWarnings("deprecation")
	@Test
	public void editarPerfilErradoDataTest() throws ParseException {
		String dataEmString = "05/05/2000";
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date data = formato.parse(dataEmString);
		Perfil perfil = new Perfil("Rei", "Arthur", "Praça do marco zero", data, "1234 5678 9012 3456", "imagem.jpg");

		 try {
			 
			 String dataEmString2 = "x5/05/2000";
				SimpleDateFormat formato2 = new SimpleDateFormat("dd/MM/yyyy");
				Date data2 = formato2.parse(dataEmString2);
		        perfil.setDataNascimento(data2);
		        assertTrue(false);

		    } catch (ParseException  e) {
		        assertTrue(true);

		    }
		 }
	
}
