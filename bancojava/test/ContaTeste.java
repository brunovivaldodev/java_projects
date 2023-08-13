
import banco.Cliente;
import banco.Conta;
import banco.saldoInsuficienteException;
import java.io.PrintStream;
import java.util.Scanner;




public class ContaTeste {
    public static void main(String[] args) {
        
        Conta bruno = new Conta();
        Conta paulo = new Conta();
        Conta pedro = new Conta();
        Conta brendo = new Conta();
        Scanner pt = new Scanner(System.in);
        
        System.out.println(Conta.getTotalDeContas());
        
        bruno.Titular.setNome("Bruno");
        bruno.Titular.setSobrenome("Vivaldo");
        
        bruno.setNumeroDaConta(123); 
          
        bruno.Titular.setNome("Bruno");
        bruno.setSaldo(5000);
        try {
                bruno.saca(7000);
        } catch (saldoInsuficienteException e) {
           // System.out.println("Digite uma valor abaixo de saldo "+bruno.getSaldo());
           // bruno.saca(pt.nextInt());
            System.out.println(e.getMessage());
            
        }
    
        bruno.deposita(5000);
        int peo ;
        
        peo = 23;

      //  bruno.trasnfere(paulo, 7000);
        System.out.println("O saldo disponível é " +bruno.getSaldo());
        System.out.printf("O seu nome %s e o sobrenome %s \n",bruno.Titular.getNome(),bruno.Titular.getSobrenome() );
        
        bruno.Titular.setCpf("sdfdfdfd");
        System.out.println(bruno.getNumeroDaConta()+ "-" +bruno.getSaldo() );
        System.out.println(bruno);
        
        
        
        
        
     
    }

    
}
