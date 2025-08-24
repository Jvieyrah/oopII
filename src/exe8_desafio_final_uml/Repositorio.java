package exe8_desafio_final_uml;

import java.util.List;

public interface Repositorio<T> {
  void salvar(T obj);
  T buscarPorId(int id);
  List<T> listarTodos();

}
