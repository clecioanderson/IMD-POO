/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_aula11_auto;

/**
 *
 * @author clecioferreira
 */
public class Poo_aula11_auto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vetor = new int[3];
        Number teste = new Number();
        try{
            System.out.println("Try executando...");
            teste.setNumber(vetor);
            
        }catch(NumberFormatException ex){
            System.out.println("Catch executando...");
            ex.printStackTrace();
            //System.out.println("Formato do numero digitado invalido. Aceito apenas tipo INT!");
            //System.out.println("Inicie a entrada de valores novamente!");
        }finally{
            System.out.println("\nFinally executando...");
            teste.getNumber(vetor);
        }
        //teste.getNumber(vetor);
    }
    
}
