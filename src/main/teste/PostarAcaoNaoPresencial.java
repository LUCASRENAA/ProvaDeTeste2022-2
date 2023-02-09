package main.teste;

import main.java.entidades.PostagemNaoPresencial;
import main.java.negocio.PostagemNegocio;
import main.java.repositorio.PostagemNaoPresencialRepositorio;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;

public class PostarAcaoNaoPresencial {

    //Teste 1: Postagem de Ação (Não Presencial)
    @Test
    public void PostarAcaoNaoPresencialTest() {

        //Declaração da String de data inicial e final
        String dataInicioString = "22-12-2022";
        String dataFinalString = "31-12-2022";

        //Formatação da data para o formato "dd-MM-yyyy"
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        try {
            //Conversão da data inicial e final para o tipo Date
            Date dataInicio = format.parse(dataInicioString);
            Date dataFinal = format.parse(dataFinalString);

            //Criação de uma nova postagem (não presencial) com descrição, valor, data inicial e data final
            PostagemNaoPresencial pn = new PostagemNaoPresencial("Ola, queria pedir ajuda para pagar uma " +
                    "cirurgia do meu cachorro", "3600", dataInicio, dataFinal);

            //Adicionar a postagem não presencial ao repositório
            PostagemNaoPresencialRepositorio pnr = new PostagemNaoPresencialRepositorio();
            Boolean addPostagemNaoPresencial = pnr.addPostagemNaoPresencial(pn);

            //Verifica se a postagem foi adicionada com sucesso ao repositório
            assertTrue(addPostagemNaoPresencial);
        } catch (ParseException e) {
            //Lança uma exceção de runtime se houver erro na conversão de data
            throw new RuntimeException(e);
        }
    }

    //Teste 2: Postagem de Ação Não Presencial (Sem Texto)
    @Test
    public void PostarAcaoNaoPresencialTextoTest() {
        // Declaração das variáveis "dataInicioString" e "dataFinalString", com as datas inicial e final da postagem.
        String dataInicioString = "22-12-2022";
        String dataFinalString = "31-12-2022";
        // Declaração do formato de data utilizado nas variáveis acima.
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        // Declaração da variável "texto" que representa o texto da postagem.
        String texto = ""; //String com o texto que será inserido, dessa vez em branco.

        try {
            // Conversão das datas de "dataInicioString" e "dataFinalString" para o tipo "Date".
            Date dataInicio = format.parse(dataInicioString);
            Date dataFinal = format.parse(dataFinalString);

            //Chamada do método para verificar se o texto está em branco:
            PostagemNegocio.verificaTexto(texto);

            // Criação de uma nova postagem do tipo "PostagemNaoPresencial".
            PostagemNaoPresencial pn = new PostagemNaoPresencial(texto, "3600", dataInicio, dataFinal);
            // Criação de um objeto "pnr" do tipo "PostagemNaoPresencialRepositorio".
            PostagemNaoPresencialRepositorio pnr = new PostagemNaoPresencialRepositorio();
            // Adição da postagem ao repositório.
            Boolean addPostagemNaoPresencial = pnr.addPostagemNaoPresencial(pn);
            // Verificação se a adição foi realizada com sucesso.
            assertTrue(addPostagemNaoPresencial);
        } catch (ParseException e) {
            // Tratamento da exceção "ParseException".
            throw new RuntimeException(e);
        } catch (IllegalArgumentException e) {
            // Verificação se a exceção lançada é a esperada.
            assertEquals("Por favor, coloque um texto apresentando e " +
                    "descrevendo a ação.", e.getMessage());
        }
    }

    //Teste 3: Postagem com Valor Inválido (Número negativo)
    @Test
    public void PostarAcaoNaoPresencialValor1Test() {
        String dataInicioString = "22-12-2022";
        String dataFinalString = "31-12-2022";
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        String valorTotal = "-3600"; //String com o valor que será inserido, dessa vez inválido.

        try {

            Date dataInicio = format.parse(dataInicioString);
            Date dataFinal = format.parse(dataFinalString);

            //Chamando o método para verificar se o valor é válido:
            PostagemNegocio.verificaValorValido(valorTotal);

            //Criando nova postagem Nao Presencial:
            PostagemNaoPresencial pn = new PostagemNaoPresencial("Ola, queria pedir ajuda " +
                    "para pagar uma cirurgia do meu cachorro", valorTotal, dataInicio, dataFinal);
            PostagemNaoPresencialRepositorio pnr = new PostagemNaoPresencialRepositorio();
            Boolean addPostagemNaoPresencial = pnr.addPostagemNaoPresencial(pn);
            assertTrue(addPostagemNaoPresencial);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        } catch (IllegalArgumentException e) {
            assertEquals("Por favor, insira um valor válido para arrecadar.", e.getMessage());
        }
    }

    // Teste 4: Postagem com Valor em Branco
    @Test
    public void PostarAcaoNaoPresencialValor2Test() {
        String dataInicioString = "22-12-2022";
        String dataFinalString = "31-12-2022";
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        String valorTotal = ""; // String com o valor que será inserido, dessa vez vazio.
        try {
            Date dataInicio = format.parse(dataInicioString);
            Date dataFinal = format.parse(dataFinalString);

            //Chamando o método para verificar se o valor está em branco:
            PostagemNegocio.verificarValorEmBranco(valorTotal);

            //Criando nova postagem Nao Presencial:
            PostagemNaoPresencial pn = new PostagemNaoPresencial("Ola, queria pedir ajuda para pagar uma cirurgia do meu " +
                    "cachorro", valorTotal, dataInicio, dataFinal);
            PostagemNaoPresencialRepositorio pnr = new PostagemNaoPresencialRepositorio();
            Boolean addPostagemNaoPresencial = pnr.addPostagemNaoPresencial(pn);
            assertTrue(addPostagemNaoPresencial);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        } catch (IllegalArgumentException e) {
            assertEquals("Por favor, insira um valor a ser arrecadado.", e.getMessage());
        }
    }

    //Teste 5: Postagem com Data errada.
    @Test
    public void PostarAcaoNaoPresencialDatasTest() {
        String dataInicioString = "22-02-2022";
        String dataFinalString = "22-12-2023"; //Erro 'data inicial anterior a data atual'.

        //String dataInicioString = "22-03-2023";
        //String dataFinalString = "22-02-2023"; //Erro 'data final anterior a data inicial'.

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        try {
            Date dataInicio = format.parse(dataInicioString);
            Date dataFinal = format.parse(dataFinalString);

            PostagemNegocio.verificaDataInicio(dataInicio);
            PostagemNegocio.verificaDataFinal(dataInicio, dataFinal);

            //Criando nova postagem Nao Presencial:
            PostagemNaoPresencial pn = new PostagemNaoPresencial("Ola, queria pedir ajuda para pagar uma " +
                    "cirurgia do meu cachorro", "3600", dataInicio, dataFinal);
            PostagemNaoPresencialRepositorio pnr = new PostagemNaoPresencialRepositorio();
            Boolean addPostagemNaoPresencial = pnr.addPostagemNaoPresencial(pn);
            assertTrue(addPostagemNaoPresencial);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}







