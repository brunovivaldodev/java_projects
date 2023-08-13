
import banco.Cliente;
import java.util.Scanner;


public class ClienteTeste {
    public static void main(String[] args) {
        Cliente bruno = new Cliente();
        Scanner pt = new Scanner(System.in);
        
        System.out.println("Digite o seu Cpf");
        bruno.setCpf(pt.nextLine());
        System.out.println("O seu cpf é "+bruno.getCpf());
        System.out.println("Digite o seu nome ");
      
        System.out.println("o seu nome é " + bruno.getNome());
    }
}
