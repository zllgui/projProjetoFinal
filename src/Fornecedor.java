/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luiz
 */
public class Fornecedor {
    //Declarando atributos:
    private String nome;
    private String telefone;
    private String email;
    private Endereco endereco; 
    //Sets e Gets:
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    //toString:
    @Override
    public String toString() {
        return  "\nNome: " + nome + 
                "\nTelefone: " + telefone + 
                "\nEmail: " + email + 
                "\nEndereco: " + endereco;
    }
    
}
