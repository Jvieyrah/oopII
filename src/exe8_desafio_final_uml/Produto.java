package exe8_desafio_final_uml;

public class Produto extends MemoryEntity {
    private Double preco;

    public Produto(String nome, Double preco) {
        super(nome);
        this.preco = preco;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + getId() +
                ", nome='" + getNome() + '\'' +
                ", preco=" + preco +
                '}';
    }
}
