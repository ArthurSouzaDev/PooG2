/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classe;


public class itemVenda {
    private int codigo;
    private Produto produto;
    private int quantidade;

    public itemVenda() {
    }
    
    public itemVenda(int codigo, Produto produto, int quantidade) {
        this.codigo = codigo;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double calcularSubtotal() {
        return produto.lucroDaUnidade() * quantidade;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Produto: [" + produto.toString() + "], Quantidade: " + quantidade
                + ", Subtotal: " + calcularSubtotal();
    }

}
