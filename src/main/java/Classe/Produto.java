
package Classe;

/**
 *
 * @author Arthur
 */
public class Produto implements Iproduto {
    Double precoVenda, precoCusto;
    String material;
    int qtdEstoque;

    public Produto() {
    }
    
    public Produto(Double precoVenda, Double precoCusto, String material, int qtdEstoque) {
        this.precoVenda = precoVenda;
        this.precoCusto = precoCusto;
        this.material = material;
        this.qtdEstoque = qtdEstoque;
    }

    public Double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(Double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public Double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(Double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    @Override
    public void acrescentaEstoque(int quantidade) {
        this.qtdEstoque += quantidade;
    }
 
    @Override
    public boolean retiraEstoque(int quantidade) {
        if (qtdEstoque >= quantidade) {
            this.qtdEstoque -= quantidade;
            return true;
        }
        return false;
    }
    

    @Override
    public double lucroDaUnidade() {
        return precoVenda - precoCusto;
    }

    @Override
    public String toString() {
        return "Produto{" + "precoVenda=" + precoVenda + ", precoCusto=" + precoCusto + ", material=" + material + ", qtdEstoque=" + qtdEstoque + '}';
    }
}
