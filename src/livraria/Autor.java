package livraria;

import java.util.Scanner;

public class Autor {
    private String nome;
    private String email;
    private String cpf;
    
    Scanner read = new Scanner(System.in);
    
    //Métodos getters e setters
    public String getnome(){ return this.nome; }
    public void setnome(String nome){ this.nome = nome; }
    public String getemail(){ return this.email; }
    public void setemail(String email){ this.email = email; }
    public String getcpf(){ return this.cpf; }
    public void setcpf(String cpf){ this.cpf = cpf; }
    
    //Método construtor da classe
    void NovoAutor(){
        System.out.println("\nEntre com as informações do novo autor");
        System.out.print("Autor: ");
        this.nome = read.nextLine();
        System.out.print("email: ");
        this.email = read.nextLine();
        System.out.print("cpf: ");
        this.cpf = read.nextLine();
    }
    //Imprime a classe autor
    void MostraAutor(){
        System.out.println("Mostra detalhes do autor.");
        System.out.println("Autor: " + this.nome);
        System.out.println("E-mail: " + this.email);
        System.out.println("CPF: " + this.cpf);
    }
}
