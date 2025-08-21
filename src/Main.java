import implementacoes.GerenciadorDeNotificacoes;
import java.util.List;
import java.util.Scanner;
import notificacao.Interfaces.INotificacao;
import notificacao.metodos.Firebase;
import notificacao.metodos.Pop3;
import notificacao.metodos.SMSGateway;
import notificacao.EmailNotificacao;
import notificacao.PushNotificacao;
import notificacao.SmsNotificacao;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

  public static void main(String[] args) {
    Firebase toAndroid = new Firebase(
        "AIzaSyD-EXAMPLE-API-KEY",
        "apharsek-id",
        "1234567890",
        "1:1234567890:web:example-app-id",
        "apharsek-id.firebaseapp.com",
        "https://apharsek-id.firebaseio.com",
        "apharsek-id.appspot.com",
        "1234567890",
        "path/to/serviceAccountKey.json"
    );

    Pop3 Gmail = new Pop3(
        "pop.gmail.com",
        995,
    "marketing@apharsek.id",
    "encrypted_password(useSSL=true)",
    true,
    "subcscriptions@apharsek.io",
    "clientList@JDBC.oracle.com"
    );

    SMSGateway smsGateway = new SMSGateway(
        "https://api.movistar.es",
        "your_api_key",
        "1234567890",
        "SMS Service",
        "8080"
    );

    Scanner scanner = new Scanner(System.in);
    int opcao;
    List<INotificacao> notificadores = null;

    do {
      // Exibindo o menu
      System.out.println("\n===== Menu de Notificações =====");
      System.out.println("1. Enviar notificação por Push");
      System.out.println("2. Enviar notificação por E-mail");
      System.out.println("3. Enviar notificação por SMS");
      System.out.println("4. Enviar notificação todos os canais");
      System.out.println("5. Sair");
      System.out.print("Escolha uma opção: ");

      // Lendo a opção do usuário
      opcao = scanner.nextInt();
      scanner.nextLine(); // Consumir a nova linha

      switch (opcao) {
        case 1:
          notificadores = List.of(
              new PushNotificacao()
          );
          break;
        case 2:
          notificadores = List.of(
              new EmailNotificacao()
          );
          break;
        case 3:
          notificadores = List.of(
              new SmsNotificacao()
          );
          break;
        case 4:
          notificadores = List.of(
              new PushNotificacao(),
              new EmailNotificacao(),
              new SmsNotificacao()
          );
          break;
        case 5:
          notificadores = null;
          System.out.println("Saindo do programa...");
          break;
        default:
          System.out.println("Opção inválida. Tente novamente.");
          break;
      }

      if (notificadores != null) {
        System.out.print("Digite a mensagem que deseja enviar: ");
        String mensagem = scanner.nextLine();

        GerenciadorDeNotificacoes gerenciador = new GerenciadorDeNotificacoes(
            notificadores,
            toAndroid,
            Gmail,
            smsGateway
        );
        gerenciador.notificarTodos(mensagem);
      }

    } while (opcao != 5);
    scanner.close();
    }
  }