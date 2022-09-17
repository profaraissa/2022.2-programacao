/*
SCREVA UM PROGRAMA QUE APRESENTE QUATRO OPÇÕES: 
(A) CONSULTA SALDO, 
(B) SAQUE E
(C) DEPÓSITO E 
(D) SAIR. O SALDO DEVE INICIAR EM R$ 0,00. A CADA SAQUE OU
DEPÓSITO O VALOR DO SALDO DEVE SER ATUALIZADO.
 */
package parte2;

import java.util.Scanner;
import java.math.BigDecimal;

/**
 *
 * @author raiss
 */
public class OperacoesBancarias {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        BigDecimal saldo = new BigDecimal(0.0);
        String opcao;

        do {

            System.out.println("Veja as opções abaixo e digite a letra correspondente a sua opção: \n\n");
            System.out.println("(A) CONSULTA SALDO");
            System.out.println("(B) SAQUE");
            System.out.println("(C) DEPÓSITO");
            System.out.println("(D) SAIR");

            opcao = s.next();

            switch (opcao) {

                case "A":
                case "a":
                    System.out.println("Seu saldo é " + saldo);
                    break;
                case "B":
                case "b":
                    BigDecimal valorSaque = new BigDecimal(0.0);
                    System.out.println("Qual o valor você quer sacar? ");
                    valorSaque = s.nextBigDecimal();

                    if (valorSaque.compareTo(saldo) > 0) {
                        System.out.println("Você não tem dinheiro para sacar");
                    } else {
                        saldo = saldo.subtract(valorSaque);
                        System.out.println("Saque concluído com sucesso");
                    }
                    break;

                case "C":
                case "c":
                    BigDecimal valorDeposito = new BigDecimal(0.0);
                    System.out.println("Qual o valor você quer depositar? ");
                    valorDeposito = s.nextBigDecimal();
                    saldo = saldo.add(valorDeposito);
                    System.out.println("Deposito concluído com sucesso");
                    break;
                case "D":
                case "d":
                    System.out.println("Você encerrou o programa");
                    break;
                default:
                    System.out.println("Não existe essa opção");
            }
        } while (!opcao.equalsIgnoreCase("D"));

    }
}
