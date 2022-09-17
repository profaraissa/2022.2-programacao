/*
 Escreva um algoritmo que exiba n vezes 
a mensagem “Eu gosto de fazer exercícios de programação!”. 

 */
package parte1;

import java.util.Scanner;

/**
 *
 * @author raiss
 */
public class ExibirMensagensRepetidas {
    public static void main(String[] args) {

        System.out.println("Quantas vezes a mensagem será exibida? ");
        Scanner s = new Scanner(System.in);
        int qtd = s.nextInt();

        String msg = "Eu gosto de fazer exercícios de programação!";

        int contador = 0;

        while (contador < qtd) {
            System.out.println(msg);
            contador++;
        }

    }
}
