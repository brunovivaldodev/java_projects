
package banco;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        System.out.println("Digite os valores para opercacao");
        Scanner pt = new Scanner(System.in);
        

        int a = pt.nextInt();
        int b = 0 ;
       
       try {
            b = pt.nextInt();
            int c = a / b;
            System.out.println(c);
        }
       
         catch (ArithmeticException exception ) {
            System.out.println("Digite outro numero");
            b = pt.nextInt();
            int c = a/b ;
            System.out.println(c);
        }
       
       catch (InputMismatchException exception){
           
            int z = (int) b ;
           
             int w= pt.nextInt();
             int h = pt.nextInt();
             int t ;
              t = a/z ;   
             System.out.println(t);
           
       }
       
       finally {
           int z= pt.nextInt();
           a =pt.nextInt();
           
           int c = a/z;
           System.out.println(c);
       }
        
    }
}
