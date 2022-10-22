public interface IAnimal {
     String urlImagem ="";
     String comida="";
     int fome=100;

     public void fazerRuido();

/**
 * Esse método mostra os comentários do animal se alimentando
 */
     public void comer();
/**
 * Mostra o nível de fome do animal
 * @param qualquer
 */
     public int mostraFome( int qualquer);
}
