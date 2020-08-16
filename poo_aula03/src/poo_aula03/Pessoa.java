/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_aula03;

/**
 *
 * @author clecioferreira
 */
public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    private Carro carro;
    
    public Carro getCarro(){
        return carro;
    }
    
    public void setCarro(Carro carro){
        this.carro = carro;
    }
    
    public void ligarCarro(){
        carro.ligar();
    }
    public void desligarCarro(){
        carro.desligar();
    }
    public void acelerarCarro(){
        carro.acelerar();
    }
    public void frearCarro(){
        carro.frear();
    }
    public void setCambioCarro(int n){
        carro.setCambio(n);
    }
    public void setNome(String n){
        this.nome = n;
    }
    public void setSexo(String n){
        this.nome = n;
    }
    public void setIdade(int age){
        this.idade = age;
    }
    public int getIdade(){
        return this.idade;
    }
    public String getNome(){
        return this.nome;
    }
    public String getSexo(){
        return this.sexo;
    }
    Pessoa(){}
    Pessoa(String n, String s, int ag){
        this.idade=ag;
        this.nome=n;
        this.sexo=s;
    }
}
