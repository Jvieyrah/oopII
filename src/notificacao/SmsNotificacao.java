package notificacao;

import notificacao.Interfaces.INotificacao;

public class SmsNotificacao implements INotificacao {


  @Override
  public void enviar(String mensagem) {
    String destinatario = mensagem.substring(mensagem.indexOf("para: ") + 6, mensagem.indexOf("\n"))
        .trim();
    String corpo = mensagem.substring(mensagem.indexOf("\n") + 1).trim();
    enviarSms(destinatario, corpo);

  }
  public void enviarSms(String destinatario, String corpo) {
    // Lógica para enviar o SMS
    System.out.println("Enviando SMS para: " + destinatario);
    System.out.println("Corpo: " + corpo);
  }

}
