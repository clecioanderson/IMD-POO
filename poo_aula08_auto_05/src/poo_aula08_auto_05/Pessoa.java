/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_aula08_auto_05;

/**
 *
 * @author clecioferreira
 */
public class Pessoa {
    protected String nome;
    protected String cpf;
    protected String dataNasc;
    
    public Pessoa (String n, String c, String d){
        super();
        this.nome = n;
        this.cpf = c;
        this.dataNasc = d;
    }
    
    public void mostrarPessoa(){
        System.out.println("\n=== Informacoes Pessoais ===");
        System.out.println("Nome: "+nome);
        System.out.println("CPF: "+cpf);
        System.out.println("Data de Nasc.: "+dataNasc);
    }
}
