package br.luis.projetos.livraria.classes;

import java.util.Scanner;

public class Autor {
    private String nome, email, cpf;

    Scanner read = new Scanner(System.in);

    //Métodos getters e setters
    public String getNome(){ return this.nome; }
    public void setNome(String nome){ this.nome = nome; }
    public String getEmail(){ return this.email; }
    public void setEmail(String email){ this.email = email; }
    public String getCpf(){ return this.cpf; }
    public void setCpf(String cpf){ this.cpf = cpf; }

    //Método construtor da classe
    void novoAutor(){
        System.out.println("\nEntre com as informações do novo autor");
        System.out.print("Autor: ");
        this.nome = read.nextLine();
        System.out.print("email: ");
        this.email = read.nextLine();
        System.out.print("cpf: ");
        this.cpf = read.nextLine();
    }
    //Imprime a classe autor
    void mostraAutor(){
        System.out.println("Mostra detalhes do autor.");
        System.out.println("Autor: " + this.nome);
        System.out.println("E-mail: " + this.email);
        System.out.println("CPF: " + this.cpf);
    }
}
