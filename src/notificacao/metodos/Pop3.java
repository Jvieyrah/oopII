package notificacao.metodos;

public class Pop3 {
  // Metodos para enviar notificações via POP3
  private String server;
  private int port;
  private String username;
  private String password;
  private boolean useSSL;
  private String fromAddress;
  private String toAddress;

  public Pop3(String server, int port, String username, String password, boolean useSSL, String fromAddress, String toAddress) {
    this.server = server;
    this.port = port;
    this.username = username;
    this.password = password;
    this.useSSL = useSSL;
    this.fromAddress = fromAddress;
    this.toAddress = toAddress;
  }

  public String getServer() {
    return server;
  }

  public void setServer(String server) {
    this.server = server;
  }

  public int getPort() {
    return port;
  }

  public void setPort(int port) {
    this.port = port;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public boolean isUseSSL() {
    return useSSL;
  }

  public void setUseSSL(boolean useSSL) {
    this.useSSL = useSSL;
  }


  public String getFromAddress() {
    return fromAddress;
  }

  public void setFromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
  }

  public String getToAddress() {
    return toAddress;
  }

  public void setToAddress(String toAddress) {
    this.toAddress = toAddress;
  }
}
