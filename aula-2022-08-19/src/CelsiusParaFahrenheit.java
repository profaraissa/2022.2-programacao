
import java.util.Scanner;

public class CelsiusParaFahrenheit {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus celsius: ");
        float grausEmCelsius = teclado.nextFloat();

        float grausEmFahrenheit = (float) (grausEmCelsius * 1.8) + 32;

        System.out.println("A mesma temperatura em fahrenheit é : " + grausEmFahrenheit);

    }
}
