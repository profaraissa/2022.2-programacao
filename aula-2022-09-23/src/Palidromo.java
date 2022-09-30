
import java.util.Scanner;

//C h a t[ ] d a[ ] a   u   l   a
//0 1 2 3[4]5 6[7] 8 9 10 11
//1 – Faça um programa que receba uma frase do usuário e imprima um caractere por linha da esquerda para direita, da direita para esquerda e qual o tamanho da frase.
public class Palidromo {
    public static void main(String[] args) {
        
        Scanner t = new Scanner(System.in);
        
        String palavra = "arara";
        String palavraInvertida = "";
        
        for (int i = palavra.length() - 1; i >= 0; i--) {
            
            char letraEmChar = palavra.charAt(i);
            
            String letra = String.valueOf(letraEmChar);
            
            palavraInvertida = palavraInvertida.concat(letra);
        }

        System.out.println(" É Palidromo ?  " + palavra.equals(palavraInvertida));
    }

}
