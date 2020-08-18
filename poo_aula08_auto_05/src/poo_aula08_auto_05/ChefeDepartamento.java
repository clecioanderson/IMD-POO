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
public class ChefeDepartamento extends Funcionario {
    private String departamento;
    private String dataPromocao;
    private double salario;
    
    public ChefeDepartamento(String n, String c, String d, String m, String da, double sal, String dep, String dpro){
        super(n,c,d,m,da,sal);
        this.departamento = dep;
        this.dataPromocao = dpro;
        this.salario = sal;   
    }
    
    public void mostrarChefe(){
        System.out.println("\n=== Informacoes do Funcionario ===");
        System.out.println("Nome: "+nome);
        System.out.println("CPF: "+cpf);
        System.out.println("Matricula: "+matricula);
        System.out.println("Data de Nasc.: "+dataNasc);
        System.out.println("Data de Admissão: "+dataAdmissao);
        System.out.println("Salario: "+salario);
        System.out.println("Departamento: "+departamento);
        System.out.println("Data de Promoção: "+dataPromocao);
    }
}
