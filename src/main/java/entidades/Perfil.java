package main.java.entidades;

public class Perfil {
	
private String imagem; 

 private String nome; 
 private String sobrenome;
 private String endereco;
 private String dataNascimento;
 private String cartao;

 public Perfil(String nome,  String sobrenome,  String endereco, String dataNascimento,String cartao, String imagem) {
		this.setNome(nome);
		this.setSobrenome(sobrenome);
		this.setEndereco(endereco);

		this.setDataNascimento(dataNascimento);
		this.setCartao(cartao);
		this.setImagem(imagem);

 }

public String getImagem() {
	return imagem;
}

public void setImagem(String imagem) {
	this.imagem = imagem;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getSobrenome() {
	return sobrenome;
}

public void setSobrenome(String sobrenome) {
	this.sobrenome = sobrenome;
}

public String getEndereco() {
	return endereco;
}

public void setEndereco(String endereco) {
	this.endereco = endereco;
}

public String getDataNascimento() {
	return dataNascimento;
}

public void setDataNascimento(String dataNascimento) {
	this.dataNascimento = dataNascimento;
}

public String getCartao() {
	return cartao;
}

public void setCartao(String cartao) {
	this.cartao = cartao;
}


 
 

	
}
