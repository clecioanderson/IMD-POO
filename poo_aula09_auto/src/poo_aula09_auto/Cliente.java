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
public class Cliente extends Pessoa{
    private int codigo;
    
    public void mostraDados(){
        System.out.println("\n===== Informacoes do Cliente =====");
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF: "+this.cpf);
        System.out.println("Cod. Cliente: "+this.codigo);
    }
    
    Cliente(){
        super();
        this.codigo = 0;
    }
    Cliente(String n, String c, int cd){
        super(n,c);
        this.codigo = cd;
    }
    Cliente(String n, int cd){
        super(n);
        this.codigo = cd;
    }
}
