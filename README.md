# Exercícios sobre SRP (Single Responsibility Principle) e OCP (Open Closed Principle)

## Exercício 1 - SRP Básico

Crie uma classe `Relatorio` que atualmente possui métodos para: - Gerar
dados de relatório - Exportar em PDF - Enviar por e-mail

**Tarefa:** Refatore a classe para que siga o princípio da
responsabilidade única (SRP).

------------------------------------------------------------------------

## Exercício 2 - SRP em um Sistema de Biblioteca

Uma classe `Livro` contém informações do livro, regras de validação e
regras de persistência no banco de dados.

**Tarefa:** Separe as responsabilidades em classes distintas aplicando
SRP.

------------------------------------------------------------------------

## Exercício 3 - OCP Básico

Implemente uma classe `CalculadoraDesconto` que calcula descontos para
diferentes tipos de clientes (padrão, VIP, estudante).

**Tarefa:** Refatore a implementação para seguir o princípio
aberto/fechado (OCP), permitindo adicionar novos tipos de clientes sem
modificar código existente.

------------------------------------------------------------------------

## Exercício 4 - OCP em Relatórios

Um sistema gera relatórios em `PDF` e `CSV`. Atualmente, a lógica de
exportação está toda em um único método com vários `if/else`.

**Tarefa:** Refatore o código para aplicar OCP, permitindo adicionar
novos formatos sem alterar a classe principal.

------------------------------------------------------------------------

## Exercício 5 - Desafio Final

Você foi contratado para desenvolver um **sistema de pedidos online**.\
O sistema deve permitir: - Cálculo do valor total do pedido - Diferentes
estratégias de desconto (ex: desconto percentual, desconto fixo, cupom
promocional) - Diferentes métodos de pagamento (ex: cartão, PIX, PayPal)

### Requisitos:

1.  Aplique **SRP** para garantir que cada classe tenha uma única
    responsabilidade.
2.  Aplique **OCP** para que seja fácil adicionar novos descontos e
    métodos de pagamento sem modificar o código existente.

**Entrega esperada:**\
- Diagrama de classes UML mostrando a separação de responsabilidades.\
- Implementação em Java seguindo os princípios **SRP** e **OCP**.
