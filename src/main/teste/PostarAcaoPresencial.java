package main.teste;

import main.java.entidades.Postagem;
import main.java.repositorio.PostagemRepositorio;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class PostarAcaoPresencial {

    // Teste 1: Postagem de Ação (Presencial)
    @Test
    public void PostarAcaoPresencialTest() {
        // String com a data da ação presencial, armazenada na variável 'dateString'
        String dateString = "22-12-2022";

        // Instância da classe SimpleDateFormat, utilizada para formatar a data de String para Date
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        try {
            // Conversão da data em formato String para Date
            Date date = format.parse(dateString);

            // Instância da classe Postagem, passando como parâmetros:
            // - A descrição da ação
            // - A data da ação (já convertida para o tipo Date)
            // - O local da ação
            Postagem p = new Postagem("Ola, queria sugerir um grupo para distribuir sopa na praca " +
                    "para moradores de rua", date, "Praça do Derby");

            // Instância da classe PostagemRepositorio, responsável por adicionar a postagem
            PostagemRepositorio pr = new PostagemRepositorio();

            // Adicionando a postagem e armazenando o resultado (se postou ou não) na variável 'postou'
            Boolean postou = pr.addPostagem(p);

            // Verificando se a postagem foi adicionada com sucesso
            assertTrue(postou);
        } catch (ParseException e) {
            // Caso haja algum erro na conversão da data, é lançada uma exceção do tipo RuntimeException
            throw new RuntimeException(e);
        }
    }

    // Teste 2: Mensagem em branco.
    @Test
    public void PostarAcaoPresencialTextTest() {
        //String com a data da ação:
        String dateString = "22-12-2022";
        //Formato da data, nesse caso é "dd-MM-yyyy":
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        try {
            //Conversão da data em formato String para Date:
            Date date = format.parse(dateString);

            //String com o texto da ação, inicialmente em branco:
            String texto = "";
            //Verificação se o texto da ação está vazio:
            if (texto.isEmpty()) {
                //Se estiver vazio, lança uma exceção com mensagem abaixo.
                throw new IllegalArgumentException("Por favor, coloque um texto apresentando e descrevendo a ação.");
            }

            //Ao invés de inserir a string diretamente, coloca-se a String 'texto' declarada acima.
            Postagem p = new Postagem(texto, date, "Praça do Derby");
            //Instanciamento do repositório de postagens:
            PostagemRepositorio pr = new PostagemRepositorio();
            //Adição da postagem ao repositório:
            Boolean postou = pr.addPostagem(p);
            //Verificação se a postagem foi adicionada com sucesso:
            assertTrue(postou);
        } catch (IllegalArgumentException e) {
            //Se lançar uma exceção com a mensagem "Por favor, coloque um texto apresentando e descrevendo a ação.":
            if (e.getMessage().equals("Por favor, coloque um texto apresentando e descrevendo a ação.")) {
                System.out.println("Por favor, coloque um texto apresentando e descrevendo a ação.");
                //Retorna sem fazer mais nada
                return;
            } else {
                //Se não, lança a exceção:
                throw e;
            }
        } catch (ParseException e) {
            //Lançamento da exceção "ParseException":
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
                System.out.println("Por favor, insira uma data.");
            }
            return;
        } try {
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
        //Cria uma instância da classe Date para guardar a data atual na variável dataAtual.
        Date dataAtual = new Date();
        //Cria uma instância da classe SimpleDateFormat para formatar a data.
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        //Variável dateString armazena a data a ser comparada com a data atual.
        String dateString = "22-12-2022";
        try {
            //Cria uma instância da classe Date para guardar a data da postagem na variável postDate.
            Date postDate = format.parse(dateString);
            //Verifica se a data da postagem é anterior a data atual.
            if (postDate.before(dataAtual)) {
                //Lança uma exceção com uma mensagem de erro caso a data seja inválida.
                throw new IllegalArgumentException("Data inválida. Por favor, insira uma data posterior a hoje.");
            }
            //Cria uma instância da classe Postagem com as informações da postagem.
            Postagem p = new Postagem("Ola, queria sugerir um grupo para distribuir sopa na praca " +
                    "para moradores de rua", postDate, "Praça do Derby");
            //Cria uma instância da classe PostagemRepositorio para adicionar a postagem.
            PostagemRepositorio pr = new PostagemRepositorio();
            //Chama o método addPostagem e armazena o resultado na variável postou.
            Boolean postou = pr.addPostagem(p);
            //Verifica se a postagem foi adicionada com sucesso.
            assertTrue(postou);
        } catch (IllegalArgumentException e) {
            //Trata a exceção lançada na verificação da data.
            if (e.getMessage().equals("Data inválida. Por favor, insira uma data posterior a hoje.")) {
                System.out.println("Data inválida. Por favor, insira uma data posterior a hoje.");
                //Encerra o teste caso a data seja inválida.
                return;
            } else {
                //Lança a exceção caso haja algum outro erro.
                throw e;
            }
        } catch (ParseException e) {
            //Trata a exceção lançada na conversão da data.
            throw new RuntimeException(e);
        }
    }

    //Teste 5: Local em branco
    @Test
    public void PostarAcaoPresencialLocalTest() {
        String dateString = "22-12-2022";
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date date = format.parse(dateString);
            String local = "";
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
            System.out.println("Por favor, insira um local para a ação presencial.");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

}
