package br.com.alura.desafio.POO.desafio02;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Produto carro = new Produto("Porche 911", 344345.00, 1);
        Produto carro2 = new Produto("Ferrari Puro Sangue", 566455.90, 2);
        Produto carro3 = new Produto("Mustang", 345566.89, 5);

        ArrayList<Produto>listaProdutos = new ArrayList<>();
        listaProdutos.add(carro);
        listaProdutos.add(carro2);
        listaProdutos.add(carro3);
        System.out.println(listaProdutos.toString());
        System.out.println(listaProdutos.size());
        System.out.println(listaProdutos.get(2));

    }
}
