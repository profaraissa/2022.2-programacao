
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
public class ComissaoFucionario {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do funcionário");
        String nomeFuncionario = teclado.nextLine();
        System.out.println("Digite a quantidade de vendas");
        int qtdVendas = teclado.nextInt();
        float valorComissao;

        if (qtdVendas > 500) {
            valorComissao = qtdVendas * 2;
        } else if (qtdVendas > 250) {
            valorComissao = (float) (qtdVendas * 1.5);
        } else {
            valorComissao = qtdVendas;
        }

        System.out.println("Nome: " + nomeFuncionario);
        System.out.println("Comissão: " + valorComissao);

    }
}
