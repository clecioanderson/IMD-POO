/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_aula13_at01_01;

import java.util.List;

/**
 *
 * @author clecioferreira
 */
public class Livros {
    private String titulo, autor, editora, edicao;
    public static TipoGenero genero;
    public static String generoDesc;
    
    Livros(){
        super();
    }
    
    Livros(String tit, String aut, String edt, String edc){
        this.titulo = tit;
        this.autor = aut;
        this.editora = edt;
        this.edicao = edc;
        Livros.genero = TipoGenero.Literatura;
        Livros.generoDesc = "Literatura";
    }
    
    public void setTitulo(String tit){
        this.titulo = tit;
    }
    
    public void setAutor(String aut){
        this.autor = aut;
    }
    
    public void setEditora(String edt){
        this.editora = edt;
    }
    
    public void setEdicao(String edc){
        this.edicao = edc;
    }
    
    public static void setGenero(int i){
        switch(i){
            case 1:
                Livros.genero = TipoGenero.CienciasHumanas;
                Livros.generoDesc = "Ciências Humanas";
                break;
            case 2:
                Livros.genero = TipoGenero.CienciasNaturais;
                Livros.generoDesc = "Ciências Naturais";
                break;
            case 3:
                Livros.genero = TipoGenero.Ficcao;
                Livros.generoDesc = "Ficção";
                break;
            case 4:
                Livros.genero = TipoGenero.Literatura;
                Livros.generoDesc = "Literatura";
                break;
            default:
                System.out.println("Digite um valor valido entre 1 e 4!");
                break;
        }
    }
    
    public static void mostraCadastro(List<Livros> lv){
        for(Livros it:lv){
            System.out.println("\n~~~~~~~~~~ Informacoes do Livro ~~~~~~~~~~");
            System.out.println("Nome: "+it.titulo);
            System.out.println("Autor: "+it.autor);
            System.out.println("Editora: "+it.editora);
            System.out.println("Edicao: "+it.edicao);
            System.out.println("Genero: "+it.generoDesc);
        }
    }
}
