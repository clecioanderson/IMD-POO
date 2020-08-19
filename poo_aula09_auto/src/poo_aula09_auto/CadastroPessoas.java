/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_aula09_auto;
import java.util.Scanner;

/**
 *
 * @author clecioferreira
 */
public class CadastroPessoas {
    private Pessoa[] pessoas;
    private int quantAnual;
    
    public void cadastrarPessoa(Pessoa[] p, int q){
        int counter=0;
        this.quantAnual=q;
        this.pessoas = p;
        if (counter <= this.pessoas.length){
            while (counter <= this.pessoas.length - 1 ){
                this.pessoas[counter] = p[counter];
            }
        counter++;     
        } else {
            System.out.println("Numero maximo de cadastros realizado! Voltando para menu inicial");
        }
    }
    
    public void mostraCadastro(Pessoa[] p){
        this.pessoas = p;
        for (int i=1;i<=this.pessoas.length;i++){
            if (this.pessoas[i-1] == null){
                System.out.println("\n~~~~~~~~~~ Cadastro Pessoa "+i+" ~~~~~~~~~~");
                System.out.println("SEM CADASTRO");
            }
            else {
                System.out.println("\n~~~~~~~~~~ Cadastro "+i+" ~~~~~~~~~~");
                this.pessoas[i-1].mostraDados();
            }
        }
    }

    public void main(){
        int qtd = 100;
        Scanner leitor = new Scanner(System.in);
        int counter = 0;
        int escolha = -1;       
        System.out.println("\nDefina o tamanho da sua base de dados: ");
        //Operador Ternario para testar o dbSize
        int dbSize = leitor.nextInt(); //Definir o tamanho do vetor que armazenara as pessoas
        dbSize = (dbSize % 4 == 0) ? dbSize:4; // Garantir que caso o numero informado não seja multiplo de 4 seja definido 4 como tamanho do vetor
        //Operador Ternario para testar o tipoPessoa
        Pessoa ps[] = new Pessoa[dbSize];
        int indexVetor = 0;
        int tipoPessoa = dbSize/4; // Dividir por tipo de registro os cadastros disponiveis com base no tamanho do vetor, nesse caso 4 tipos diferentes de cadastro
        while (escolha != 0 || counter < dbSize){
            System.out.println("\nEscolha a opção desejada: ");
            System.out.println("1 - Cadastrar Pessoa");
            System.out.println("2 - Cadastrar Cliente");
            System.out.println("3 - Cadastrar Funcionario");
            System.out.println("4 - Cadastrar Gerente");
            System.out.println("5 - Mostrar todos os cadastros");
            System.out.println("0 - Sair");
            escolha = leitor.nextInt();
            switch(escolha){
            case 1:
                indexVetor = 0;
                while (indexVetor <= tipoPessoa - 1){
                    ps[counter] = new Pessoa();
                    counter++; //contador para o vetor pessoas
                    indexVetor++; //contador para garantir que cada tipo de cadastro nao exceda o maximo por tipo de registro
                }
                break;
            case 2:
                indexVetor = 0;
                while (indexVetor <= tipoPessoa - 1){
                    ps[counter] = new Cliente();
                    counter++;
                    indexVetor++;
                }
                break;
            case 3:
                indexVetor = 0;
                while (indexVetor <= tipoPessoa - 1){
                    ps[counter] = new Funcionario();
                    counter++;
                    indexVetor++;
                }
                break;
            case 4:
                indexVetor = 0;
                while (indexVetor <= tipoPessoa - 1){
                    ps[counter] = new Gerente();
                    counter++;
                    indexVetor++;
                }
                break;
            case 5:
                mostraCadastro(ps);
                break;
            default:
                System.out.println("Programa encerrado!");
                break;
            }/*
            System.out.println("\n===== Teste Pessoa 0 =====");
            System.out.println("CPF: "+ps[0].cpf);
            System.out.println("Nome: "+ps[0].nome);
            System.out.println("===== Teste Pessoa 1 =====");
            System.out.println("CPF: "+ps[1].cpf);
            System.out.println("Nome: "+ps[1].nome);
            System.out.println("===== Teste Pessoa 2 =====");
            System.out.println("CPF: "+ps[2].cpf);
            System.out.println("Nome: "+ps[2].nome);
            */
        }
        
    }
}
