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
public class Televisor {
    public int volume = 0;
    public int canal;

    public void aumentarVolume() {
        //verificar se tá vol maximo
        int volumeMax = 100;

        if (this.volume < volumeMax) {
            this.volume++;
        } else {
            System.out.println("Volume máximo é " + volumeMax);
        }

    }

    public void reduzirVolume() {
        //verificar se tá vol maximo
        int volumeMin = 0;

        if (this.volume > volumeMin) {
            this.volume--;
        } else {
            System.out.println("Volume minimo é " + volumeMin);
        }

    }

    public void trocarCanal(int canal) {
        this.canal = canal;
    }

    public String mostrar() {
        String info = String.format("Canal %d - Volume %d", this.canal, this.volume);
        return info;
    }


}
