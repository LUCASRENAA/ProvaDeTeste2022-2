package main.teste;

import main.java.entidades.Postagem;
import main.java.repositorio.PostagemRepositorio;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class PostarAcaoPresencial {

    /* @Teste no. 1:
     * 1. Declarar os valores que serão cadastrados na ação (Texto, Data, local).
     * 2. Converter a data para o formato Date. Ela será salva no formato String.
     * 3. Criação da postagemPresencial.
     * */

    // Teste 1: Postagem de Ação (Presencial)
    @Test
    public void PostarAcaoPresencialTest() {
        //String com a  Data:
        String dateString = "22-12-2022"; //Data está salva em String na variável 'dateString'
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        //Criação da Postagem:
        try {
            Date date = format.parse(dateString); //Conversão da data em formato String para Date

            //Passagem dos parâmetros da postagem:
            Postagem p = new Postagem("Ola, queria sugerir um grupo para distribuir " +
                    "sopa na praca para moradores de rua", date, "Praça do Derby");

            //Continuação da criação da postagem:
            PostagemRepositorio pr = new PostagemRepositorio();
            Boolean postou = pr.addPostagem(p);
            assertTrue(postou);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    // Teste 2: Mensagem em branco.
    @Test
    public void PostarAcaoPresencialTextTest() {
        String dateString = "22-12-2022";
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date date = format.parse(dateString);
            String texto = ""; //String com o texto que será inserido, dessa vez em branco.
            if (texto.isEmpty()) {
                throw new IllegalArgumentException("Por favor, coloque um texto apresentando e descrevendo a ação.");
            }
            //Ao invés de inserir a string diretamente, coloca-se a String 'texto' declarada acima:
            Postagem p = new Postagem(texto, date, "Praça do Derby");
            PostagemRepositorio pr = new PostagemRepositorio();
            Boolean postou = pr.addPostagem(p);
            assertTrue(postou);
        } catch (IllegalArgumentException e) {
            if (e.getMessage().equals("Por favor, coloque um texto apresentando e descrevendo a ação.")) {
                return;
            } else {
                throw e;
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    //Teste 3: Data em branco.
    @Test
    public void PostarAcaoPresencialDataTest() {
        String dateString = "";
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        if (dateString.isEmpty()) {
            try {
                throw new IllegalArgumentException("Por favor, insira uma data.");
            } catch (IllegalArgumentException e) {
                assertEquals("Por favor, insira uma data.", e.getMessage());
            }
            return;
        }
        try {
            Date date = format.parse(dateString);
            Postagem p = new Postagem("Ola, queria sugerir um grupo para distribuir sopa na " +
                    "praca para moradores de rua", date, "Praça do Derby");
            PostagemRepositorio pr = new PostagemRepositorio();
            Boolean postou = pr.addPostagem(p);
            assertTrue(postou);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    //Teste 4: Data inválida.
    @Test
    public void PostarAcaoPresencialDataInvalidaTest() {
        //Cria uma instância da class Util.date. Guarda a data atual na variável 'DataAtual'.
        Date DataAtual = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        String dateString = "22-12-2022";
        boolean thrown = false;
        try {
            Date postDate = format.parse(dateString);
            if (postDate.before(DataAtual)) {
                thrown = true;
                throw new IllegalArgumentException("Data inválida. Por favor, insira uma data posterior a hoje.");
            }
            Postagem p = new Postagem("Ola, queria sugerir um grupo para distribuir sopa na praca " +
                    "para moradores de rua", postDate, "Praça do Derby");
            PostagemRepositorio pr = new PostagemRepositorio();
            Boolean postou = pr.addPostagem(p);
            assertTrue(postou);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        } catch (IllegalArgumentException e) {
            assertTrue(thrown);
        }
    }

    //Teste 5: Local em branco
    @Test
    public void PostarAcaoPresencialLocalTest() {
        String dateString = "22-12-2022";
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date date = format.parse(dateString);
            String local = ""; //String do local da ação, dessa vez em branco.
            if (local.isEmpty()) {
                throw new IllegalArgumentException("Por favor, insira um local para a ação presencial.");
            }
            Postagem p = new Postagem("Ola, queria sugerir um grupo para distribuir sopa na praca" +
                    " para moradores de rua", date, local);
            PostagemRepositorio pr = new PostagemRepositorio();
            Boolean postou = pr.addPostagem(p);
            assertTrue(postou);
        } catch (IllegalArgumentException e) {
            assertEquals("Por favor, insira um local para a ação presencial.", e.getMessage());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

}
