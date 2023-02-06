package main.teste;

import main.java.entidades.Perfil;
import main.java.entidades.Usuario;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import static org.junit.Assert.assertTrue;


public class SeguirPerfil {

    @Test
    public void testSeguirConta() throws ParseException {

        //Criação da variável data no formato String + conversão para Date.

        //String dataNascimento = "22-03-2023";
        String dataEmString2 = "05/05/2000";
        SimpleDateFormat formato2 = new SimpleDateFormat("dd/MM/yyyy");
        Date data2 = formato2.parse(dataEmString2);

        //Criação de novo usuário e perfil

        Usuario usuario = new Usuario("Lucas Henrique Ferreira Pavão", "df12@434C", "lucashenrique1@gmail.com", "15/06/1999");
        Perfil perfil = new Perfil("Rei", "Arthur", "Praça do marco zero", data2, "1234 5678 9012 3456", "imagem.jpg");

        // Seguir o perfil
        boolean followSuccessful = usuario.seguir(perfil);

        // Ver se o ato de seguir foi bem-sucedido.
        assertTrue(followSuccessful);

    }
}

