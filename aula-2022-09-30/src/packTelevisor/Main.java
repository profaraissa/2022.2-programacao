/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packTelevisor;

/**
 *
 * @author raiss
 */
public class Main {
    public static void main(String[] args) {
        Televisor tv1 = new Televisor();
        Televisor tv2 = new Televisor();

        tv1.aumentarVolume();
        tv1.aumentarVolume();
        tv1.aumentarVolume();
        tv1.aumentarVolume();
        tv1.aumentarVolume();
        tv1.aumentarVolume();
        tv1.aumentarVolume();
        tv1.aumentarVolume();

        tv1.reduzirVolume();
        tv1.reduzirVolume();
        tv1.reduzirVolume();

        tv1.aumentarVolume();
        tv1.aumentarVolume();
        tv1.aumentarVolume();

        tv1.trocarCanal(11);

        tv2.trocarCanal(5);

        System.out.println("TV1 - " + tv1.mostrar());
        System.out.println("TV2 - " + tv2.mostrar());

    }
}
