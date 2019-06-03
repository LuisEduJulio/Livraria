package livraria;

import java.util.Scanner;

public class Livro {
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    
    //Instâncias das classes
    Autor autor1 = new Autor();
    Scanner read = new Scanner(System.in);
    //Metodos getters e setters
    public String getnome(){ return this.nome; }
    public void setnome(String nome){ this.nome = nome; }
    public String getdescricao(){ return this.descricao; }
    public void setdescricao(String descricao){ this.descricao = descricao; }
    public double getvalor(){ return this.valor; }
    public void setvalor(double valor){ this.valor = valor; }
    public String getisbn(){ return this.isbn; }
    public void setisbn(String isbn){ this.isbn = isbn; }
    
    //Metodo construtor da classe
    public void NovoLivro(){
        System.out.println("Entre com as informaões do novo livro");
        System.out.print("Livro: ");
        this.nome = read.nextLine();
        System.out.print("Descrição: ");
        this.descricao = read.nextLine();
        System.out.print("Valor: ");
        this.valor = read.nextDouble();
        System.out.print("ISBN: ");
        this.isbn = read.nextLine();
        autor1.NovoAutor();
        
    }
    //Retorna livro criado
    public Livro(){
        System.out.println("Livro criado!");
    }
    //Valor do livro
    public void AdicionarValor(double valor){
        this.valor = valor;
    }
    //Valor do livro
    public double RetornaValor(){
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
    public void MostraDetalhes(){
        String mensagem = "\nMostrando detalhes";
        System.out.println(mensagem);
        System.out.println("Livro: " + this.nome);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Preço : R$ " + RetornaValor());
        System.out.println("ISBN: " + this.isbn);
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
    public boolean TemAutor(){
        return this.autor1 != null;
    }
}
