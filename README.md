# 📘 Lista de Exercícios Desafios – Interfaces em Java

Este material contém apenas os **enunciados dos exercícios** para prática.  

---

### **1. Criando uma Interface Simples**
Crie uma interface `Animal` com os métodos `emitirSom()` e `mover()`.  
Depois, implemente-a nas classes `Cachorro` e `Gato`.  
No programa principal, crie objetos das duas classes e invoque seus métodos.  

---

### **2. Interface com Constantes**
Crie uma interface `OperacoesMatematicas` que define constantes para `PI` e `E`,  
além dos métodos `somar`, `subtrair`, `multiplicar` e `dividir`.  
Implemente essa interface na classe `Calculadora`.  

---

### **3. Interface com `default` e `static`**
Crie uma interface `Pagamento` com o método `processarPagamento(double valor)`.  
- Adicione um método `default gerarRecibo(double valor)` que imprime um recibo.  
- Adicione um método `static validarValor(double valor)` que verifica se o valor é positivo.  
Implemente em `CartaoCredito` e `Pix`.  

---

### **4. Polimorfismo com Interfaces**
Implemente um sistema de gerenciamento de arquivos com uma interface `Armazenamento` que define os métodos `salvar(String dado)` e `ler()`.  
Crie implementações para:  
- `BancoDeDados` (simula armazenamento em BD)  
- `ArquivoTexto` (simula gravação em arquivo de texto)  

No programa principal, crie uma lista de `Armazenamento` e demonstre polimorfismo.  

---

### **5. Sistema de Notificações**
Desenvolva um sistema de notificações com os seguintes requisitos:  
1. Crie uma interface `Notificacao` com o método `enviar(String mensagem)`.  
2. Implemente pelo menos três classes que representem canais de notificação:  
   - `EmailNotificacao`  
   - `SmsNotificacao`  
   - `PushNotificacao`  
3. Crie uma classe `GerenciadorDeNotificacoes` que receba uma lista de notificadores (injeção de dependência) e tenha um método `notificarTodos(String mensagem)`.  
4. No programa principal (`main`), permita que o usuário escolha quais canais de notificação deseja utilizar.  
5. O sistema deve permitir expansão futura (exemplo: adicionar `WhatsAppNotificacao` sem modificar o código existente).  

---

✍️ Resolva os desafios implementando as classes e interfaces solicitadas.  
