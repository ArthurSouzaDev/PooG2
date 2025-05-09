package Classe;
public class pessoa {
    private String cpf, nome, telefone;
   
    public pessoa(){
        
    }
    public pessoa(String cpf, String nome, String telefone){
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "pessoa{" + "cpf=" + cpf + ", nome=" + nome + ", telefone=" + telefone + '}';
    }
    
    
}
