/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_aula13_at03_01;

/**
 *
 * @author clecioferreira
 */
public class Trator {
        public void andarFrente(){
		System.out.println("[trator]: andando para frente...");
	}
	public void andarTras(){
		System.out.println("[trator]: andando para trás...");
	}
	public void parar(){
		System.out.println("[trator]: parado");
	}
	public void virarDireita(int graus){
		System.out.println("[trator]: virando para direita " + graus + " graus");
	}
	public void virarEsquerda(int graus){
		System.out.println("[trator]: virando para esquerda " + graus + " graus");
	}
	public void erqueEscavadeira(){
		System.out.println("[trator]: ergue escavadeira");
	}
}
