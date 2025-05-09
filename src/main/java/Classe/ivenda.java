/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Classe;

public interface ivenda {
    public void adicionarItem(int codigo, Produto produto, int quantidade);
    
    public String retornaItens();
    
    public String retornarInformacoesdeDeVenda();
    
    public Double calcularTotalVenda();
    
    public boolean confirmarVenda();
    
    
}
