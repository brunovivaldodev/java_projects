/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exame;

/**
 *
 * @author brunovivaldo
 */
public class CriaDigitoCtrl {
    
         
     public int criaDigitoCtrl(String oitoPrimeirosAlgarismos) {
        if (oitoPrimeirosAlgarismos.length() != 8) {
            throw new IllegalArgumentException("Os oito primeiros algarismos devem ter tamanho igual a 8.");
        }
        
        int[] multiplicadores = { 9, 8, 7, 6, 5, 4, 3, 2 };
        int soma = 0;
        
        for (int i = 0; i < 8; i++) {
            int algarismo = Character.getNumericValue(oitoPrimeirosAlgarismos.charAt(i));
            soma += algarismo * multiplicadores[i];
        }
        
        int resto = soma % 11;
        int digitoControle;
        
        if (resto == 0 || resto == 1) {
            digitoControle = 0;
        } else {
            digitoControle = 11 - resto;
        }
        
        return digitoControle;
    }
    
}
