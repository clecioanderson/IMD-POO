/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_aula12_at02_01;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author clecioferreira
 */
public class Poo_aula12_at02_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Programa p = new Programa();
        Pattern pattern = Pattern.compile("[a-zA-Z]*");
        Scanner leitor = new Scanner(System.in);   
        System.out.println("Digite sua string:");
        String s = leitor.nextLine();
        Matcher matcher = pattern.matcher(s);
        
        if (!matcher.matches()) {
            try{
                p.apenasNumeros(s);
            }catch (ExcecaoNumeros ex){
                ex.printStackTrace();
            }finally{
                System.out.println("String digitada foi: "+s);
            }
            
        } else {
            try{
                p.apenasLetras(s);
            }catch (ExcecaoLetras ex){
                ex.printStackTrace();
            }catch (ExcecaoAlfabeto ex){
                ex.printStackTrace();
            }finally{
                System.out.println("String digitada foi: "+s);
            }
        }
        
    }
    
}
