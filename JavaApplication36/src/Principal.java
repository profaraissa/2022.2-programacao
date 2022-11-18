/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raiss
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Personagem mario = new Personagem("Mario", "Vermelho", 1.50, "baixinho", true);
        Personagem luigiSemBigode = new Personagem("Luigi", "Verdo", 1.85, "alto", false);

        mario.pular(2);
        luigiSemBigode.pegarCogumelo();
        
        mario.atirarFogo(luigiSemBigode);
        
    }

}
