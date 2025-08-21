package notificacao.metodos;

public class SMSGateway {
  // atributos de configuração do gateway SMS
  private String apiUrl;
  private String apiKey;
  private String senderId;
  private String serviceName;
  private String servicePort;

  public SMSGateway(String apiUrl, String apiKey, String senderId, String serviceName,
    String servicePort) {
    this.apiUrl = apiUrl;
    this.apiKey = apiKey;
    this.senderId = senderId;
    this.serviceName = serviceName;
    this.servicePort = servicePort;
  }


  public String getApiUrl() {
    return apiUrl;
  }

  public void setApiUrl(String apiUrl) {
    this.apiUrl = apiUrl;
  }

  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public String getSenderId() {
    return senderId;
  }

  public void setSenderId(String senderId) {
    this.senderId = senderId;
  }

  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public String getServicePort() {
    return servicePort;
  }

  public void setServicePort(String servicePort) {
    this.servicePort = servicePort;
  }
}
