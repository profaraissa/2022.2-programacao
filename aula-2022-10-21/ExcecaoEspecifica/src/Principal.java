import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
       String nome = JOptionPane.showInputDialog("Digite o nome que deseja buscar ");

       Contato c = new Contato();
       try {
           Contato achado = c.buscarContato(nome);
       }catch (ContatoNaoEncontradoException e){
           System.out.println(e.getMessage());
       }catch (NullPointerException e){
           System.out.println("Nulo");
       }
    }


}
