/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luiz
 */
public class Endereco {
    //Declarando atributos:
    private String rua;
    private String numero;
    private String cidade;
    private String estado;
    private String cep;	
    //Sets e Gets:
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    //toString:
    @Override
    public String toString() {
        return  "\nRua: " + rua + 
                "\nNumero: " + numero + 
                "\nCidade: " + cidade + 
                "\nEstado: " + estado + 
                "\nCep: " + cep;
    }
}
