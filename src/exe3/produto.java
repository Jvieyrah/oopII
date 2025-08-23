package exe3;

public class produto implements Comparavel<produto>{
  public String nome;
  public double preco;

  @Override
  public boolean ehMaiorQue(produto outro) {
    return this.preco > outro.preco;
  }
}

class ProdutoMain {
  public static void main(String[] args) {
    produto p1 = new produto();
    p1.nome = "Produto A";
    p1.preco = 10.0;

    produto p2 = new produto();
    p2.nome = "Produto B";
    p2.preco = 20.0;

    if (p1.ehMaiorQue(p2)) {
      System.out.println(p1.nome + " é mais caro que " + p2.nome);
    } else {
      System.out.println(p1.nome + " não é mais caro que " + p2.nome);
    }
  }
}
