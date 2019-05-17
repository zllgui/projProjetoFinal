/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guilherme Souza
 */
public class Celular {
    //Declarando atributos:
    private int codigo;
    private String marca;
    private String modelo;
    private String cor;
    private double preco;
    private Fornecedor fornecedor;
    private Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
    //Sets e Gets:
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    //toString:
    @Override
    public String toString() {
        return  "\nCódigo:" + codigo + 
                "\nMarca:" + marca + 
                "\nModelo:" + modelo + 
                "\nCor: " + cor + 
                "\nPreço: " + preco + 
                "\nDados do Fornecedor: " + fornecedor +
                "\nData de estoque do celular: "+ data;
    }
    
}
