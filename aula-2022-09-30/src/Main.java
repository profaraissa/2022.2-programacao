/*

Modifique para inserir e visualizar todos os dados de um animal 

Cada animal:  
1. nome do animal
2. especie do animal
3. idade do animal
4.peso

Exemplo entrada
Noma: Hanna
Especie: Cachorro
Idade: 15
Peso: 7.0

Noma: noly
Especie: gato
Idade: 4
Peso: 3.0


Exempo saída
Hanna é um cachorro de 15 anos com 7.0 kgs
noly é um gato de 4 anos com 3.0 kgs
 */

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
