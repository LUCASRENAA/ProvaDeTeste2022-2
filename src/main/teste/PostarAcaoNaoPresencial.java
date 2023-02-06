package main.teste;

import main.java.entidades.PostagemNaoPresencial;
import main.java.repositorio.PostagemNaoPresencialRepositorio;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertTrue;

public class PostarAcaoNaoPresencial {

    /* @Teste no. 1:
     * 1. Declarar os valores que serão cadastrados na ação (Data inicial, Data final, valor e texto).
     * 2. Converter ambas datas inicial e final para Date. Elas serão salvas em String.
     * 3. Cria-se a postagemNaoPresencial.
     * */

    //Teste 1: Postagem de Ação (Não Presencial)

    @Test
    public void PostarAcaoNaoPresencialTest() {

        //Declaração dos valores.

        String dataInicioString = "22-12-2022";
        String dataFinalString = "31-12-2022";
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        try {

            //Convertendo data inicial e final para Date:

            Date dataInicio = format.parse(dataInicioString);
            Date dataFinal = format.parse(dataFinalString);

            //Criando nova postagem Nao Presencial:

            PostagemNaoPresencial pn = new PostagemNaoPresencial("Ola, queria pedir ajuda para pagar uma cirurgia do meu " +
                    "cachorro","3600", dataInicio, dataFinal);
            PostagemNaoPresencialRepositorio pnr = new PostagemNaoPresencialRepositorio();
            Boolean addPostagemNaoPresencial = pnr.addPostagemNaoPresencial(pn);
            assertTrue(addPostagemNaoPresencial);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    //Teste 2: Postagem de Ação Não Presencial (Sem Texto)

    @Test
    public void PostarAcaoNaoPresencialTextoTest() {

        //Declaração dos valores.

        String dataInicioString = "22-12-2022";
        String dataFinalString = "31-12-2022";
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        String texto = ""; //String com o texto que será inserido, dessa vez em branco.

        //Descomentar caso queira que o teste passe:
        //String texto = "Ola, queria pedir ajuda para pagar uma cirurgia do meu cachorro";

        try {

            //Convertendo data inicial e final para Date:

            Date dataInicio = format.parse(dataInicioString);
            Date dataFinal = format.parse(dataFinalString);

            //Checando se tem algo em 'texto':

            if (texto.isEmpty()) {
                throw new IllegalArgumentException("Por favor, coloque um texto apresentando e descrevendo a ação.");
            }

            //Criando nova postagem Nao Presencial:

            PostagemNaoPresencial pn = new PostagemNaoPresencial(texto,"3600", dataInicio, dataFinal);
            PostagemNaoPresencialRepositorio pnr = new PostagemNaoPresencialRepositorio();
            Boolean addPostagemNaoPresencial = pnr.addPostagemNaoPresencial(pn);
            assertTrue(addPostagemNaoPresencial);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    //Teste 3: Postagem com Valor Inválido (Número negativo)

    @Test
    public void PostarAcaoNaoPresencialValor1Test() {

        //Declaração dos valores:

        String dataInicioString = "22-12-2022";
        String dataFinalString = "31-12-2022";
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        String valorTotal = "-3600"; //String com o valor que será inserido, dessa vez em inválido.
        //String valorTotal = "3600"; //Descomentar caso queira que o teste passe.

        try {

            //Convertendo data inicial e final para Date:

            Date dataInicio = format.parse(dataInicioString);
            Date dataFinal = format.parse(dataFinalString);


            //Checando se to que tem em 'valorTotal' é válido:

            int valor = Integer.parseInt(valorTotal);
            if (valor <= 0) {
                throw new IllegalArgumentException("Por favor, insira um valor válido para arrecadar.");
            }

            //Criando nova postagem Nao Presencial:

            PostagemNaoPresencial pn = new PostagemNaoPresencial("Ola, queria pedir ajuda para pagar uma cirurgia do meu " +
                    "cachorro", valorTotal, dataInicio, dataFinal);
            PostagemNaoPresencialRepositorio pnr = new PostagemNaoPresencialRepositorio();
            Boolean addPostagemNaoPresencial = pnr.addPostagemNaoPresencial(pn);
            assertTrue(addPostagemNaoPresencial);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    //Teste 4: Postagem com Valor em Branco

    @Test
    public void PostarAcaoNaoPresencialValor2Test() {

        //Declaração dos valores:

        String dataInicioString = "22-12-2022";
        String dataFinalString = "31-12-2022";
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        String valorTotal = ""; //String com o valor que será inserido, dessa vez vazio.
        //String valorTotal = "3600"; //Descomentar caso queira que o teste passe.

        try {

            //Convertendo data inicial e final para Date:

            Date dataInicio = format.parse(dataInicioString);
            Date dataFinal = format.parse(dataFinalString);


            //Checando se to que tem em 'valorTotal' está vazio:

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
        }
    }

    //Teste 5: Postagem com Data errada.

    @Test
    public void PostarAcaoNaoPresencialDatasTest() {
        //Declaração dos valores:

        /* String dataInicioString = "22-02-2023";
        String dataFinalString = "22-12-2023"; //Descomentar caso queira que o teste passe. */

        /*String dataInicioString = "22-02-2022";
        String dataFinalString = "22-12-2023"; //Descomentar para ver erro 'data inicial anterior a data atual'.*/

        String dataInicioString = "22-03-2023";
        String dataFinalString = "22-02-2023";

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        try {

            //Convertendo data inicial e final para Date:

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
                    "cirurgia do meu cachorro","3600", dataInicio, dataFinal);
            PostagemNaoPresencialRepositorio pnr = new PostagemNaoPresencialRepositorio();
            Boolean addPostagemNaoPresencial = pnr.addPostagemNaoPresencial(pn);
            assertTrue(addPostagemNaoPresencial);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

}







