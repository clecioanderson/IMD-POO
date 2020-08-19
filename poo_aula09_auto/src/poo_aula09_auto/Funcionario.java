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
public class Funcionario extends Pessoa{
    protected String matricula;
    protected double salario;
    
    public void mostraDados(){
        System.out.println("\n===== Informacoes do Funcionario =====");
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF: "+this.cpf);
        System.out.println("Matricula: "+this.matricula);
        System.out.println("Salário: "+this.salario);
    }
    
    Funcionario(){
        super();
        this.matricula = "ATUALIZAR CADASTRO";
        this.salario = 0;
    }
    
    Funcionario(String n, String c, String m, double sal){
        super(n,c);
        this.matricula = m;
        this.salario = sal;
    }
    Funcionario(String n, String m, double sal){
        super(n);
        this.matricula = m;
        this.salario = sal;
    }
}
