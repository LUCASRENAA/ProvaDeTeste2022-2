package main.java.entidades;
import java.util.Date;

public class Postagem {
    private String texto;
    private String nome;
    private int curtir = 0;
	private Date data;
    private String local;
    private int contador = 0;

    public Postagem(String texto, Date data, String local) {
        this.setTexto(texto);
        this.setData(data);
        this.setLocal(local);
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    public String getNome() {
  		return nome;
  	}

  	public void setNome(String nome) {
  		this.nome = nome;
  	}

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void participarDaAcao() {
        contador++;
    }

    public int getContador() {
        return contador;
    }
    
    public void deixarDeParticiparDaAcao() {
        contador--;
    }

	public int getCurtir() {
		return curtir;
	}

	public void setCurtir(int curtir) {
		this.curtir = curtir;
	}
	public void curtirAcao() {
		curtir++;
	}
	public void descurtirAcao() {
		curtir--;
	}
}