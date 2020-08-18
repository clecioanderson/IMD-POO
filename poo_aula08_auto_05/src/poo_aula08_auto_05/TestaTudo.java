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
public class TestaTudo {
    public void main(){
        Aluno al1= new Aluno("Marcelo","059.309.310-03","01/01/1985","2345678");
        ChefeDepartamento cf1 = new ChefeDepartamento("Paulo","209.751.600-95","01/01/1977","3245610","01/01/2019",10000,"Financeiro","01/01/2020");
        
        cf1.mostrarChefe();
        cf1.mostrarFuncionario();
        cf1.mostrarPessoa();
        al1.mostrarAluno();
        al1.mostrarPessoa();
    }
}
