
import java.util.Scanner;

public class TrocaValores {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor de X ");
        int x = teclado.nextInt();
        System.out.println("Digite o valor de Y ");
        int y = teclado.nextInt();
        System.out.println("Digite o valor de Z ");
        int z = teclado.nextInt();

        System.out.println("X= " + x + " Y= " + y + " Z= " + z);

        int auxiliar = x;
        x = z;
        z = y;
        y = x;

        System.out.println("X= " + x + " Y= " + y + " Z= " + z);
    }
}
