import exemplo.imposto.ICMS;
import exemplo.imposto.IOF;
import exemplo.imposto.Imposto;
import exemplo.imposto.ImpostoRecord;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Perecivel produto = new Produto();
        //processar(produto);

        //ICMS, IOF

        Imposto IOF = new IOF(1.5D);
        Imposto ICMS = new ICMS(2.7D);

        //new IVA(27D);

        //calcular(IOF);
        calcular(ICMS);
        //calcular(IVA);

        ImpostoRecord iva = new ImpostoRecord("2", "IVA");
        //iva.taxa();


    }

    public static void calcular(Imposto imposto) {
        imposto.imprimir();
    }
}