package Classe;

/**
 *
 * @author Arthur
 */
public class Cliente extends pessoa {
   boolean information;

    public Cliente() {
    }

    public Cliente(String cpf, String nome, String telefone, boolean information) {
        super(cpf, nome, telefone);
        this.information = true;
    }

    public boolean isInformation() {
        return information;
    }

    public void setInformation(boolean information) {
        this.information = information;
    }

    @Override
    public String toString() {
        return "Cliente{" + "information=" + information + '}';
    }
   
    
}
