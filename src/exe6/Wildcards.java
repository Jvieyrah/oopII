package exe6;

import java.util.Arrays;
import java.util.List;

public class Wildcards<T> {

  public void imprimirNumeros(List<? extends Number> lista){
    if (lista == null || lista.isEmpty()) {
      throw new IllegalArgumentException("A lista não pode ser nula ou vazia.");
    }
    for (Number numero : lista) {
      System.out.println(numero);
    }

  }

  public static void main(String[] args) {
    // Instancia a classe Wildcards
    Wildcards util = new Wildcards();

    // Cria e testa com uma lista de Integers
    List<Integer> numerosInteiros = Arrays.asList(1, 2, 3, 4, 5);
    System.out.println("Imprimindo lista de Integers:");
    util.imprimirNumeros(numerosInteiros);

    System.out.println("\n-------------------------");

    // Cria e testa com uma lista de Doubles
    List<Double> numerosDecimais = Arrays.asList(1.1, 2.2, 3.3, 4.4);
    System.out.println("Imprimindo lista de Doubles:");
    util.imprimirNumeros(numerosDecimais);

    System.out.println("\n-------------------------");

    // Cria e testa com uma lista de Longs
    List<Long> numerosLongs = Arrays.asList(100L, 200L, 300L);
    System.out.println("Imprimindo lista de Longs:");
    util.imprimirNumeros(numerosLongs);
    System.out.println("\n-------------------------");

    // Cria e testa com uma lista de Floats
    List<Float> numerosFloats = Arrays.asList(1.1f, 2.2f, 3.3f);
    System.out.println("Imprimindo lista de Floats:");
    util.imprimirNumeros(numerosFloats);
    System.out.println("\n-------------------------");
  }


}
