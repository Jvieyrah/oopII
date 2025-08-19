package exemplo.imposto;

public class IOF implements Imposto {

    public Double taxa;
    public IOF(Double taxa){
        this.taxa = taxa;
    }

    @Override
    public void calcular(){}

}
