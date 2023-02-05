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

public class EditarPerfilImagemErrada {

	@Test
	public void editarPerfilErradoImagemTest() {
		Perfil perfil = new Perfil("Rei", "Arthur", "Praça do marco zero", "05/05/2000", "1234 5678 9012 3456", "imagem.jpg");

        try {
            perfil.setImagem("");
            fail("Deve lançar exceção de imagem vazia");
        } catch (IllegalArgumentException e) {
            assertEquals("Imagem não pode ser vazia", e.getMessage());
        }
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
