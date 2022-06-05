package cadastros;

import java.util.Scanner;

public class Client {
    final String nome;

    public Client(String nome) {
        this.nome = nome;
    }

    public static Client definirCliente(){
        System.out.println("Insira o nome do cliente: ");
        Scanner new_client = new Scanner(System.in);
        String compradornome = new_client.nextLine();
        return new Client(compradornome);
    }

    @Override
    public String toString() {
        return nome;
    }
}
