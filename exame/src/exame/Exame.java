/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exame;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;
import exame.*;

/**
 *
 * @author brunovivaldo
 */
public class Exame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
            System.out.println("Menu:");
            System.out.println("1 - Calcula Maior");
            System.out.println("2 - Cria Digito Ctrl");
            System.out.println("3 - Seno de X");
            System.out.println("4 - Relatório");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();


            switch (opcao) {
                case 1:
                     scanner = new Scanner(System.in);
                     Set<Integer> conjunto = new HashSet<>();
                     System.out.print("Digite a quantidade de números que deseja inserir: ");
                     int quantidade = scanner.nextInt();
        
                     for (int i = 1; i <= quantidade; i++) {
                        System.out.print("Digite o número " + i + ": ");
                         int numero = scanner.nextInt();
                         conjunto.add(numero);
                    }   
                        
                    CalculaMaior calculaMaior = new CalculaMaior();
                    int maiorNumero =  calculaMaior.calculaMaior(conjunto);
                    System.out.println("O maior número do conjunto é: " + maiorNumero);
                    break;
                case 2:
                     scanner = new Scanner(System.in);
                     System.out.print("Digite o numero de contrinuintes com 8 Digitos: ");
                     String oitoPrimeirosAlgarismos = scanner.nextLine();
                     
                     CriaDigitoCtrl criaDigitoCtrl = new CriaDigitoCtrl();
   
                     int digitoControle = criaDigitoCtrl.criaDigitoCtrl(oitoPrimeirosAlgarismos);
                     System.out.println("Dígito de controle: " + digitoControle);
                    break;
                case 3:
                     scanner = new Scanner(System.in);
                     System.out.print("Digite o valor do seno: ");
                     double x = scanner.nextInt();
                     SenX senX = new SenX();
                     double valor = senX.senX(x);
                     System.out.println("O valor de seno(" + x + ") é: " + valor);
                    break;
                case 4:
                    
                    String filePath = "dados.txt"; // Caminho e nome do arquivo a ser criado
                    Relatorio rel = new Relatorio();
                    
                    rel.relatorio(filePath);
                    break;
                case 5:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
   
}




 

