import java.io.IOException;
public class Teste {
    public static void main(String[] args) throws IOException {

        Lista lista = new Lista();


        lista.adiciona();
        lista.adiciona();
        //lista.temMaxSul();
        //lista.quantNorte();
       // lista.mediaTemMin();
        lista.maiorCidade();





        System.out.println("O tamanho da lista é "+lista.tamanho());



        System.out.println("Os elementos da lista são "+lista);



    }
}
