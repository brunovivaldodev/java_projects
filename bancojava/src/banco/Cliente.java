package banco;

public class Cliente {

    private  String nome;
    private String Sobrenome;
    private String cpf;
    private String endreco;
    private String idade;

   public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }

    public void setCpf(String cpf) {
        if (validaCpf(cpf)) {
             this.cpf = cpf;
        }   
    }

    public void setEndreco(String endreco) {
        this.endreco = endreco;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getEndreco() {
        return endreco;
    }

    public String getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public boolean validaCpf(String cpf) {
        if (8 == cpf.length()) {
            this.cpf = cpf;
            return true;
        }
        else 
            System.out.println("Cpf Invalido");
        return false ;
    }

 

}
