/*
Escreva um algoritmo que calcule a soma dos números de 1 a 13. 


 */
package parte1;

import java.util.Scanner;

/**
 *
 * @author raiss
 */
public class SomaAteN {
    public static void main(String[] args) {

        System.out.println("Que que some até qual valor? ");
        Scanner s = new Scanner(System.in);
        int qtd = s.nextInt();

        int soma = 0;

        int contador = 0;

        while (contador < qtd) {

            soma += contador;

            contador++;

        }

        System.out.println("O valor da soma de 0 a até " + qtd + " é " + soma);

    }
}
