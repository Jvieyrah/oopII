package notificacao;

import notificacao.Interfaces.INotificacao;

public class PushNotificacao implements INotificacao {


  @Override
  public void enviar(String mensagem) {
    String via = mensagem.substring(mensagem.indexOf("Via: ") + 6, mensagem.indexOf("\n"))
        .trim();
    String corpo = mensagem.substring(mensagem.indexOf("\n") + 1).trim();
    enviarPush(via, corpo);
  }
public void enviarPush(String destinatario, String corpo) {
    // Lógica para enviar a notificação push
    System.out.println("Enviado notificação push para: " + destinatario);
    System.out.println("Corpo: " + corpo);
  }

}