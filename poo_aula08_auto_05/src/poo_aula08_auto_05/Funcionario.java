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
public class Funcionario extends Pessoa{
    protected String matricula;
    protected String dataAdmissao;
    protected double salario;
    
    public Funcionario(String n, String c, String d, String m, String da, double sal){
        super(n,c,d);
        this.dataAdmissao = da;
        this.salario = sal;
        this.matricula = m;
    }
    
    public void mostrarFuncionario(){
        
        System.out.println("\n=== Informacoes do Funcionario ===");
        System.out.println("Nome: "+nome);
        System.out.println("CPF: "+cpf);
        System.out.println("Matricula: "+matricula);
        System.out.println("Data de Nasc.: "+dataNasc);
        System.out.println("Data de Admissão: "+dataAdmissao);
        System.out.println("Salario: "+salario);
    }
}
