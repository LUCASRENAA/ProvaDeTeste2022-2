package main.teste;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.java.entidades.Usuario;
import main.java.negocio.UsuarioNegocio;
import main.java.repositorio.UsuarioRepositorio;

public class CriarContaTeste {

	// Caso de teste 06 criarConta feito por Izavan Correia
	@Test
	public void criarContaTest() {
		Usuario u = new Usuario("Lucas Henrique Ferreira Pavão", "lucashenrique1@gmail.com", "df12@434C", "15/06/1999",
				"Rua Manoel do Carmo", "visa");
		UsuarioRepositorio ur = new UsuarioRepositorio();
		UsuarioNegocio un = new UsuarioNegocio(ur);
		Boolean cadastrou = un.cadastrarUsuario(u);
		assertTrue(cadastrou);
	}

	// Caso de teste 07 criarConta com senha fraca feito por Izavan Correia
	@Test
	public void criarContaSenhaFracaTest() {
		Usuario u = new Usuario("Lucas Henrique Ferreira Pavão", "lucashenrique1@gmail.com", "12345", "15/06/1999",
				"Rua Manoel do Carmo", "visa");
		UsuarioRepositorio ur = new UsuarioRepositorio();
		UsuarioNegocio un = new UsuarioNegocio(ur);
		Boolean cadastrou = un.cadastrarUsuario(u);
		assertFalse(cadastrou);
	}

	// Caso de teste 08 criarConta com e-mail incorreto por Izavan Correia
	@Test
	public void criarContaEmailIncorretoTest() {
		Usuario u = new Usuario("Lucas Henrique Ferreira Pavão", "lucashenrique1gmail.com", "df12@434C", "15/06/1999",
				"Rua Manoel do Carmo", "visa");
		UsuarioRepositorio ur = new UsuarioRepositorio();
		UsuarioNegocio un = new UsuarioNegocio(ur);
		Boolean cadastrou = un.cadastrarUsuarioEmailIncorreto(u);
		assertFalse(cadastrou);
	}

}
