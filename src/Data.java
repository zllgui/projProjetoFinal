/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guilherme Luzzi
 */
public class Data {
    //Declarando atributos:
    private byte dia;
    private byte mes;
    private int ano; 
    //Sets e Gets:
    public byte getDia() {
        return dia;
    }

    public void setDia(byte dia) {
        this.dia = dia;
    }

    public byte getMes() {
        return mes;
    }

    public void setMes(byte mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
     //Validando data:
    public boolean verificarErro() {
        boolean erro;
        erro = dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano < 0
                || (dia == 31 && (mes == 4 || mes == 6 || mes == 9 || mes == 
11))
                || (dia == 29 && mes == 2 && ano % 4 != 0);
        if (erro) {
            return true;
        } else {
            return false;
        }
    }
    //toString:
    @Override
    public String toString() {
        return  dia + "/" + mes + "/" + ano;
    }
    
}
