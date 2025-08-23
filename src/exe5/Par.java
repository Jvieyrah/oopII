package exe5;

import java.util.List;

public class Par<K, V> {
    private K chave;
    private V valor;

    public Par(K chave, V valor) {
        this.chave = chave;
        this.valor = valor;
    }

    public K getChave() {
        return chave;
    }

    public void setChave(K chave) {
        this.chave = chave;
    }

    public V getValor() {
        return valor;
    }

    public void setValor(V valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Par{" +
                "chave=" + chave +
                ", valor=" + valor +
                '}';
    }

    public static void main(String[] args) {
      Par<String, Integer> aluno1 = new Par<>("João", 20);
      Par<String, Integer> aluno2 = new Par<>("Maria", 22);
      Par<String, Integer> aluno3 = new Par<>("Ana", 10 );

      List<Par<?,?>> listaAlunos = List.of(aluno1, aluno2, aluno3);
      for (Par<?, ?> aluno : listaAlunos) {
        System.out.println("nome: " + aluno.getChave() + ", idade: " + aluno.getValor());
      }
    }



}
