import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Contato {
    private String nome;

    List<String> listaContato = Arrays.asList("Buenos Aires", "Córdoba", "La Plata","Maria", "Joana", "Pedro", "Thiago");

    public Contato() {
    }

    public Contato(String nome) {
        this.nome = nome;
    }

    public  Contato buscarContato(String nome) throws ContatoNaoEncontradoException{
        Contato n = null ;
        for (int i = 0; i < listaContato.size()-1; i++) {
            if(listaContato.get(i).equals(nome)){
                n.nome = nome;
                return n;
            }
        }

        throw new ContatoNaoEncontradoException("Contato não encontrado");
    }
}
