package exemplo.imposto;

import java.util.Comparator;

public class ICMS implements Imposto, Comparable<ICMS> {

    public Double taxa;
    public Double percentual;
    public ICMS(Double taxa){
        this.taxa = taxa;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    public Double getPercentual() {
        return percentual;
    }

    public void setPercentual(Double percentual) {
        this.percentual = percentual;
    }

    @Override
    public void calcular(){
        System.out.println("CALCULANDO ICMS");
    }

    @Override
    public int compareTo(ICMS o) {

       /* if(this.taxa < o.taxa
                && this.percentual < o.percentual) {

            return -1;
        }

        if(this.taxa > o.taxa
                && this.percentual > o.percentual) {

            return 1;

            return 0;*/
        Comparator<ICMS> comp = Comparator.comparing(ICMS::getTaxa)
                .thenComparing(ICMS::getPercentual);

        return comp.compare(this, o);

    }
}
