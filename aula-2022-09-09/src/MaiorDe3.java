
import java.util.Scanner;

/*
Escreva um programa para ler 3 valores inteiros e escrever o maior deles. Considere que o usuário não informará valores iguais.

 */
/**
 *
 * @author raiss
 */
public class MaiorDe3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 1o. valor");
        int valor1 = teclado.nextInt();

        System.out.println("Digite 2o. valor");
        int valor2 = teclado.nextInt();

        System.out.println("Digite 3o. valor");
        int valor3 = teclado.nextInt();

        int maior;

        if (valor1 > valor2 && valor1 > valor3) {
            maior = valor1;
        } else if (valor2 > valor1 && valor2 > valor3) {
            maior = valor2;
        } else {
            maior = valor3;
        }

        System.out.println("O maior valor é " + maior);

    }
}
