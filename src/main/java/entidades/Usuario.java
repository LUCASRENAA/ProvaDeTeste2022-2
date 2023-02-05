package main.java.entidades;

public class Usuario {
	
 private String nome; 
 private String senha;
 private String usuario;
 private String dataNascimento;


 public Usuario(String nome,  String senha,  String usuario, String dataNascimento) {
	this.setNome(nome);
	this.setSenha(senha);
	this.setUsuario(usuario);
	this.setDataNascimento(dataNascimento);
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


public String getUsuario() {
	return usuario;
}


public void setUsuario(String usuario) {
	this.usuario = usuario;
}


public String getDataNascimento() {
	return dataNascimento;
}


public void setDataNascimento(String dataNascimento) {
	this.dataNascimento = dataNascimento;
}

	
}
