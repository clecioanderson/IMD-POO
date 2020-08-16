/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_aula05_at04;

/**
 *
 * @author clecioferreira
 */
public class Hacker {
    void main(){
        // Basta retirar a palavra reservada private dos atributos da classe
        // usuario para que o programa funcione, provando o funcionamento 
        // do encapsulamento
        Usuario user1 = new Usuario();
        user1.senha="teste";
        user1.login="usuario";
        System.out.println("O login de usuario eh => "+user1.login);
        System.out.println("O senha de usuario eh => "+user1.senha);
    }
}
