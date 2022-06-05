package cadastros;

import java.util.Scanner;

public class Item {
    final String name;
    final double preco;

    public Item(String name, double preco) {
        this.name = name;
        this.preco = preco;
    }

    public String getName() {
        return name;
    }

    public double getPreco() {
        return preco;
    }

    public static Item[] criarItens(){
        Item chocolate = new Item("Chocolate", 6.50);
        Item refrigerante = new Item("Coca-Cola", 8.10);
        return new Item[]{chocolate,refrigerante};
    }

    public static Item mostrarItens(Item[] itensdisponiveis){
        System.out.println(itensdisponiveis[0].getName() + ": 1");
        System.out.println(itensdisponiveis[1].getName() + ": 2");

        System.out.println("Qual item deseja inserir? ");
        Scanner select_item = new Scanner(System.in);
        String a_escolher = select_item.nextLine();
        if (a_escolher.equals("1")){
            return itensdisponiveis[0];
        }
        else if (a_escolher.equals("2")){
            return itensdisponiveis[1];
        }
        else{
            System.out.println("Item inválido");
            return null;
        }
    }

    @Override
    public String toString() {
        return name;
    }

    public static double calcularItem(){
        System.out.println("Qual a quantidade que deseja comprar?: ");
        Scanner qtd_item = new Scanner(System.in);

        return qtd_item.nextInt();

    }
}
