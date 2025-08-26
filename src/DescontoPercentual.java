// Implementação para desconto percentual
public class DescontoPercentual implements EstrategiaDesconto {
  private double percentual;

  public DescontoPercentual(double percentual) {
    this.percentual = percentual;
  }

  @Override
  public double calcularDesconto(double valorTotal) {
    return valorTotal * (percentual / 100);
  }
}
