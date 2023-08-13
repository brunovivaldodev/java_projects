
import java.util.Scanner;

public class Lista {

    private Provincia primeira;
    private Provincia ultima;
    private int totalDeElementos;

    Scanner pt = new Scanner(System.in);

    public void adcionaNoComeco() {

        Provincia nova = new Provincia();

        System.out.println("Digite o nome da provincia");
        nova.setNomeProvincia(pt.nextLine());
        System.out.println("Digite a Localização");
        nova.setLocalizacao(localizacao.valueOf(pt.nextLine()));
        System.out.println("Digite o valor da temperatura miníma");
        nova.setTempmin(pt.nextFloat());
        System.out.println("Digite o valor da temperatura maxíma");
        nova.setTempmax(pt.nextFloat());
        System.out.println("Digite A quantidade de Habitantes");
        nova.setQuantHabitantes(pt.nextInt());

        this.primeira = nova;

        if (totalDeElementos == 0) {
            this.ultima = nova;
        }
        this.totalDeElementos++;

    }

    public void adiciona() {
        if (this.totalDeElementos == 0) {
            adcionaNoComeco();
        } else {

            Provincia nova = new Provincia();

            Scanner pi = new Scanner(System.in);
            System.out.println("Digite o nome da provincia");
            nova.setNomeProvincia(pi.nextLine());
            System.out.println("Digite a Localização");
            nova.setLocalizacao(localizacao.valueOf(pi.nextLine()));
            System.out.println("Digite o valor da temperatura miníma");
            nova.setTempmin(pi.nextFloat());
            System.out.println("Digite o valor da temperatura maxíma");
            nova.setTempmax(pi.nextFloat());
            System.out.println("Digite A quantidade de Habitantes");
            nova.setQuantHabitantes(pi.nextInt());

            this.ultima.setProxima(nova);
            this.ultima = nova;
            totalDeElementos++;

        }
    }

    public void temMaxSul() {
        if (this.totalDeElementos == 0) {
            System.out.println("Lista está vazia");
        } else {
            Provincia aux = this.primeira;

            Provincia atual = aux;

            float temp = 0;
            while (aux != null) {

                if (aux.getLocalizacao().equals("Sul") && aux.getTempmax() > temp) {

                    atual = aux;
                    temp = aux.getTempmax();
                }
                aux = aux.getProxima();
            }
            System.out.println("A cidade do SUl com maior temperatura maxíma é " + atual.getNomeProvincia());
        }
    }

    public void quantNorte() {
        if (this.totalDeElementos == 0) {
            System.out.println("Lista está vazia");
        } else {
            Provincia aux = this.primeira;
            int c = 0;
            while (aux != null) {
                if (aux.getLocalizacao().equals("Norte") && aux.getQuantHabitantes() > 4000000) {
                    c++;
                }
                aux = aux.getProxima();
            }
            System.out.println("A quantidade de cidades do Norte com mais de 4 Milhoes de habitantes é " + c);
        }

    }

    public void mediaTemMin() {
        if (this.totalDeElementos == 0) {
            System.out.println("Lista vazia");
        } else {
            Provincia aux = this.primeira;
            float media_norte = 0, media_sul = 0;
            int n = 0, s = 0;

            while (aux != null) {
                if (aux.getLocalizacao().equals("Norte")) {
                    media_norte = media_norte + aux.getTempmin();
                    n++;
                } else {
                    media_sul = media_sul + aux.getTempmin();
                    s++;
                }
                aux = aux.getProxima();
            }
            System.out.printf("A media das temperaturas minimas do Norte é %.2f e do Sul é %.2f \n", media_norte / n, media_sul / s);
        }

    }

    public void maiorCidade() {
        if (this.totalDeElementos == 0) {
            System.out.println("Lista está vazia");
        } else {
            Provincia aux = this.primeira;

            Provincia atual = aux;

            float hab = 0;
            while (aux != null) {

                if (aux.getQuantHabitantes() > hab) {

                    atual = aux ;
                    hab= aux.getTempmax();
                }
                aux = aux.getProxima();
            }
            System.out.println("A cidade de Angola Com mais Habitantes é " + atual.getNomeProvincia());
        }
    }


    public String toString() {

        if (this.totalDeElementos == 0) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        Provincia atual = primeira;

        for (int i = 0; i < this.totalDeElementos - 1; i++) {
            builder.append(atual.getNomeProvincia());
            builder.append(", ");
            atual = atual.getProxima();
        }

        builder.append(atual.getNomeProvincia());
        builder.append("]");
        return builder.toString();
    }

    public int tamanho() {
        return totalDeElementos;
    }

}
