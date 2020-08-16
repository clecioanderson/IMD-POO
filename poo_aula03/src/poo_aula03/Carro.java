/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_aula03;

import java.time.Clock;

/**
 *
 * @author clecioferreira
 */
public class Carro {
        private String tipo;
	private String cor;
	private String placa;
	private int numPortas;
        private String marca;
        private int modelo;
        private int anoFabricacao;
        private String tipoComb;
        private int cambio;
        private Pessoa dono;
        
        public Pessoa getDono(){
            return dono;
        }
        public void setDono(Pessoa dono){
            this.dono = dono;
        }

	public void setCor(String c){
		cor = c;
	}		
	public String getCor(){
		return cor;
	}

	public String getTipo(){
		return tipo;
	}

	public void setTipo(String tipo){
		this.tipo = tipo;
	}

	public String getPlaca(){
		return placa;
	}
	public void setPlaca(String placa){
		this.placa = placa;
	}

	public int getNumPortas(){
		return numPortas;
	}
	public void setNumPortas(int numPortas){
		this.numPortas = numPortas;
	}
        public int getModelo(){
		return modelo;
	}
        public String getMarca(){
		return marca;
	}
        public int getAnoFabricacao(){
		return anoFabricacao;
	}
        public String getTipComb(){
		return tipoComb;
	}
        public void ligar(){
            System.out.println("carro ligado.");
        }
        public void desligar(){
            System.out.println("carro desligado.");
        }
        public void acelerar(){
            System.out.println("carro acelerando.");
        }
        public void frear(){
            System.out.println("carro freando.");
        }
        public void setCambio(int marcha){
            this.cambio = marcha;
        }
        public int getCambio(){
            return this.cambio;
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
