
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
public class Divisores {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor do dividendo: ");
        int dividendo = teclado.nextInt();

        System.out.println("Digite o valor do divisor: ");
        int divisor = teclado.nextInt();

        boolean verificaDivisor = (dividendo % divisor) == 0;

        System.out.println("Resultado " + verificaDivisor);

    }
}
