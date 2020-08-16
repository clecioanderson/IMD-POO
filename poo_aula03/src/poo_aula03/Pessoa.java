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
    String nome;
    int idade;
    String sexo;
    Carro carro;
    
    Carro getCarro(){
        return carro;
    }
    
    void setCarro(Carro carro){
        this.carro = carro;
    }
    
    void ligarCarro(){
        carro.ligar();
    }
    void desligarCarro(){
        carro.desligar();
    }
    void acelerarCarro(){
        carro.acelerar();
    }
    void frearCarro(){
        carro.frear();
    }
    void setCambioCarro(int n){
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
