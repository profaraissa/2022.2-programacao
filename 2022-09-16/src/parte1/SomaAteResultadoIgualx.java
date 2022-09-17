/*
Usuario digite um valor, ex: 40

 */
package parte1;

import java.util.Scanner;

/**
 *
 * @author raiss
 */
public class SomaAteResultadoIgualx {
    public static void main(String[] args) {

        System.out.println("Qual o valor máximo ? ");
        Scanner s = new Scanner(System.in);
        int valorMaximo = s.nextInt();

        int soma = 0;
        int contador = 0;

        while (soma < valorMaximo) {
            soma += contador;
            contador++;
        }

        System.out.println("O valor da soma de 0 a até " + contador + " é " + soma);

    }
}
