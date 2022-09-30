
import java.util.Scanner;

//C h a t[ ] d a[ ] a   u   l   a
//0 1 2 3[4]5 6[7] 8 9 10 11
//1 – Faça um programa que receba uma frase do usuário e imprima um caractere por linha da esquerda para direita, da direita para esquerda e qual o tamanho da frase.
public class CaracterePorLinha {
    public static void main(String[] args) {
        
        Scanner t = new Scanner(System.in);
        
        System.out.println("Digite uma frase: ");
        String frase = "Chat legal";//t.nextLine();
        
        for (int i = 0; i < frase.length(); i++) {
            System.out.println(frase.charAt(i));
        }

        for (int i = frase.length() - 1; i >= 0; i--) {
            System.out.println(frase.charAt(i));
        }

        System.out.println("Tamanho  " + frase.length());
    }

}
