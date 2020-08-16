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
                
                Pessoa pessoa1 = new Pessoa("Clecio", "M", 33);
                Pessoa pessoa2 = new Pessoa("Karen", "F", 26);
                Pessoa pessoa3 = new Pessoa("Gress", "F", 72);
                Pessoa pessoa4 = new Pessoa("Mahjong", "F", 88);
                
		Carro meuCarro = new Carro();
		meuCarro.setCor("preto");
		meuCarro.setNumPortas(4);
		meuCarro.setPlaca("MHX 1234");
		meuCarro.setTipo("esportivo");
                meuCarro.setDono(pessoa1);
                
                Carro meuCarro2 = new Carro();
		meuCarro2.setCor("vermelho");
		meuCarro2.setNumPortas(4);
		meuCarro2.setPlaca("MHX 4321");
		meuCarro2.setTipo("deluxe");
                meuCarro2.setDono(pessoa2);
                
                Carro meuCarro3 = new Carro(2020,"Ford",2019);
                meuCarro3.setDono(pessoa3);
                
                Carro meuCarro4 = new Carro(2020,"Troller",2019);

		System.out.println("Cor: "+meuCarro.getCor());
		System.out.println("Número de portas: "+meuCarro.getNumPortas());
		System.out.println("Placa: "+meuCarro.getPlaca());
		System.out.println("Tipo: "+meuCarro.getTipo());
                System.out.println("Modelo: "+meuCarro.getModelo());
                System.out.println("Marca: "+meuCarro.getMarca());
                System.out.println("Ano Fabricacao: "+meuCarro.getAnoFabricacao());
                System.out.println("Combustivel: "+meuCarro.getTipComb());
                System.out.println("Pertence a: "+meuCarro.getDono().getNome());
                System.out.println("---------- | |----------- || ------");
                System.out.println("Cor: "+meuCarro2.getCor());
		System.out.println("Número de portas: "+meuCarro2.getNumPortas());
		System.out.println("Placa: "+meuCarro2.getPlaca());
		System.out.println("Tipo: "+meuCarro2.getTipo());
                System.out.println("Modelo: "+meuCarro2.getModelo());
                System.out.println("Marca: "+meuCarro2.getMarca());
                System.out.println("Ano Fabricacao: "+meuCarro2.getAnoFabricacao());
                System.out.println("Combustivel: "+meuCarro2.getTipComb());
                System.out.println("Pertence a: "+meuCarro2.getDono().getNome());
                System.out.println("---------- | |----------- || ------");
                System.out.println("Cor: "+meuCarro3.getCor());
		System.out.println("Número de portas: "+meuCarro3.getNumPortas());
		System.out.println("Placa: "+meuCarro3.getPlaca());
		System.out.println("Tipo: "+meuCarro3.getTipo());
                System.out.println("Modelo: "+meuCarro3.getModelo());
                System.out.println("Marca: "+meuCarro3.getMarca());
                System.out.println("Ano Fabricacao: "+meuCarro3.getAnoFabricacao());
                System.out.println("Combustivel: "+meuCarro3.getTipComb());               
                System.out.println("Pertence a: "+meuCarro3.getDono().getNome());
                meuCarro4.setDono(pessoa4);
                pessoa4.setCarro(meuCarro4);
                System.out.println("------ Test Drive-------");
                System.out.println("Teste realizado por: "+meuCarro4.getDono().getNome());
                
                pessoa4.ligarCarro();
                pessoa4.setCambioCarro(1);
                pessoa4.acelerarCarro();
                pessoa4.setCambioCarro(2);
                pessoa4.acelerarCarro();
                pessoa4.setCambioCarro(3);
                pessoa4.acelerarCarro();
                pessoa4.setCambioCarro(2);
                pessoa4.frearCarro();
                pessoa4.setCambioCarro(1);
                pessoa4.frearCarro();
                pessoa4.setCambioCarro(0);
                pessoa4.frearCarro();
                pessoa4.desligarCarro();
                
    }
    
}
