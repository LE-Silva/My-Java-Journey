package cadastros;

public class Vendedor {
    final String nome;
    public Vendedor(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
