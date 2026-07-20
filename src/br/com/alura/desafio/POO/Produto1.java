package br.com.alura.desafio.POO;

public class Produto1 {
    private String nome;
    private double preco;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double aplicarDesconto(int percentual){
       double desconto = this.preco * (percentual / 100.0);
       this.preco -= desconto;
       return desconto;
    }

}
