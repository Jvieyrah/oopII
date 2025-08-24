package exe8_desafio_final_uml;

import java.util.List;


public class RepositorioProduto extends RepositorioMemoria<Produto>{

  @Override
  public void salvar(Object obj) {
    if (obj instanceof Produto) {
      memoria.add((Produto) obj);
    } else {
      System.out.println("Objeto não é um Produto.");
    }
  }

  public static void main(String[] args) {
    RepositorioProduto repositorio = new RepositorioProduto();

    Produto produto1 = new Produto("Produto A", 29.99);
    Produto produto2 = new Produto("Produto B", 49.99);

    repositorio.salvar(produto1);
    repositorio.salvar(produto2);

    System.out.println("Lista de produtos: " + repositorio.listarTodos());

    Produto encontrado = (Produto) repositorio.buscarPorId(produto1.getId());
    System.out.println("Produto encontrado: " + encontrado);
  }
}
