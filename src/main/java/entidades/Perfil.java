package main.java.entidades;

import java.util.Date;

import java.util.ArrayList;
import java.util.List;

public class Perfil {
    private String nome;
    private String sobrenome;
    private String endereco;
    private Date dataNascimento;
    private String cartao;
    private String imagem;
    private List<Perfil> seguidos;

    public Perfil(String nome, String sobrenome, String endereco, Date dataNascimento, String cartao, String imagem) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.cartao = cartao;
        this.imagem = imagem;
        this.setSeguidos(new ArrayList<Perfil>());
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

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

	public List<Perfil> getSeguidos() {
		return seguidos;
	}

	public void setSeguidos(List<Perfil> seguidos) {
		this.seguidos = seguidos;
	}
}
