package br.luis.projetos.livraria.classes;

import java.util.Scanner;

public class livro {
    private String nome, descricao, isbn, waltermark;
    private double valor;
    private boolean impresso;


    //Instâncias das classes
    Autor autor1 = new Autor();
    Scanner read = new Scanner(System.in);

    //Metodos getters e setters
    public String getNome(){ return this.nome; }
    public void setNome(String nome){ this.nome = nome; }
    public String getDescricao(){ return this.descricao; }
    public void setDescricao(String descricao){ this.descricao = descricao; }
    public double getValor(){ return this.valor; }
    public void setValor(double valor){ this.valor = valor; }
    public String getIsbn(){ return this.isbn; }
    public void setIsbn(String isbn){ this.isbn = isbn; }
    public boolean setImpresso(){ return this.impresso; }
    public void getImpresso(boolean impresso){ this.impresso = impresso; }
    public String setWaltermark(){ return this.waltermark; }
    public void getWaltermark(String waltermark) { this.waltermark = waltermark; }

    //Metodo construtor da classe
    public void novoLivro(){
        System.out.println("Entre com as informaões do novo livro");
        System.out.print("Livro: ");
        this.nome = read.nextLine();
        System.out.print("Descrição: ");
        this.descricao = read.nextLine();
        System.out.print("Valor: ");
        this.valor = read.nextDouble();
        System.out.print("ISBN: ");
        this.isbn = read.nextLine();
        autor1.novoAutor();
        this.impresso = true;

    }
    //Retorna livro criado
    public livro(){
        System.out.println("Livro criado!");
    }
    //Valor do livro
    public void adicionarValor(double valor){
        this.valor = valor;
    }
    //Valor do livro
    public double retornaValor(){
        return this.valor;
    }
    //Desconto do livro
    public boolean aplicaDesconto(double porcentagem){
        if(porcentagem > 30){
            return false;
        }else if(!this.impresso && porcentagem > 0.15){
            return false;
        }this.valor -= this.valor * porcentagem;
        return true;
    }

    //Imprimindo informações da classe
    public void MostraDetalhes(){
        String mensagem = "\nMostrando detalhes";
        System.out.println(mensagem);
        System.out.println("Livro: " + this.nome);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Preço : R$ " + retornaValor());
        System.out.println("ISBN: " + this.isbn);
        System.out.println("CAPA: " + this.impresso);


        //Desconto
        if(!aplicaDesconto(0.1)){
            System.out.println("Desconto não pode ser maior que 30%");
        }else{
            System.out.println("Valor com desconto: " + retornaValor());
        }
        //Verifica se tem o nome do autor e imprime
        if(this.TemAutor()){
           autor1.mostraAutor();
        }else{
            autor1.novoAutor();
        }
    }
    //Metodo que retorna o autor
    public boolean TemAutor(){
        return this.autor1 != null;
    }
}
