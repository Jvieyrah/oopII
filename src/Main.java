
public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.adicionarItem(new Item("Notebook", 3500.00, 1));
        pedido.adicionarItem(new Item("Mouse Gamer", 150.00, 2));

        // Aplica um desconto de 10%
        pedido.aplicarDesconto(new DescontoPercentual(10.0));
        System.out.println("Valor total com desconto: R$" + pedido.getValorTotal());
        System.out.println("Valor do desconto: R$" + pedido.getValorDesconto());

        // Processa o pagamento com PIX
        pedido.processarPagamento(new PagamentoPIX("minhachave@email.com"));

        System.out.println("-------------------------");

        // Novo pedido com outro tipo de desconto e pagamento
        Pedido segundoPedido = new Pedido();
        segundoPedido.adicionarItem(new Item("Teclado Mecânico", 500.00, 1));
        segundoPedido.adicionarItem(new Item("Headset", 300.00, 1));

        // Aplica um desconto fixo de R$ 50,00
        segundoPedido.aplicarDesconto(new DescontoFixo(50.00));
        System.out.println("Valor total com desconto: R$" + segundoPedido.getValorTotal());
        System.out.println("Valor do desconto: R$" + segundoPedido.getValorDesconto());

        // Processa o pagamento com Cartão
        segundoPedido.processarPagamento(new PagamentoCartao("1234567890123456"));
    }
}