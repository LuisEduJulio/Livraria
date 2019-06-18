package Ebook;

public class Ebook extends Livro{
    private String waltermark;

    public Ebook(Autor autor){ super(autor); }

    public String setwaltermark(){ return this.waltermark; }
    public void getwaltermark(String waltermark){ this.waltermark = waltermark; }

    @Override
    public boolean AplicaDesconto(double porcetagem){
        if(porcetagem > 0.15){
            return false;
        }
        double desconto = this.getValor() * porcetagem;
        this.setValor(this.getValor() - desconto);
        return true;
    }
}