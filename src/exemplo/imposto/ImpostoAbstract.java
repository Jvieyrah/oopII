package exemplo.imposto;

public abstract class ImpostoAbstract {

    public abstract void calcular();

    public void imprimir(){
        System.out.println("Imprimir");
        calcular();
    }
}
