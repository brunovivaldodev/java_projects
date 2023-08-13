
package banco;

public class Gerente extends Funcionario implements Autenticavel{
    private String senha ;
    private int numeroDefuncionariosGerenciados ;
    

    @Override
    public double bonificacao() {
      return this.salario *0.15 ;
    }

    @Override
    public boolean autentica(int senha) {
        
         if (this.senha.equals(senha)) {
            System.out.println("Bem Vindo Gerente");
            return true ;
        }
        else 
        {
            System.out.println("Acesso Negado");
            return false ;
        
    }
         
    }  


   
}
