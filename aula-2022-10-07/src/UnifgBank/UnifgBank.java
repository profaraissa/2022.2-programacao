/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnifgBank;

import java.util.Scanner;


/**
 *
 * @author raiss
 */
public class UnifgBank {

    public static void main(String[] args) {
        Cliente raissa = new Cliente("Raissa", "12345678900");
        Cliente ZeDeNada = new Cliente("Ze de nada", "16645678900");
        Cliente samuel = new Cliente("Samuel", "12345678560");
        Cliente camile = new Cliente("Camile", "12345658900");
        
        Conta conta1 = new Conta(raissa, 123, 2, false);
        Conta conta2 = new Conta();
        Conta conta3 = new Conta(samuel, 321, 1, true);
        Conta conta4 = new Conta(camile, 456, 1, true);
        
        conta1.depositar(500);
        conta3.depositar(3.50);
        conta4.depositar(10);

        conta1.sacar(600);
        
    }
    

}
