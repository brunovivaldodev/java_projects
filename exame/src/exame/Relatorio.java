/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exame;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author brunovivaldo
 */
public class Relatorio {
    public void relatorio(String filePath) {
        try {
            FileWriter writer = new FileWriter(filePath);

            Scanner scanner = new Scanner(System.in);

            writer.write("###################################################\n");

            System.out.print("Instituição: ");
            String instituicao = scanner.nextLine();
            writer.write("Instituição: " + instituicao + "\n");

            System.out.print("Curso: ");
            String curso = scanner.nextLine();
            writer.write("Curso: " + curso + "\n");

            System.out.print("Disciplina: ");
            String disciplina = scanner.nextLine();
            writer.write("Disciplina: " + disciplina + "\n");

            System.out.print("Ano Letivo: ");
            String anoLetivo = scanner.nextLine();
            writer.write("Ano Letivo: " + anoLetivo + "\n");
            
            System.out.print("Nº do Aluno: ");
            String numeroAluno = scanner.nextLine();
            writer.write("Nº do Aluno: " + numeroAluno + "\n");
            
            System.out.print("Nome do Aluno: ");
            String nomeAluno = scanner.nextLine();
            writer.write("Nome do Aluno: " + nomeAluno + "\n");

     
            writer.write("###################################################");

            writer.close();
            System.out.println("Arquivo " + filePath + " criado com sucesso!");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao criar o arquivo: " + e.getMessage());
        }
    }
}
