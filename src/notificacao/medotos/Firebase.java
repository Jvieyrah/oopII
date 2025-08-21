package notificacao.metodos;

public class Firebase {
  // metodos do Firebase para enviar notificações
  private String apiKey;
  private String projectId;
  private String senderId;
  private String appId;
  private String authDomain;
  private String databaseURL;
  private String storageBucket;
  private String messagingSenderId;
  private String serviceAccountKey;

  public Firebase(String apiKey, String projectId, String senderId, String appId, String authDomain, String databaseURL, String storageBucket, String messagingSenderId, String serviceAccountKey) {
    this.apiKey = apiKey;
    this.projectId = projectId;
    this.senderId = senderId;
    this.appId = appId;
    this.authDomain = authDomain;
    this.databaseURL = databaseURL;
    this.storageBucket = storageBucket;
    this.messagingSenderId = messagingSenderId;
    this.serviceAccountKey = serviceAccountKey;
  }

  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public String getSenderId() {
    return senderId;
  }

  public void setSenderId(String senderId) {
    this.senderId = senderId;
  }

  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public String getAuthDomain() {
    return authDomain;
  }

  public void setAuthDomain(String authDomain) {
    this.authDomain = authDomain;
  }

  public String getDatabaseURL() {
    return databaseURL;
  }

  public void setDatabaseURL(String databaseURL) {
    this.databaseURL = databaseURL;
  }

  public String getStorageBucket() {
    return storageBucket;
  }

  public void setStorageBucket(String storageBucket) {
    this.storageBucket = storageBucket;
  }

  public String getMessagingSenderId() {
    return messagingSenderId;
  }

  public void setMessagingSenderId(String messagingSenderId) {
    this.messagingSenderId = messagingSenderId;
  }

  public String getServiceAccountKey() {
    return serviceAccountKey;
  }

  public void setServiceAccountKey(String serviceAccountKey) {
    this.serviceAccountKey = serviceAccountKey;
  }
}