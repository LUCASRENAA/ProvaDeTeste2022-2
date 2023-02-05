package main.teste;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.java.entidades.Perfil;
import main.java.entidades.Postagem;
import main.java.entidades.Usuario;
import main.java.negocio.UsuarioNegocio;
import main.java.repositorio.UsuarioRepositorio;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Date;

import org.junit.Test;

public class PostagemParticiparAcao {

	@Test
	public void postagemVerificarValorDeixarDeParticiparAcaoTest() {

		 Postagem postagem = new Postagem("Texto de exemplo", new Date(), "Local de exemplo");
	        postagem.participarDaAcao();
	        int contadorAntes = postagem.getContador();
	        postagem.deixarDeParticiparDaAcao();
	        int contadorDepois = postagem.getContador();
	        assertEquals(contadorAntes - 1, contadorDepois);
		    
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
