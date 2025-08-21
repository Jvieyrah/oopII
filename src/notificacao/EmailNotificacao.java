package notificacao;
import notificacao.Interfaces.INotificacao;

public class EmailNotificacao implements INotificacao{

  @Override
  public void enviar(String mensagem) {
    String to = mensagem.substring(mensagem.indexOf("para: ") + 6, mensagem.indexOf("\n"))
        .trim();
    String body = mensagem.substring(mensagem.indexOf("\n") + 1).trim();
    enviarEmail(to, body);
  }
  public void enviarEmail(String destinatario, String corpo) {
    // Lógica para enviar o e-mail
    System.out.println("Enviado e-mail para: " + destinatario);
    System.out.println("Assunto: " + "Apharsek note");
    System.out.println("Corpo: " + corpo);
  }
}
