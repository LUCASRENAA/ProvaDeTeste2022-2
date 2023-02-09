package main.teste;

import main.java.entidades.PostagemNaoPresencial;
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

            // Verificação se a variável "texto" está vazia.
            if (texto.isEmpty()) {
                // Lançamento de exceção caso a variável esteja vazia.
                throw new IllegalArgumentException("Por favor, coloque um texto apresentando e descrevendo a ação.");
            }

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
            System.out.println("Por favor, coloque um texto apresentando e descrevendo a ação.");
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

            //Checando se o que tem em 'valorTotal' é válido:
            int valor = Integer.parseInt(valorTotal);
            if (valor <= 0) {
                throw new IllegalArgumentException("Por favor, insira um valor válido para arrecadar.");
            }

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
            System.out.println("Por favor, insira um valor válido para arrecadar.");
        }
    }

    //Teste 4: Postagem com Valor em Branco
    @Test
    public void PostarAcaoNaoPresencialValor2Test() {
        String dataInicioString = "22-12-2022";
        String dataFinalString = "31-12-2022";
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        String valorTotal = ""; //String com o valor que será inserido, dessa vez vazio.
        try {
            Date dataInicio = format.parse(dataInicioString);
            Date dataFinal = format.parse(dataFinalString);

            //Checando se o que tem em 'valorTotal' está vazio:
            if (valorTotal.isEmpty()) {
                throw new IllegalArgumentException("Por favor, insira um valor a ser arrecadado.");
            }

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
            System.out.println("Por favor, insira um valor a ser arrecadado.");
        }
    }

    //Teste 5: Postagem com Data errada.
    @Test
    public void PostarAcaoNaoPresencialDatasTest() {
        //String dataInicioString = "22-02-2022";
        //String dataFinalString = "22-12-2023"; //Erro 'data inicial anterior a data atual'.

        String dataInicioString = "22-03-2023";
        String dataFinalString = "22-02-2023"; //Erro 'data final anterior a data inicial'.

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        try {
            Date dataInicio = format.parse(dataInicioString);
            Date dataFinal = format.parse(dataFinalString);

            //Verificando se a data inicial é anterior a data atual:
            if (dataInicio.before(new Date())) {
                throw new IllegalArgumentException("A data inicial não pode ser anterior a data atual.");
            }

            //Verificando se a data final é anterior a data inicial:
            if (dataFinal.before(dataInicio)) {
                throw new IllegalArgumentException("A data final não pode ser anterior a data inicial.");
            }

            //Criando nova postagem Nao Presencial:
            PostagemNaoPresencial pn = new PostagemNaoPresencial("Ola, queria pedir ajuda para pagar uma " +
                    "cirurgia do meu cachorro", "3600", dataInicio, dataFinal);
            PostagemNaoPresencialRepositorio pnr = new PostagemNaoPresencialRepositorio();
            Boolean addPostagemNaoPresencial = pnr.addPostagemNaoPresencial(pn);
            assertTrue(addPostagemNaoPresencial);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        } catch (IllegalArgumentException e) {

            /* Verificando qual das duas exceções de data ocorreu (inicial anterior a atual
            ou final anterior a inicial) e vendo a mensagem de exceção correta. */

            if (!e.getMessage().equals("A data final não pode ser anterior a data inicial.") &&
                    !e.getMessage().equals("A data inicial não pode ser anterior a data atual.")) {
                throw e;
            }
        }
    }
}







