package exe8_desafio_final_uml;

public abstract class MemoryEntity {
  private int id;
  private String nome;

  public MemoryEntity(String nome) {
    this.id = this.generateId(); // Gera o ID único ao criar o cliente
    this.nome = nome;
  }

  private int generateId() {
    return (int) (Math.random() * 9000);
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public abstract  String toString();

}
