/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_aula07_04;

/**
 *
 * @author clecioferreira
 */
public class Automovel extends Terrestre {
    protected String cor;
    protected int numPortas;
    protected String placa;

    public void setCor(String c){
        this.cor = c;
    }
    public String getCor(){
        return this.cor;
    }
    public void setNumPortas(int s){
        this.numPortas = s;
    }
    public int getNumPortas(){
        return this.numPortas;
    }
    public void setPlaca(String p){
        this.placa = p;
    }
    public String getPlaca(){
        return this.placa;
    }
}
