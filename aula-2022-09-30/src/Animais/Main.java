package Animais;

/*

Modifique para inserir e visualizar todos os dados de um animal 

Cada animal:  
1. nome do animal
2. especie do animal
3. idade do animal
4. peso

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
import pck2.Classe1;
//descomente essa linha para testar import pck3.Classe2;

public class Main {

    public static void main(String[] args) {

        Animal animais[] = new Animal[2];

        Classe1 c1 = new Classe1();
        // descomente essa linha para testar Classe2 c2 = new Classe2();

        Scanner t = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            Animal a = new Animal();

            System.out.println("Digite o nome de um animal");
            a.nome = t.next();

             System.out.println("Digite o especie de um animal");
            a.especie = t.next();

            System.out.println("Digite o idade de um animal");
            a.idade = t.nextInt();

            System.out.println("Digite o peso de um animal");
            a.peso = t.nextFloat();

            animais[i] = a;
        }
        //outra de fazer um for 
        //serve apenas para vetores
        for (Animal elemento : animais) {
            String info = String.format("%s é um %s de %d anos com %f kgs", elemento.nome, elemento.especie, elemento.idade, elemento.peso);
            System.out.println(info);
        }

    }

}
