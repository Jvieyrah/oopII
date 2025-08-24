package exe8_desafio_final_uml;

import java.util.ArrayList;
import java.util.List;

public abstract class RepositorioMemoria<T> implements Repositorio<Object>{
  List<T> memoria = new ArrayList<>();

  @Override
  public abstract void salvar(Object obj);

  @Override
  public Object buscarPorId(int id) {
    for (T item : memoria) {
      if (item instanceof MemoryEntity && ((MemoryEntity) item).getId() == id) {
        return item; // Retorna o objeto encontrado
      }
    }
    return null;
  }

  @Override
  public List<Object> listarTodos() {
    return (List<Object>) (List<?>) memoria;
  }
}
