
import static java.lang.Math.*;
import java.util.Scanner;

public class DistanciaPontosCartesianos {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite as coordenadas do ponto 1 (x,y) em double");
        //receber a posicao x do ponto 1
        double xPonto1 = teclado.nextDouble();
        //receber a posicao y do ponto 1
        double yPonto1 = teclado.nextDouble();

        System.out.println("Digite as coordenadas do ponto 2 (x,y) em double");
        //receber a posicao x do ponto 2
        double xPonto2 = teclado.nextDouble();
        //receber a posicao y do ponto 2
        double yPonto2 = teclado.nextDouble();

        double diferencaX = pow((xPonto2 - xPonto1), 2);

        double diferencaY = pow((yPonto2 - yPonto1), 2);
        //sqrt = rais quadrada
        double distancia = sqrt(diferencaX + diferencaY);

        System.out.println("A distância entre os pontos é " + distancia);

    }
}
