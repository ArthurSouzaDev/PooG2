
package Classe;

import java.util.ArrayList;

public class Venda implements ivenda {
    private String codigo, dataVenda;
    private Vendedor vendedor;
    private Cliente cliente;
    private ArrayList<itemVenda> itens = new ArrayList<>();

    public Venda() {
    }

    public Venda(String codigo, String dataVenda, Vendedor vendedor, Cliente cliente) {
        this.codigo = codigo;
        this.dataVenda = dataVenda;
        this.vendedor = vendedor;
        this.cliente = cliente;
    }
    
    @Override
    public void adicionarItem(int codigo, Produto produto, int quantidade) {
        if (produto.retiraEstoque(quantidade)){
            itens.add(new itemVenda(codigo,produto,quantidade) );
        }else{
            System.out.println("Estoque insuficinete para o produto!" + produto.toString());
        }
    }
    
    @Override
    public String retornaItens() {
    StringBuilder sb = new StringBuilder("Itens da Venda:\n");
        for (itemVenda item : itens) {
            sb.append(item.toString()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String retornarInformacoesdeDeVenda() {
        return "\nCódigo da Venda: " + codigo + "\nData: " + dataVenda + "\nVendedor: " + vendedor.getNome() +
               "\nCliente: " + cliente.getNome() + "\n" + retornaItens() +
               "\nValor Total: " + calcularTotalVenda();    }

    @Override
    public Double calcularTotalVenda() {
        return itens.stream().mapToDouble(itemVenda::calcularSubtotal).sum();    }

    @Override
    public boolean confirmarVenda() {
        return !itens.isEmpty();    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Venda{" + "codigo=" + codigo + ", dataVenda=" + dataVenda + ", vendedor=" + vendedor + ", cliente=" + cliente + ", itens=" + itens + '}';
    }
    
    
    
}
