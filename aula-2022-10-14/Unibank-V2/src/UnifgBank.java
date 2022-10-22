/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import principal.Cliente;
import principal.Conta;
import principal.ContaCorrente;
import principal.ContaPoupanca;

import java.util.ArrayList;

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
        
        Conta contaCorrente1 = new ContaCorrente(raissa, 123, 2, false);
        ContaCorrente contaCorrente2 = new ContaCorrente();
        ContaCorrente contaCorrente3 = new ContaCorrente(samuel, 321, 1, true);
        ContaCorrente contaCorrente4 = new ContaCorrente(camile, 456, 1, true);
        
        contaCorrente1.depositar(500);
        contaCorrente3.depositar(3.50);
        contaCorrente4.depositar(10);

        contaCorrente1.sacar(600);

        ContaPoupanca contaPoupanca1 = new ContaPoupanca(ZeDeNada, 96369,45, 2.5);

        contaPoupanca1.depositar(500.3);

        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta c = new Conta();

        Conta contas[] = new Conta[10];
        contas[0] = contaCorrente1;
        contas[1] = contaCorrente3;
        System.out.println("Taxa de Juros = " + contaPoupanca1.getTaxaJuros());
        
    }
    

}
