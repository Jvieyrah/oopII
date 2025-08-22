package exemplo.conversor;

import java.util.List;

public class Conversor<T> {

    private T t;

    public Conversor(T t) {
        this.t = t;
    }

    public void convertGeneric() {
        System.out.println("Parametro eh " + t);
    }

    public void imprimeLista(List<T> lista) {
        lista.forEach(System.out::println);
    }

    public void imprimeListaWildCardGenerico(List<?> lista) {
        lista.forEach(System.out::println);
    }

    public void imprimeListaWildCardSuper(List<? super Number> lista) {
        lista.forEach(System.out::println);
    }

    public void imprimeListaWildCardExtends(List<? extends Number> lista) {
        lista.forEach(System.out::println);
    }

}
