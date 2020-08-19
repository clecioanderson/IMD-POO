/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_aula09_auto;

/**
 *
 * @author clecioferreira
 */
public class Pessoa {
    protected String nome;
    protected String cpf;
    
    public void mostraDados(){
        System.out.println("\n===== Informacoes Pessoais =====");
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF: "+this.cpf);
    }
    
    Pessoa(){
        super();
        this.nome = "ATUALIZAR CADASTRO";
        this.cpf = "ATUALIZAR CADASTRO";
    }
    
    Pessoa(String n, String c){
        super();
        this.nome = n;
        this.cpf = c;
    }
    
    Pessoa(String n){
        super();
        this.nome = n;
        this.cpf = "ATUALIZAR CADASTRO";
    }
    
}
