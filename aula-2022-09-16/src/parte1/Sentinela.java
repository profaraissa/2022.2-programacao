package parte1;


import java.util.Scanner;

/*
– Escreva um algoritmo que leia uma sequência de números do usuário e realize a soma desses números. Encerre a execução quando um número negativo for digitado.

 */

/**
 *
 * @author raiss
 */
public class Sentinela {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int valor;

        do {
            System.out.println("Digite um valor positivo, valores negativos encerram o programa");
            valor = s.nextInt();
        } while (valor > 0);

        
    }
}
