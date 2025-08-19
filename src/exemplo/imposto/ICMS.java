package exemplo.imposto;

public class ICMS implements Imposto {

    public Double taxa;
    public ICMS(Double taxa){
        this.taxa = taxa;
    }

    @Override
    public void calcular(){
        System.out.println("CALCULANDO ICMS");
    }

}
