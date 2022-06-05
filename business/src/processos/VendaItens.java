package processos;

import cadastros.Item;

public class VendaItens extends Venda {
    final int cdvitem;
    final Item vendaitem;
    final double total;
    final double quantity;

    public VendaItens(long cdvenda, int cdvitem, Item vendaitem, double total, double quantity) {
        super();
        this.cdvitem = cdvitem;
        this.vendaitem = vendaitem;
        this.total = total;
        this.quantity = quantity;
    }

    public Item getVendaitem() {
        return vendaitem;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getTotal() {
        return total;
    }


    @Override
    public String toString() {
        return "" + vendaitem;
    }


}
