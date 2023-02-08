package main.teste;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.java.entidades.Usuario;
import main.java.repositorio.UsuarioRepositorio;

public class FazerLoginTeste {

	// Caso de teste 01 FazerLogin feito por Izavan Correia
	@Test
	public void fazerLoginTest() {

		Usuario u = new Usuario("Lucas Henrique Ferreira Pavão", "lucashenrique1@gmail.com", "df12@434C", "15/06/1999", "Rua Manoel do Carmo", "visa");
		UsuarioRepositorio ur = new UsuarioRepositorio();
		ur.addUsuario(u);

		String email = "lucashenrique1@gmail.com";
		String senha = "df12@434C";

		boolean isLoginSuccessful = ur.isValidLogin(email, senha);

		assertTrue(isLoginSuccessful);
	}

	// Caso de teste 02 FazerLogin com e-mail não cadastrado feito por Izavan
	// Correia
	@Test
	public void fazerLoginEmailNaoCadastradoTest() {

		Usuario u = new Usuario("Lucas Henrique Ferreira Pavão", "lucashenrique1@gmail.com", "df12@434C", "15/06/1999", "Rua Manoel do Carmo", "visa");
		UsuarioRepositorio ur = new UsuarioRepositorio();
		ur.addUsuario(u);

		String email = "irwing123@gmail.com";
		String senha = "df12@434C";

		boolean isLoginSuccessful = ur.isValidLogin(email, senha);

		assertFalse(isLoginSuccessful);
	}

	// Caso de teste 03 FazerLogin com senha não cadastrada feito por Izavan Correia
	@Test
	public void fazerLoginSenhaNaoCadastradaTest() {

		Usuario u = new Usuario("Lucas Henrique Ferreira Pavão", "irwing123@gmail.com", "ah45#98@8F", "15/06/1999", "Rua Manoel do Carmo", "visa");
		UsuarioRepositorio ur = new UsuarioRepositorio();
		ur.addUsuario(u);

		String email = "irwing123@gmail.com";
		String senha = "df12@434C";

		boolean isLoginSuccessful = ur.isValidLogin(email, senha);

		assertFalse(isLoginSuccessful);

	}
	
	// Caso de teste 04 FazerLogin com senha incorreta feito por Izavan Correia
		@Test
		public void fazerLoginSenhaIncorretaTest() {

			Usuario u = new Usuario("Lucas Henrique Ferreira Pavão", " lucashenrique1@gmail.com", "df12@434C", "15/06/1999", "Rua Manoel do Carmo", "visa");
			UsuarioRepositorio ur = new UsuarioRepositorio();
			ur.addUsuario(u);

			String email = " lucashenrique1@gmail.com";
			String senha = "Senhateste123";

			boolean isLoginSuccessful = ur.isValidLogin(email, senha);

			assertFalse(isLoginSuccessful);

		}
		
		// Caso de teste 05 FazerLogin com e-mail incorreto feito por Izavan Correia
		@Test
		public void fazerLoginEmailIncorretoTest() {

			Usuario u = new Usuario("Lucas Henrique Ferreira Pavão", "lucashenrique1@gmail.com", "df12@434C", "15/06/1999", "Rua Manoel do Carmo", "visa");
			UsuarioRepositorio ur = new UsuarioRepositorio();
			ur.addUsuario(u);

			String email = "usuarioincorreto@gmail.com";
			String senha = "df12@434C";

			boolean isLoginSuccessful = ur.isValidLogin(email, senha);

			assertFalse(isLoginSuccessful);
		}

}
