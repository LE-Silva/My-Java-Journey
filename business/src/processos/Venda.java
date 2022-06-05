package processos;

import cadastros.Client;
import cadastros.Vendedor;
public class Venda {
    long cdvenda;
    Client comprador;
    Vendedor funcionario;
    public Venda(long cdvenda, Client comprador, Vendedor funcionario) {
        this.cdvenda = cdvenda;
        this.comprador = comprador;
        this.funcionario = funcionario;
    }

    public Venda() {
    }

    public Client getComprador() {
        return comprador;
    }

    public Vendedor getFuncionario() {
        return funcionario;
    }


}
