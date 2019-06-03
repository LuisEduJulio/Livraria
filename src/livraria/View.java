package livraria;

public class View {

    
    public static void main(String[] args) {
        
        Livro livro1 = new Livro();
        livro1.NovoLivro();
        livro1.AplicaDesconto(0.1);
        livro1.MostraDetalhes();
        
    }
}
