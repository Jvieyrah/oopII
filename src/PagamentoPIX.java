// Implementação para pagamento com PIX
public class PagamentoPIX implements MetodoPagamento {
  private String chavePIX;

  public PagamentoPIX(String chavePIX) {
    this.chavePIX = chavePIX;
  }

  @Override
  public void pagar(double valor) {
    System.out.println("Pagando R$" + valor + " com PIX para a chave: " + chavePIX);
    // Lógica de integração com gateway de pagamento PIX
  }
}
