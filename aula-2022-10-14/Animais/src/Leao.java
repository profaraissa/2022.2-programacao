public class Leao implements IAnimal{
        int fome = 50;

    public void fazerRuido() {
        System.out.println("Grrrrrrrrrrrr !!!!!!");
    }


    public void comer() {
        System.out.printf("Mata e come");
    }

    @Override
    public int mostraFome(int qualquer) {
        return this.fome;
    }
}
