package main.java.entidades;

public class Usuario {

	private String nome;
	private String email;
	private String senha;
	private String dataNascimento;
	private String endereco;
	private String cartao;
	

	public Usuario(String nome, String email, String senha, String dataNascimento, String endereco, String cartao) {
		this.setNome(nome);
		this.setEmail(email);
		this.setSenha(senha);
		this.setDataNascimento(dataNascimento);	
		this.setEndereco(endereco);
		this.setCartao(cartao);	
	}
	
	public String exibirConquistas (Conquistas conquista) {
		
		return conquista.getNome();
	}

	public boolean seguir(Perfil perfil) {
		return true;
	}

	public boolean unfollow(Perfil perfil) {
		return true;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCartao() {
		return cartao;
	}

	public void setCartao(String cartao) {
		this.cartao = cartao;
	}

}
