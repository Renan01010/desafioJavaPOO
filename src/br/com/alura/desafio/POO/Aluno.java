package br.com.alura.desafio.POO;

public class Aluno {
    private String nome;
    private int notas;
    private int contNotas = 0;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNotas(int notas) {
        this.notas = notas;
        contNotas++;
    }

    public String getNome() {
        return nome;
    }

    public int getNotas() {
        return notas;
    }





}
