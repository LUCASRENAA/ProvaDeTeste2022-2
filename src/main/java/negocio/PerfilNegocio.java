package main.java.negocio;

import java.util.Date;

import main.java.entidades.Usuario;
import main.java.repositorio.UsuarioRepositorio;
import java.util.Calendar;
import java.util.Date;


public class PerfilNegocio {
	
	 public boolean validarDataPerfil(Date dataPerfil) {
	        Date dataAtual = new Date();
	        return dataPerfil.before(dataAtual);
	    }
	 
	 public boolean validarDataNascimento(Date dataNascimento) {
	        Calendar hoje = Calendar.getInstance();
	        Calendar dataNascimentoPerfil = Calendar.getInstance();
	        dataNascimentoPerfil.setTime(dataNascimento);

	        return dataNascimentoPerfil.before(hoje);
	    }
}
