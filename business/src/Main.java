import cadastros.Client;
import cadastros.Item;
import cadastros.Vendedor;
import processos.Venda;
import processos.VendaItens;

import java.util.Objects;
import java.util.Scanner;

class Main{
    public static void displayVenda(Venda vendadados, VendaItens itensdados, Item selecionado){
        System.out.println("Cliente: " + vendadados.getComprador().toString());
        System.out.println("Vendedor: " + vendadados.getFuncionario().toString());
        System.out.println("Item comprado: " + itensdados.getVendaitem().toString());
        System.out.println("Valor unitário: " + selecionado.getPreco());
        System.out.println("Quantidade comprada: " + itensdados.getQuantity());
        System.out.println("Valor total: " + itensdados.getTotal());

    }

    public static void main(String[] args) {
        Vendedor vendedorPadrao = new Vendedor("Vendedor01");

        System.out.println("Deseja realizar uma venda? S/N");
        Scanner resposta = new Scanner(System.in);
        String resposta1 = resposta.nextLine();

        if ("S".equals(resposta1)){
            Item[] itens_disponiveis = Item.criarItens();
            int cont = 0;
            while (true){
                Client defcliente = Client.definirCliente();

                Venda processoVenda = new Venda(cont+1, defcliente, vendedorPadrao);

                Item escolhido = Item.mostrarItens(itens_disponiveis);
                double qtd = Item.calcularItem();
                double valor_item = Objects.requireNonNull(escolhido).getPreco()*qtd;
                VendaItens v_item = new VendaItens(cont+1, cont+1, escolhido, valor_item, qtd);

                displayVenda(processoVenda, v_item, escolhido);
                cont++;

                System.out.println("Deseja realizar outra venda? S/N");
                Scanner continuar = new Scanner(System.in);
                String continuar1 = continuar.nextLine();
                if (continuar1.equals("N")) {
                    break;
                }
            }

        }
        System.out.println("Você decidiu sair!");
    }
}
