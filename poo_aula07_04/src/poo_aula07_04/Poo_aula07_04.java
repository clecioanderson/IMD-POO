/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_aula07_04;

/**
 *
 * @author clecioferreira
 */
public class Poo_aula07_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Automovel car1 = new Automovel();
         Automovel car2 = new Automovel();
         car1.setCapacidade(10);
         car1.setRodas(4);
         car2.capacidade=30;
         car2.setRodas(4);
         System.out.println(car2.capacidade);
         System.out.println("A capacidade do automovel eh => "+car1.getCapacidade());
         System.out.println("O automovel tem => "+car1.getRodas()+" rodas!");
    }
    
}
