/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_aula13_at01_01;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author clecioferreira
 */
public class Poo_aula13_at01_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Livros> biblioteca = new ArrayList<>();;
        Scanner leitor = new Scanner(System.in);
        System.out.println("==== CADASTRAR NOVO LIVRO ====");
        System.out.println("Digite as informações do livro");
        System.out.println("Nome do livro:");
        String nome = leitor.nextLine();
        System.out.println("Nome do Autor do Livro:");
        String autor = leitor.nextLine();
        System.out.println("Nome da Editora do Livro:");
        String editora = leitor.nextLine();
        System.out.println("Informe o numero/ano da Edição do livro");
        String edicao = leitor.nextLine();
        Livros lv = new Livros(nome,autor,editora,edicao);
        biblioteca.add(lv);
        
        Livros.mostraCadastro(biblioteca);
    }
    
}
