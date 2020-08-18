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
public class Aluno extends Pessoa {
    protected String matricula;
    
    public Aluno(String n, String c, String d, String m){
        super(n,c,d);
        this.matricula = m;
    }
    
    public void mostrarAluno(){
        System.out.println("\n=== Informacoes do Aluno ===");
        System.out.println("Nome: "+nome);
        System.out.println("CPF: "+cpf);
        System.out.println("Data de Nasc.: "+dataNasc);
        System.out.println("Matrícula: "+matricula);
    }
}
