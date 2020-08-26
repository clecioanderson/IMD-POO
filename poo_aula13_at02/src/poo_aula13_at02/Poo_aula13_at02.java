/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_aula13_at02;

/**
 *
 * @author clecioferreira
 */
public class Poo_aula13_at02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //FiguraAbstrata f = new FiguraAbstrata(); // Codigo gera erro por tentar instanciar uma classe abstrata
        Triangulo t = new Triangulo();
        Trapezio tp = new Trapezio();
        System.out.println("Desenha Triangulo:");
        t.desenha();
        System.out.println("\n-------------------------");
        System.out.println("\nDesenha Trapezio:");
        tp.desenha();
        //f.desenha();  // Codigo gera erro por tentar instanciar uma classe abstrata
    }
    
}
