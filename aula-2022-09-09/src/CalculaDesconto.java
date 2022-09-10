
import java.util.Scanner;

/*
Elabore uma programa que receba o nome de um produto e o seu valor e imprima o nome do produto, valor e o valor com desconto. 
O desconto deve ser calculado de acordo com o valor fornecido conforme a Tabela abaixo. 
Caso o valor digitado seja menor ou igual a zero, deve ser emitida uma mensagem avisando que o valor é invalido. 

entre [50 e 200)        5%
entre [200 e 500)      6%
entre [500 e 1000)    7%
a partir de [1000       8%
 */

/**
 *
 * @author raiss
 */
public class CalculaDesconto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valorComDesconto;

        System.out.println("Digite o nome do produto");
        String nome = teclado.nextLine();

        System.out.println("Digite o valor do produto");
        double valorProduto = teclado.nextDouble();

        if (valorProduto >= 1000.0) {
            valorComDesconto = 0.92 * valorProduto;
        } else if (valorProduto < 1000.0 && valorProduto >= 500.0) {
            valorComDesconto = 0.93 * valorProduto;
        } else if (valorProduto < 500.0 && valorProduto >= 200.0) {
            valorComDesconto = 0.94 * valorProduto;
        } else if (valorProduto < 200.0 && valorProduto >= 50.0) {
            valorComDesconto = 0.95 * valorProduto;
        } else {
            valorComDesconto = valorProduto;
        }

        System.out.println("Produto:  " + nome);
        System.out.println("Valor Original:  " + valorProduto);
        System.out.println("Valor Final:  " + valorComDesconto);

    }
}
