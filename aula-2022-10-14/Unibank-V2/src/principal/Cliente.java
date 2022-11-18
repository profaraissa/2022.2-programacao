package principal;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raiss
 */
public class Cliente {
    private String nome;
    private final String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        System.out.println("principal.Cliente criado objeto: " + this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //sobrecarga
    @Override
    public String toString() {
        return "principal.Cliente{" + "nome=" + nome + ", cpf=" + cpf + '}';
    }


}
