package implementacoes;
import notificacao.EmailNotificacao;
import notificacao.Interfaces.INotificacao;

import java.util.List;
import notificacao.PushNotificacao;
import notificacao.SmsNotificacao;
import notificacao.metodos.Firebase;
import notificacao.metodos.Pop3;
import notificacao.metodos.SMSGateway;

public class GerenciadorDeNotificacoes {

  private final Firebase firebase;
  private final Pop3 pop3;
  private final SMSGateway smsGateway;
  private final List<INotificacao> notificadores;


  // Injeção de dependência: o Gerenciador recebe a lista de Notificadores
  public GerenciadorDeNotificacoes(List<INotificacao> notificadores,
      Firebase firebase,
      Pop3 pop3,
      SMSGateway smsGateway) {
    this.notificadores = notificadores;
    this.firebase = firebase;
    this.pop3 = pop3;
    this.smsGateway = smsGateway;
  }

  public void notificarTodos(String mensagem) {
    System.out.println("--- Iniciando processo de notificação ---");
    // Percorre a lista e chama o método enviar de cada notificador passado o metodo
    for (INotificacao notificador : notificadores) {
      if (notificador instanceof EmailNotificacao) {
        System.out.println("Enviando notificação por Email...");
        String travel = "de: " + pop3.getFromAddress() + " para: " + pop3.getToAddress();
        System.out.println(travel);
        System.out.println("Mensagem: " + mensagem);
        notificador.enviar(travel + "\n" + mensagem);
      } else if (notificador instanceof PushNotificacao) {
        System.out.println("Enviando notificação por Push...");
        String travel = "De: " + firebase.getSenderId() + " Via: " + firebase.getAppId();
        System.out.println(travel);
        System.out.println("Mensagem: " + mensagem);
        notificador.enviar(travel + "\n" + mensagem);
      } else if (notificador instanceof SmsNotificacao) {
        System.out.println("Enviando notificação por SMS...");
        String travel = "De: " + smsGateway.getSenderId()+ " Para: " + smsGateway.getServiceName();
        System.out.println(travel);
        System.out.println("Mensagem: " + mensagem);
        notificador.enviar(travel + "\n" + mensagem);
      } else {
        System.out.println("Tipo de notificação não mapeada.");
      }
    }
  }
}