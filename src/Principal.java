import br.com.alura.desafio.POO.ContaBancaria;
import br.com.alura.desafio.POO.IdadePessoa;
import br.com.alura.desafio.POO.Produto;

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

        Produto produto = new Produto();
        produto.setNome("Leite");
        produto.setPreco(10.90);

        System.out.println("Desconto foi de: " + produto.aplicarDesconto(50));


    }
}
