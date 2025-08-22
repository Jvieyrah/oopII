import exemplo.conversor.Conversor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Object variavel = "AAAA";

        //convertForInteger(variavel);
        //convertForBoolean(variavel);

        Conversor<Boolean> booleanConversor = new Conversor<>(true);
        //booleanConversor.convertGeneric();

        Conversor<Integer> integerConversor = new Conversor<>(100);
        //integerConversor.convertGeneric();

        List<Integer> numerosInteiros = List.of(1,2,3,4,5);
        List<Number> numeros = List.of(1,2,3,4,5);

        integerConversor.imprimeListaWildCardGenerico(numeros);
        integerConversor.imprimeListaWildCardGenerico(numerosInteiros);

        integerConversor.imprimeListaWildCardSuper(numeros);
        //integerConversor.imprimeListaWildCardSuper(numerosInteiros); NAO ACEITA O PARAMENTRO

        integerConversor.imprimeListaWildCardExtends(numerosInteiros);
        integerConversor.imprimeListaWildCardExtends(numeros);


//        E - Element (usado exclusivamente pelo Java Collections Framework)
//        K - Key
//        N - Number
//        T - Type
//        V - Value
//        S,U,V etc. - 2nd, 3rd, 4th types


    }



     public static void convertForInteger(Object param) {
         Integer num = (Integer) param;
         System.out.printf("Parametro eh %d", num);
     }

    public static void convertForBoolean(Object param) {
        Boolean num = (Boolean) param;
        System.out.printf("Parametro eh %b", num);
    }

}