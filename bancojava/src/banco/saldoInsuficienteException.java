/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Bruno
 */
public class saldoInsuficienteException extends Exception {
    
    public saldoInsuficienteException (String message) {
        super(message);
    }
}
