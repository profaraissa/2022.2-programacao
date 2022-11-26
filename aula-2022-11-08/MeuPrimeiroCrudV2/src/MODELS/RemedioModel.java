/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELS;

/**
 *
 * @author raiss
 */
public class RemedioModel {
    private int codigo;
    private String nome;
    private String dosagem;

    public RemedioModel() {
    }

    public RemedioModel(int codigo, String nome, String dosagem) {
        this.codigo = codigo;
        this.nome = nome;
        this.dosagem = dosagem;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public RemedioModel(String nome, String dosagem) {
        this.nome = nome;
        this.dosagem = dosagem;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getDosagem() {
        return dosagem;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDosagem(String dosagem) {
        this.dosagem = dosagem;
    }

}
