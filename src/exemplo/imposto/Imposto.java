package exemplo.imposto;

public interface Imposto extends Dedutivel  {

    static Double BASE_CALCULO = 10D;

    void calcular();

    default void imprimir() {
        System.out.println("Imposto");
        calcular();
    }

    default void imprimir2() {
        System.out.println("Imposto");
    }

}
