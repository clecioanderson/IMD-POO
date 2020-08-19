/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_aula09_at02;

/**
 *
 * @author clecioferreira
 */
public class Brinquedo {
    private String nome;
    private double velocidade;
    private double aceleracao;
    
    public void Brinquedo(){
        
    }
    
    public void Brinquedo(String n){
        this.nome = n;
    }
    
    public void mover(){
        System.out.println("Em movimento.");
    }
    
    public void velocidade(int vel){
        this.velocidade = vel;
        System.out.println("Velocidade atual: "+this.velocidade);
    }
    
    public void velocidade(double vel){
        this.velocidade = vel;
        System.out.println("Velocidade atual: "+this.velocidade);
    }
    
    public void velocidade(float vel, double ac){
        this.velocidade = vel;
        this.aceleracao = ac;
        System.out.println("Velocidade atual: "+this.velocidade);
        System.out.println("Aceleração atual: "+this.aceleracao);
    }
}
