/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exame;

import java.util.Set;

/**
 *
 * @author brunovivaldo
 */
class CalculaMaior {
      public int calculaMaior(Set<Integer> numeros) {
         
         
        if (numeros.isEmpty()) {
            throw new IllegalArgumentException("O conjunto não pode estar vazio.");
        }
        
        int maior = Integer.MIN_VALUE;
        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
        }
        
        return maior;
    }
}
