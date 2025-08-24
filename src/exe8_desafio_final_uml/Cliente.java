package exe8_desafio_final_uml;

public class Cliente extends MemoryEntity {
  private String email;

  public Cliente(String nome,  String email) {
    super(nome);
    this.email = email;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    if (email == null || !email.matches(emailRegex)) {
      throw new IllegalArgumentException("Email inválido");
    }
    this.email = email;
  }

@Override
    public String toString() {
    return "Cliente{" +
           "id=" + getId() +
           ", nome='" + getNome() + '\'' +
           ", email='" + email + '\'' +
           '}';
  }
}
