package main.java.entidades;

import java.util.Date;

public class PostagemNaoPresencial {
    private String texto;
    private String valorArrecadado;
    Date dataInicioString;
    Date dataFinalString;

    public String getTexto() {
        return texto;
    }

    public String getValorArrecadado() {
        return valorArrecadado;
    }

    public void setValorArrecadado(String valorArrecadado) {
        this.valorArrecadado = valorArrecadado;
    }

    public Date getDataInicioString() {
        return dataInicioString;
    }

    public void setDataInicioString(Date dataInicioString) {
        this.dataInicioString = dataInicioString;
    }

    public Date getDataFinalString() {
        return dataFinalString;
    }

    public void setDataFinalString(Date dataFinalString) {
        this.dataFinalString = dataFinalString;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public PostagemNaoPresencial(String texto, String valorArrecadado, Date dataInicioString, Date dataFinalString) {
        this.texto = texto;
        this.valorArrecadado = valorArrecadado;
        this.dataInicioString = dataInicioString;
        this.dataFinalString = dataFinalString;
    }
}
