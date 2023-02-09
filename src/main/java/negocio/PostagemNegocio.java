package main.java.negocio;

import java.util.Date;

public class PostagemNegocio {

    //Verificação de Texto (em branco)
    public static void verifyTexto(String texto) {
        if (texto.isEmpty()) {
            System.out.println("Por favor, coloque um texto apresentando e descrevendo a ação.");
            throw new IllegalArgumentException("Por favor, coloque um texto apresentando e descrevendo a ação.");
        }
    }

    //Verificação da data (em branco)
    public static void DateNotBlank(String dateString) {
        if (dateString.isEmpty()) {
            System.out.println("Por favor, insira uma data.");
            throw new IllegalArgumentException("Por favor, insira uma data.");
        }
    }

    //Verificação da data (Inválida) - Presencial
    public static void verificaDataValida(Date data) {
        Date dataAtual = new Date();
        if (data.before(dataAtual)) {
            System.out.println("Por favor, insira uma data válida.");
            throw new IllegalArgumentException("Por favor, insira uma data válida.");
        }
    }

    //Verificação de local (em branco) - presencial
    public static void verificaLocalValido(String local) {
        if (local.isEmpty()) {
            System.out.println("Por favor, insira um local para a ação presencial.");
            throw new IllegalArgumentException("Por favor, insira um local para a ação presencial.");
        }
    }


}
