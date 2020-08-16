/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_aula03;

/**
 *
 * @author clecioferreira
 */
public class Poo_aula03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*aqui estará todo o código responsável por executar o programa:
		*1- Criação de objetos
		*2 - Manipulação de seus dados
		*3- Finalização do programa
		*/

		System.out.println("Meu primeiro programa java\n");

		Carro meuCarro = new Carro();
		meuCarro.setCor("preto");
		meuCarro.setNumPortas(4);
		meuCarro.setPlaca("MHX 1234");
		meuCarro.setTipo("esportivo");
                
                Carro meuCarro2 = new Carro();
		meuCarro2.setCor("vermelho");
		meuCarro2.setNumPortas(4);
		meuCarro2.setPlaca("MHX 4321");
		meuCarro2.setTipo("deluxe");
                
                Carro meuCarro3 = new Carro(2020,"Ford",2019);

		System.out.println("Cor: "+meuCarro.getCor());
		System.out.println("Número de portas: "+meuCarro.getNumPortas());
		System.out.println("Placa: "+meuCarro.getPlaca());
		System.out.println("Tipo: "+meuCarro.getTipo());
                System.out.println("Modelo: "+meuCarro.getModelo());
                System.out.println("Marca: "+meuCarro.getMarca());
                System.out.println("Ano Fabricacao: "+meuCarro.getAnoFabricacao());
                System.out.println("Combustivel: "+meuCarro.getTipComb());
                System.out.println("---------- | |----------- || ------");
                System.out.println("Cor: "+meuCarro2.getCor());
		System.out.println("Número de portas: "+meuCarro2.getNumPortas());
		System.out.println("Placa: "+meuCarro2.getPlaca());
		System.out.println("Tipo: "+meuCarro2.getTipo());
                System.out.println("Modelo: "+meuCarro2.getModelo());
                System.out.println("Marca: "+meuCarro2.getMarca());
                System.out.println("Ano Fabricacao: "+meuCarro2.getAnoFabricacao());
                System.out.println("Combustivel: "+meuCarro2.getTipComb());
                System.out.println("---------- | |----------- || ------");
                System.out.println("Cor: "+meuCarro3.getCor());
		System.out.println("Número de portas: "+meuCarro3.getNumPortas());
		System.out.println("Placa: "+meuCarro3.getPlaca());
		System.out.println("Tipo: "+meuCarro3.getTipo());
                System.out.println("Modelo: "+meuCarro3.getModelo());
                System.out.println("Marca: "+meuCarro3.getMarca());
                System.out.println("Ano Fabricacao: "+meuCarro3.getAnoFabricacao());
                System.out.println("Combustivel: "+meuCarro3.getTipComb());
    }
    
}
