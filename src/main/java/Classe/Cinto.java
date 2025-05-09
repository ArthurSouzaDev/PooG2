/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classe;

import java.util.logging.Logger;

public class Cinto extends Produto{
    private double largura;
    private double comprimento;
    private String cor;

    public Cinto() {
    }

    public Cinto(double precoVenda, double precoCusto, String material, int qtdEstoque, double largura, double comprimento, String cor) {
        super(precoVenda, precoCusto, material, qtdEstoque);
        this.largura = largura;
        this.comprimento = comprimento;
        this.cor = cor;
       
    }
    
    
  

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Largura: " + largura + ", Comprimento: " + comprimento +
               ", Cor: " + cor + ", Material: " + material;
    }
}
