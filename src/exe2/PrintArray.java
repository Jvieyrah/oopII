package exe2;

public class PrintArray<E>{

  public void printArray(E[] array) {
    for (E element : array) {
      System.out.print(element + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    PrintArray<String> stringPrinter = new PrintArray<>();
    String[] stringArray = {"Hello", "World", "Generics"};
    stringPrinter.printArray(stringArray);

    PrintArray<Integer> integerPrinter = new PrintArray<>();
    Integer[] integerArray = {1, 2, 3, 4, 5};
    integerPrinter.printArray(integerArray);
  }

}
