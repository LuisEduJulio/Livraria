package livraria;

import java.util.Scanner;

public class Livro {
    String nome;
    String descricao;
    double valor;
    String isbn;
    
    Autor autor1 = new Autor();
    
    Scanner read = new Scanner(System.in);
    
    void NovoLivro(){
        System.out.println("Entre com as informaões do novo livro");
        System.out.print("Livro: ");
        nome = read.nextLine();
        System.out.print("Descrição: ");
        descricao = read.nextLine();
        System.out.print("Valor: ");
        valor = read.nextDouble();
        System.out.print("ISBN: ");
        isbn = read.nextLine();
        autor1.NovoAutor();
        
    }
    public Livro(){
        System.out.println("Livro criado!");
    }
    public void AplicaDesconto(Double porcetagem){
        this.valor -= this.valor * porcetagem;
    }
    
    void MostraDetalhes(){
        String mensagem = "\nMostrando detalhes";
        System.out.println(mensagem);
        System.out.println("Livro: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço : R$ " + valor);
        System.out.println("ISBN: " + isbn);
        
        if(this.TemAutor()){
           autor1.MostraAutor();
        }else{
            autor1.NovoAutor();
        }
    }
    boolean TemAutor(){
        return this.autor1 != null;
    }
}
