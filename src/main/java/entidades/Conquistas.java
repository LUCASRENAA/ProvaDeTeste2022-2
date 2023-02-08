package main.java.entidades;

public class Conquistas {
	
	private String nome;
	private Usuario usuario;
	
	public Conquistas (String nome, Usuario usuario) {
		this.setNome(nome);
		this.setUsuario(usuario);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
