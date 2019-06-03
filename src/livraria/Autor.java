package livraria;

import java.util.Scanner;

public class Autor {
    String nome;
    String email;
    String cpf;
    
    Scanner read = new Scanner(System.in);
    
    //Método construtor da classe
    void NovoAutor(){
        System.out.println("\nEntre com as informações do novo autor");
        System.out.print("Autor: ");
        nome = read.nextLine();
        System.out.print("email: ");
        email = read.nextLine();
        System.out.print("cpf: ");
        cpf = read.nextLine();
    }
    //Imprime a classe autor
    void MostraAutor(){
        System.out.println("Mostra detalhes do autor.");
        System.out.println("Autor: " + nome);
        System.out.println("E-mail: " + email);
        System.out.println("CPF: " + cpf);
    }
}
