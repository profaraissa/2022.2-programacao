import java.lang.*;

public class PilhaChamadas {
    public static void main(String[] args) {
        System.out.println("Inicio Metodo Principal");
        metodo1();
        System.out.println("Fim do Metodo Principal");
    }

    private static void metodo1() {
        System.out.println("Inicio Metodo metodo1");
        metodo2();
        System.out.println("Fim do Metodo metodo1");
    }

    private static void metodo2() {
        System.out.println("Inicio Metodo metodo2");
        try {
            int[] array = new int[5];
            for (int i = 0; i <= 5; i++) {
                array[i] = i + 1;
            }
            for (int i = 0; i <= 5; i++) {
                System.out.println(array[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array estourado, ou seja, você está tentando acessar um indice maior que o você do array");
        } catch (Exception e) {
            System.out.println("Erro " + e);
        }
        System.out.println("Fim do Metodo metodo2");
    }


}
