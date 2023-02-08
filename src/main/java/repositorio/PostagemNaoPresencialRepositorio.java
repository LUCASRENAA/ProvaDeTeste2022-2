package main.java.repositorio;

import main.java.entidades.PostagemNaoPresencial;

import java.util.ArrayList;
import java.util.List;

public class PostagemNaoPresencialRepositorio {

    private List<PostagemNaoPresencial> PostagemNaoPresencial;

    public PostagemNaoPresencialRepositorio() {
        this.PostagemNaoPresencial = new ArrayList<PostagemNaoPresencial>();
    }

    public boolean addPostagemNaoPresencial(PostagemNaoPresencial pn) {
        return this.PostagemNaoPresencial.add(pn);
    }

}
