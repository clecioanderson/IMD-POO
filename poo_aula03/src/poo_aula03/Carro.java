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
public class Carro {
        String tipo;
	String cor;
	String placa;
	int numPortas;
        String marca;
        int modelo;
        int anoFabricacao;
        String tipoComb;
        Pessoa dono;
        
        Pessoa getDono(){
            return dono;
        }
        void setDono(Pessoa dono){
            this.dono = dono;
        }

	void setCor(String c){
		cor = c;
	}		
	String getCor(){
		return cor;
	}

	String getTipo(){
		return tipo;
	}

	void setTipo(String tipo){
		this.tipo = tipo;
	}

	String getPlaca(){
		return placa;
	}
	void setPlaca(String placa){
		this.placa = placa;
	}

	int getNumPortas(){
		return numPortas;
	}
	void setNumPortas(int numPortas){
		this.numPortas = numPortas;
	}
        int getModelo(){
		return modelo;
	}
        String getMarca(){
		return marca;
	}
        int getAnoFabricacao(){
		return anoFabricacao;
	}
        String getTipComb(){
		return tipoComb;
	}
        Carro(){
            this.modelo = 2010;
            this.marca = "JEEP";
            this.anoFabricacao = 2009;
            this.tipoComb = "Diesel";
        }
        Carro(int modelo, String marca, int anoFabricacao ){
            this.modelo = modelo;
            this.marca = marca;
            this.anoFabricacao = anoFabricacao;
            this.cor = "Branco";
            this.tipo = "4x4";
            this.placa = "KAH 8888";
            this.numPortas = 5;
            this.tipoComb = "Flex";
        }
}
