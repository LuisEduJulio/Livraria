package livraria;

import java.util.Scanner;

public class Livro {
    String nome;
    String descricao;
    private double valor;
    String isbn;
    
    //Instância da classe autor
    Autor autor1 = new Autor();
    
    Scanner read = new Scanner(System.in);
    //Metodo construtor da classe
    void NovoLivro(){
        System.out.println("Entre com as informaões do novo livro");
        System.out.print("Livro: ");
        nome = read.nextLine();
        System.out.print("Descrição: ");
        descricao = read.nextLine();
        System.out.print("Valor: ");
        this.valor = read.nextDouble();
        System.out.print("ISBN: ");
        isbn = read.nextLine();
        autor1.NovoAutor();
        
    }
    //Retorna livro criado
    public Livro(){
        System.out.println("Livro criado!");
    }
    //Valor do livro
    void AdicionarValor(double valor){
        this.valor = valor;
    }
    //Valor do livro
    double RetornaValor(){
        return this.valor;
    }
    //Desconto do livro
    public boolean AplicaDesconto(double porcentagem){
        if(porcentagem > 30){
            return false;
        }
        this.valor -= this.valor * porcentagem;
        return true;
    }
    
    //Imprimindo informações da classe 
    void MostraDetalhes(){
        String mensagem = "\nMostrando detalhes";
        System.out.println(mensagem);
        System.out.println("Livro: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço : R$ " + RetornaValor());
        System.out.println("ISBN: " + isbn);
        //Desconto
        if(!AplicaDesconto(0.1)){
            System.out.println("Desconto não pode ser maior que 30%");
        }else{
            System.out.println("Valor com desconto: " + RetornaValor());
        }
        //Verifica se tem o nome do autor e imprime
        if(this.TemAutor()){
           autor1.MostraAutor();
        }else{
            autor1.NovoAutor();
        }
    }
    //Metodo que retorna o autor
    boolean TemAutor(){
        return this.autor1 != null;
    }
}
