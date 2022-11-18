
import java.util.Scanner;

/*
Faça um programa que calcule o preço do cinema e imprima na tela o dia da semana, o valor do ingresso normal e valor caso tenha desconto, 
imprima o valor do ingresso com o desconto. Veja mais informações nas tabelas ao lado

O programa deve ter como entrada: o dia da semana (Segunda = 1, Terça = 2...), idade e se o cliente tem carteira de meio ingresso (S ou N).
Os valores dos ingressos nas segundas, terças e quintas são de 18 reais;
O valor do ingresso nas quartas é de 12 reais.
Os valores nos finais de semana é de 26 reais. 
Se o cliente tiver carteirinha de meia entrada ou
 for menor de 18 anos, ele deve pagar meia entrada.
É obrigatório a utilização de operadores lógicos


 */

/**
 *
 * @author raiss
 */
public class IngressoCinema {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println(" 1 - Segunda");
        System.out.println(" 2 - Terça");
        System.out.println(" 3 - Quarta");
        System.out.println(" 4 - Quinta");
        System.out.println(" 5 - Sexta");
        System.out.println(" 6 - Sabado");
        System.out.println(" 7 - Domingo");
        System.out.println("Digite um dia da semana: \n");
        int diaSemana = s.nextInt();
        int valorIngresso;

        System.out.println("Qual a idade? \n");
        int idade = s.nextInt();

        if (diaSemana == 1 || diaSemana == 2 || diaSemana == 4) {
            valorIngresso = 18;
        } else if (diaSemana == 3) {
            valorIngresso = 12;
        } else {
            valorIngresso = 26;
        }

        if (idade < 18) {
            valorIngresso = valorIngresso / 2;
        } else {
            System.out.println("Tem carterinha? ");

            String temCarteirinha = s.next();

            if (temCarteirinha.equalsIgnoreCase("s")) {
                valorIngresso = valorIngresso / 2;
            }

        }

        System.out.println("O valor do ingresso é: " + valorIngresso);
    }
}
