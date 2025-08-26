// Implementação para pagamento com cartão
public class PagamentoCartao implements MetodoPagamento {
  private String numeroCartao;

  public PagamentoCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  @Override
  public void pagar(double valor) {
    System.out.println("Pagando R$" + valor + " com cartão **** " + numeroCartao.substring(numeroCartao.length() - 4));
    // Lógica de integração com gateway de pagamento de cartão
  }
}
