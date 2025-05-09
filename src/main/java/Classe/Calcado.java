
package Classe;

public class Calcado extends Produto {
    private String descricao;
    private int numeracao;
    private String material;

    public Calcado() {
    }

    public Calcado(double precoVenda, double precoCusto, String material, int qtdEstoque, String descricao, int numeracao) {
        super(precoVenda, precoCusto, material, qtdEstoque);
        this.descricao = descricao;
        this.numeracao = numeracao;
        this.material = material;
        
        
    }

    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNumeracao() {
        return numeracao;
    }

    public void setNumeracao(int numeracao) {
        this.numeracao = numeracao;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Descrição: " + descricao + ", Numeração: " + numeracao +
               ", Material: " + material;
    }

}
