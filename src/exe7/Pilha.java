package exe7;

import exe5.Par;
import java.util.Arrays;
import java.util.List;

public class Pilha<E> {
    public E[] elementos;
    private int topo;

    public Pilha(int tamanho) {
        this.elementos = (E[]) new Object[tamanho];
        this.topo = -1;
    }

    public void push(E elemento) {
        if (topo == elementos.length - 1) {
            throw new RuntimeException("Pilha cheia");
        }
        elementos[++topo] = elemento;
    }

    public E pop() {
        if (topo == -1) {
            throw new RuntimeException("Pilha vazia");
        }
        return (E) elementos[topo--];
    }

    public E peek(){
        if (topo == -1) {
            throw new RuntimeException("Pilha vazia");
        }
        return elementos[topo];
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public int size() {
        return topo + 1;
    }

    public static void main(String[] args) {

        List<Integer> numerosInteiros = Arrays.asList(1, 2, 3, 4, 5);
        Pilha<Integer> pilhaInt = new Pilha<>(numerosInteiros.size());
        System.out.println("Pilha de inteiros está vazia? " + pilhaInt.isEmpty());

        for (Integer nro : numerosInteiros) {
            pilhaInt.push(nro);
            System.out.println("Adicionando " + nro + " na pilha.");
        }
        System.out.println("Elemento no topo da pilha: " + pilhaInt.peek());

        while (!pilhaInt.isEmpty()) {
            System.out.println("Removendo " + pilhaInt.pop() + " da pilha.");
        }
        System.out.println("Pilha de inteiros está vazia? " + pilhaInt.isEmpty());

        System.out.println("\n----------------------------------\n");

        String[] stringArray = {"Hello", "World", "Generics"};
        Pilha<String> pilhaStr = new Pilha<>(stringArray.length);
        System.out.println("Pilha de strings está vazia? " + pilhaStr.isEmpty());

        for (String str : stringArray) {
            pilhaStr.push(str);
            System.out.println("Adicionando \"" + str + "\" na pilha.");
        }
        System.out.println("Elemento no topo da pilha: " + pilhaStr.peek());

        while (!pilhaStr.isEmpty()) {
            System.out.println("Removendo \"" + pilhaStr.pop() + "\" da pilha.");
        }
        System.out.println("Pilha de strings está vazia? " + pilhaStr.isEmpty());
    }
}