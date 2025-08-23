package exe4;

import java.util.List;

public class GenericsUtils {

  public static <T extends Comparable<T>> T max(List<T> lista) {
    if (lista == null || lista.isEmpty()) {
      throw new IllegalArgumentException("A lista não pode ser nula ou vazia.");
    }

    T max = lista.get(0);
    for (T item : lista) {
      if (item.compareTo(max) > 0) {
        max = item;
      }
    }
    return max;
  }

    public static void main(String[] args) {
      String[] stringArray = {"Hello", "World", "Generics"};
      List<String> stringList = List.of(stringArray);
      String maxString = max(stringList);
      System.out.println("Max String (com a ultima letra do alfabeto): " + maxString);
      Integer[] integerArray = {1, 2, 3, 4, 5};
      List<Integer> integerList = List.of(integerArray);
      Integer maxInteger = max(integerList);
      System.out.println("Max Integer: " + maxInteger);
      Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
      List<Double> doubleList = List.of(doubleArray);
      Double maxDouble = max(doubleList);
      System.out.println("Max Double: " + maxDouble);
    }




}
