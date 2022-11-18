/*
Escreva um programa que verifique a validade de uma senha fornecida pelo usuário. A senha válida é a string abc. 
Devem ser impressas as seguintes mensagens: ACESSO PERMITIDO caso a senha seja válida. ACESSO NEGADO caso a senha seja inválida.

 */

import java.util.Scanner;

public class ValidaSennha {
    public static void main(String[] args) {

        String senhaValida1 = "abc";
        String senhaValida2 = "Abc";
        String senhaValida3 = "abC";
        

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma senha");
        String senhaRecebida = teclado.nextLine();

        if (senhaRecebida.equals(senhaValida1) || senhaRecebida.equals(senhaValida2) || senhaRecebida.equals(senhaValida3)) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado");
        }

    }
}
