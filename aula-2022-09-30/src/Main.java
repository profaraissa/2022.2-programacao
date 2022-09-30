

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);

        String animais[] = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o nome de um animal");
            animais[i] = t.next();
        }
        //outra de fazer um for 
        //serve apenas para vetores
        for (String elemento : animais) {
            System.out.println(elemento);
        }

    }

}
