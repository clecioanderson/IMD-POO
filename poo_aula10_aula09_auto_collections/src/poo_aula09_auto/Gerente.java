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
public class Gerente extends Funcionario{
    private int area;
    
    public void mostraDados(){
        System.out.println("\n===== Informacoes do Gerente =====");
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF: "+this.cpf);
        System.out.println("Matricula: "+this.matricula);
        System.out.println("Salário: "+this.salario);
        System.out.println("Área: "+this.area);
    }
    
    Gerente(){
        super();
        this.area = 0;
    }
    Gerente(String n, String m, double sal, int a){
        super(n,m,sal);
        this.area = a;
    }
    Gerente(String n, String c, String m, double sal, int a){
        super(n,c,m,sal);
        this.area = a;
    }
}
