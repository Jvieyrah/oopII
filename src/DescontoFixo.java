// Implementação para desconto fixo
public class DescontoFixo implements EstrategiaDesconto {
  private double valorFixo;

  public DescontoFixo(double valorFixo) {
    this.valorFixo = valorFixo;
  }

  @Override
  public double calcularDesconto(double valorTotal) {
    return valorFixo;
  }
}
