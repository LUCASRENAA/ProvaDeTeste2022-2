package main.java.repositorio;

import java.util.ArrayList;
import java.util.List;

import main.java.entidades.Perfil;

public class PerfilRepositorio {

	private List<Perfil> perfis;
	
	public PerfilRepositorio () {
		this.perfis = new ArrayList<Perfil>();
	}
	
	public boolean addPerfil(Perfil u) {
		
		return this.perfis.add(u);
	}
	
	
}
