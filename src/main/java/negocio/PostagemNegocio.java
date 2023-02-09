package main.java.negocio;

import java.util.Date;

public class PostagemNegocio {

    //Verificação de Texto (em branco)
    public static void verificaTexto(String texto) {
        if (texto.isEmpty()) {
            System.out.println("Por favor, coloque um texto apresentando e descrevendo a ação.");
            throw new IllegalArgumentException("Por favor, coloque um texto apresentando e descrevendo a ação.");
        }
    }

    //Verificação da data (em branco)
    public static void verificaDataEmBranco(String dateString) {
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

    //Verificação se o valor é válido (acima de zero).
    public static void verificaValorValido(String valorTotal) {
        int valor = Integer.parseInt(valorTotal);
        if (valor <= 0) {
            System.out.println("Por favor, insira um valor válido para arrecadar.");
            throw new IllegalArgumentException("Por favor, insira um valor válido para arrecadar.");
        }
    }
    public static void verificarValorEmBranco(String valorTotal) {
        if (valorTotal.isEmpty()) {
            System.out.println("Por favor, insira um valor a ser arrecadado.");
            throw new IllegalArgumentException("Por favor, insira um valor a ser arrecadado.");
        }
    }

    //Verificações de datas iniciais e finais - Não Presencial
    public static void verificaDataInicio(Date dataInicio) {
        if (dataInicio.before(new Date())) {
            throw new IllegalArgumentException("A data inicial não pode ser anterior a data atual.");
        }
    }
    public static void verificaDataFinal(Date dataInicio, Date dataFinal) {
        if (dataFinal.before(dataInicio)) {
            throw new IllegalArgumentException("A data final não pode ser anterior a data inicial.");
        }
    }
}
