/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_aula11_auto;
import java.util.Scanner;

/**
 *
 * @author clecioferreira
 */
public class Number {
    int[] teste = new int[3];
  
    
    public void getNumber(int[] s){
        System.out.println("Numeros do Vetor:");
        for(int n:s)
            System.out.println(n);
    }
    
    public void setNumber(int[] s) throws NumberFormatException{
        this.teste = s;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Inicie a entrar os numeros do vetor");
        for (int i=0;i<=teste.length-1;i++){
            System.out.println("Digite um numero:");
            String numero = leitor.nextLine();
            if(isNumeric(numero)==true){
              teste[i] = Integer.parseInt(numero);
            }else{
               System.out.println("Numero digitado invalido. Considerando 0.");
               teste[i] = 0;
            }            
        }
    }
    
    public boolean isNumeric(String strNum){
        if(strNum==null){
            return false;
        }
        else{
            int p = Integer.parseInt(strNum);
            return true;
        }
    }
    
}
