package br.luis.projetos.livraria.classes;

public class Ebook extends livro{
    private String waltermark;
    private double desconto;
    Autor autor = new Autor();
    
    public double getDesconto(){ return desconto; }
    public void setDesconto(double desconto){ this.desconto = desconto; }
    public Ebook(Autor autor){ this.autor = autor; }
    @Override
    public String setWaltermark(){ return this.waltermark; }
    @Override
    public void getWaltermark(String waltermark){ this.waltermark = waltermark; }

    @Override
    public boolean aplicaDesconto(double porcetagem){
        if(porcetagem > 0.15){
            return false;
        }
        this.desconto = this.getValor() * porcetagem;
        this.setValor(this.getValor() - this.desconto);
        return true;
    }
}