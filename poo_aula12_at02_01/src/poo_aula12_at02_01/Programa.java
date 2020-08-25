/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_aula12_at02_01;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author clecioferreira
 */
public class Programa {
    public void validarLetrasAfabeto(String s)throws ExcecaoAlfabeto{
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");
        char[] ch = s.toCharArray();
        
        for (char c : ch) { 
            Matcher matcher = pattern.matcher(s);
            if (!matcher.matches()) {
                throw new ExcecaoAlfabeto("String invalida! Encontrados caracteres especiais!");
            }
        } 
    }
    public void apenasLetras(String s) throws ExcecaoLetras{
        Pattern pattern = Pattern.compile("[a-zA-Z]*");
        char[] ch = s.toCharArray();
        
        for (char c : ch) { 
            Matcher matcher = pattern.matcher(s);
            if (!matcher.matches()) {
                throw new ExcecaoLetras("String invalida! Não são apenas letras!");
            } 
        } 
    }
    public void apenasNumeros(String s) throws ExcecaoNumeros{
        Pattern pattern = Pattern.compile("[0-9]*");
        char[] ch = s.toCharArray();
        
        for (char c : ch) { 
            Matcher matcher = pattern.matcher(s);
            if (!matcher.matches()) {
                throw new ExcecaoNumeros("String invalida! Não são apenas numeros!");
            } 
        } 
    }
}
