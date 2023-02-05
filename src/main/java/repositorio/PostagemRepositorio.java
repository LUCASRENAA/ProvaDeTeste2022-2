package main.java.repositorio;

import java.util.ArrayList;
import java.util.List;

import main.java.entidades.Postagem;

public class PostagemRepositorio {

	private List<Postagem> postagens;
	
	public PostagemRepositorio () {
		this.postagens = new ArrayList<Postagem>();
	}
	
	public boolean addUsuario(Postagem u) {
		
		return this.postagens.add(u);
	}
	
	
}
