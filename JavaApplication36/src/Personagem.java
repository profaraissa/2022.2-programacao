/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raiss
 */
public class Personagem {

    private String nome;

    private String cor;
    private int quantidadeCogumelos;
    private double altura;
    private String tipoFisico;
    private boolean possuiBigode;

    public Personagem(String nome, String cor, double altura, String tipoFisico, boolean possuiBigode) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.tipoFisico = tipoFisico;
        this.possuiBigode = possuiBigode;
        this.quantidadeCogumelos = 20;
    }


    public void pular(int tamanhoPulo) {
        //interpolação
        System.out.println(String.format("Personagem %s pulou %d", this.nome, tamanhoPulo));
    }

    public void pegarCogumelo() {
        this.quantidadeCogumelos += 5;
    }

    public void atirarFogo(Personagem inimigo) {

        inimigo.setQuantidadeCogumelos(0);

    }

    public int getQuantidadeCogumelos() {
        return quantidadeCogumelos;
    }

    public void setQuantidadeCogumelos(int quantidadeCogumelos) {
        this.quantidadeCogumelos = quantidadeCogumelos;
    }

}
