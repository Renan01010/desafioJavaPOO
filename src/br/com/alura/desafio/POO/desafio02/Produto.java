package br.com.alura.desafio.POO.desafio02;

public class Produto {
    private String nome;
    private Double preco;
    private int quantidade;

    public Produto(String nome, Double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        System.out.println("Descrição:" + this.nome + "\nPreço: " + this.preco + "\nQuantidade: " + this.quantidade + "\n");
        return "";
    }
}
