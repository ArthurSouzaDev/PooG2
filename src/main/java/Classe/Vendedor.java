package Classe;
public class Vendedor extends pessoa {
    private double salario;
    
    public Vendedor() {
    }

    public Vendedor(String cpf, String nome, String telefone, double salario) {
        super(cpf, nome, telefone);
        this.salario = salario;
    }
    
   
    

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "salario=" + salario + '}';
    }
    
            
}
