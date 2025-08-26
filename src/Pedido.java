import java.util.ArrayList;
import java.util.List;

public class Pedido {
  private List<Item> itens;
  private double valorTotal;
  private double valorDesconto;

  public Pedido() {
    this.itens = new ArrayList<>();
    this.valorTotal = 0.0;
    this.valorDesconto = 0.0;
  }

  // Método que calcula o valor total do pedido com base nos itens
  public void adicionarItem(Item item) {
    this.itens.add(item);
    this.valorTotal += item.getPrecoTotal();
  }

  // Aplica a estratégia de desconto (OCP)
  public void aplicarDesconto(EstrategiaDesconto desconto) {
    this.valorDesconto = desconto.calcularDesconto(this.valorTotal);
    this.valorTotal -= this.valorDesconto;
    if (this.valorTotal < 0) {
      this.valorTotal = 0;
    }
  }

  // Processa o pagamento usando o método escolhido (OCP)
  public void processarPagamento(MetodoPagamento pagamento) {
    pagamento.pagar(this.valorTotal);
  }

  public double getValorTotal() {
    return valorTotal;
  }

  public double getValorDesconto() {
    return valorDesconto;
  }
}