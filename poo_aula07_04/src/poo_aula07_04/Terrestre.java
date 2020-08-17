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
public class Terrestre extends Transporte{
    private int numRodas;
    
    public int getRodas(){
        return this.numRodas;
    }
    public void setRodas(int n){
        this.numRodas = n;
    }
}
