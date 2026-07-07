package br.com.alura.desafio.POO;

public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String verificarIdade(){
        if (this.idade >= 18){
            return "Maior de Idade!";
        }
        return "Menor de Idade!";
    }

}
