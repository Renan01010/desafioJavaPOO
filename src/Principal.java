import br.com.alura.desafio.POO.ContaBancaria;
import br.com.alura.desafio.POO.IdadePessoa;
import br.com.alura.desafio.POO.Pessoa;
import br.com.alura.desafio.POO.Produto1;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setTitular("Renan");
        conta.setSaldo(1500);
        conta.setNumeroConta(1233);

        System.out.println("Numero da conta: " + conta.getNumeroConta());
        System.out.println("Nome do titular: " + conta.getTitular());
        System.out.println("Saldo: " + conta.getSaldo());

        IdadePessoa pessoa = new IdadePessoa();
        pessoa.setNome("Renan Teles");
        pessoa.setIdade(20);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println(pessoa.verificarIdade());

        Produto1 produto = new Produto1();
        produto.setNome("Leite");
        produto.setPreco(10.90);

        System.out.println("Desconto foi de: " + produto.aplicarDesconto(50));

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();
        pessoa1.setIdade(20);
        pessoa1.setNome("Renan");
        pessoa2.setIdade(25);
        pessoa2.setNome("Lucas");
        pessoa3.setIdade(24);
        pessoa3.setNome("Jorge");

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);

        System.out.println(pessoas.size());
        System.out.println(pessoas.get(0
        ));
        System.out.println(pessoas);

    }
}
