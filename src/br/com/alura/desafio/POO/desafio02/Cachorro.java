package br.com.alura.desafio.POO.desafio02;

public class Cachorro extends Animal{
    private int latidos;

    public Cachorro(String nome, int idade, int latidos) {
        super(nome, idade);
        this.latidos = latidos;
    }

}
