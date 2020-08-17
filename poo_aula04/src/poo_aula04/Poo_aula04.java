/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_aula04;

/**
 *
 * @author clecioferreira
 */
public class Poo_aula04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Agenda agenda1 = new Agenda();
	Agenda agenda2 = new Agenda();

	agenda1.anote(12,10,"Dia da Criança");
	agenda2.anote(7,15,"Independência do Brasil");

	agenda1.mostraAnotacao();
	agenda2.mostraAnotacao();
        
        // parte do codigo usada como teste para validar o funcionamento
        // do encapsulamento de atributos e metodos usando as palavras reservadas
        // private e public
        /**
        agenda2.dia=7;
        agenda2.mes=15;
        agenda2.anotacao="Independencia do Brasil";
        agenda2.mostraAnotacao();
        **/
    }    
}
