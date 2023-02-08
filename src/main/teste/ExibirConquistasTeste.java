package main.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.entidades.Conquistas;
import main.java.entidades.Usuario;
import main.java.repositorio.ConquistasRepositorio;
import main.java.repositorio.UsuarioRepositorio;

public class ExibirConquistasTeste {

	// Caso de teste 09 exibirConquistas feito por Izavan Correia
	@Test
	public void exibirConquistasTest() {
		Usuario u = new Usuario("Lucas Henrique Ferreira Pavão", "lucashenrique1@gmail.com", "df12@434C", "15/06/1999",
				"Rua Manoel do Carmo", "visa");
		UsuarioRepositorio ur = new UsuarioRepositorio();
		ur.addUsuario(u);
		Conquistas c = new Conquistas ("Primeiro level atingido", u);
		ConquistasRepositorio cr = new ConquistasRepositorio();
		cr.addConquistas(c);
		
		String conquistaEsperada = "Primeiro level atingido";		
		String atual = u.exibirConquistas(c);
		
		 assertEquals(conquistaEsperada, atual);

	}

}
