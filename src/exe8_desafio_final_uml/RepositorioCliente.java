package exe8_desafio_final_uml;

public class RepositorioCliente extends RepositorioMemoria<Cliente>{

  @Override
  public void salvar(Object obj) {
    if (obj instanceof Cliente) {
      memoria.add((Cliente) obj);
    } else {
      throw new IllegalArgumentException("Objeto não é do tipo Cliente");
    }
  }

  public static void main(String[] args) {
    RepositorioCliente repositorio = new RepositorioCliente();
    Cliente cliente1 = new Cliente("Jean Carbone", "jeal@carbone.com");
    Cliente cluente = new Cliente("Tulio Bertulho", "tulio@bertilio");
    repositorio.salvar(cliente1);
    repositorio.salvar(cluente);
    System.out.println("Lista de clientes: " + repositorio.listarTodos());
    Cliente encontrado = (Cliente) repositorio.buscarPorId(cliente1.getId());
    System.out.println("Cliente encontrado: " + encontrado);
    Cliente naoEncontrado = (Cliente) repositorio.buscarPorId(999); // ID inexistente
    if (naoEncontrado == null) {
      System.out.println("Cliente não encontrado com ID 999");
    } else {
      System.out.println("Cliente encontrado: " + naoEncontrado);
    }
    System.out.println("Todos os clientes: " + repositorio.listarTodos());
  }
}
