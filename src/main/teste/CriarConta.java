package main.teste;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.java.entidades.Usuario;
import main.java.negocio.UsuarioNegocio;
import main.java.repositorio.UsuarioRepositorio;

public class CriarConta {

	@Test
	public void criarContaTest() {
		Usuario u = new Usuario("Lucas Henrique Ferreira Pavão", "df12@434C", "lucashenrique1@gmail.com", "15/06/1999");
		UsuarioRepositorio ur = new UsuarioRepositorio();
		Boolean cadastrou = ur.addUsuario(u);
		assertTrue(cadastrou);
	}
	
//	@Test
//	public void cadastrarUsuarioDadosCorretosTest() {
//		Usuario u = new Usuario("Vilmar", 40, "1111111");
//		
//		UsuarioRepositorio ur = new UsuarioRepositorio();
//		
//		UsuarioNegocio un = new UsuarioNegocio(ur);
//		
//		Boolean cadastrou = un.cadastrarUsuarioNome(u);
//		assertTrue(cadastrou);
//	}
//	
//	
//	@Test
//	public void cadastrarUsuarioNomeIncorretoTest() {
//		Usuario u = new Usuario("Vilmar segundo", 40, "1111111");
//		
//		UsuarioRepositorio ur = new UsuarioRepositorio();
//		
//		UsuarioNegocio un = new UsuarioNegocio(ur);
//		
//		Boolean cadastrou = un.cadastrarUsuarioNome(u);
//		assertTrue(cadastrou);
//	}
//	
//	
//	@Test
//	public void cadastrarUsuarioIdadeIncorretaTest() {
//		Usuario u = new Usuario("Vilmar segundo", 16, "1111111");
//		
//		UsuarioRepositorio ur = new UsuarioRepositorio();
//		
//		UsuarioNegocio un = new UsuarioNegocio(ur);
//		
//		Boolean cadastrou = un.cadastrarUsuarioIdade(u);
//		assertTrue(cadastrou);
//	}
//	
//	@Test
//	public void cadastrarUsuarioCpfExistenteTest() {
//		Usuario u = new Usuario("Vilmar segundo", 16, "122222");
//		
//		UsuarioRepositorio ur = new UsuarioRepositorio();
//		
//		UsuarioNegocio un = new UsuarioNegocio(ur);
//		
//		Boolean cadastrou = un.cadastrarUsuarioCpf(u);
//		assertTrue(cadastrou);
//	}
	
}
