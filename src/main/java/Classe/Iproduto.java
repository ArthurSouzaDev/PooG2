package Classe;


public interface Iproduto {
    
    public void acrescentaEstoque(int quantidade);

    public boolean retiraEstoque(int quantidade);

    public double lucroDaUnidade();

}
