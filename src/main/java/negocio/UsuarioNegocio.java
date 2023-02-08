package main.java.negocio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import main.java.entidades.Usuario;
import main.java.repositorio.UsuarioRepositorio;

public class UsuarioNegocio {

	private UsuarioRepositorio repo;

	public UsuarioNegocio(UsuarioRepositorio rep) {
		this.repo = rep;
	}

	public boolean cadastrarUsuario(Usuario u) {
		boolean ret = false;
		Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*\\d).{8,64}$");
		Matcher matcher = pattern.matcher(u.getSenha());

		if (matcher.matches()) {
			ret = this.repo.addUsuario(u);
		}

		return ret;
	}

	private static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern
			.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

	public boolean cadastrarUsuarioEmailIncorreto(Usuario u) {
		boolean ret = false;
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(u.getEmail());
		
		if(matcher.find()) {
			ret = this.repo.addUsuario(u);
		}
		return ret;
	}

}
