package main.java.repositorio;

import java.util.ArrayList;
import java.util.List;

import main.java.entidades.Usuario;

public class UsuarioRepositorio {

	private List<Usuario> usuarios;

	public UsuarioRepositorio() {
		this.usuarios = new ArrayList<Usuario>();
	}

	public boolean addUsuario(Usuario u) {

		return this.usuarios.add(u);
	}

	public boolean isValidLogin(String email, String senha) {
		for (Usuario usuario : usuarios) {
			if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)) {
				return true;
			}
		}
		return false;
	}

}
