package main.java.repositorio;

import java.util.ArrayList;
import java.util.List;

import main.java.entidades.Conquistas;

public class ConquistasRepositorio {
	
	private List<Conquistas> conquistas;

	public ConquistasRepositorio() {
		this.conquistas = new ArrayList<Conquistas>();
	}

	public boolean addConquistas(Conquistas c) {

		return this.conquistas.add(c);
	}

}
