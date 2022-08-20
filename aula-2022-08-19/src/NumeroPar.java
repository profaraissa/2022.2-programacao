
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raiss
 */
public class NumeroPar {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o numero: ");
        int numero = teclado.nextInt();

        boolean verificaPar = (numero % 2) == 0;

        System.out.println(" é par??  " + verificaPar);

    }
}
