package br.com.alura.comex;

public class Main2 {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.nome = "Harry Potter";
        livro.isbn = "12345-1234-12345";

        System.out.println(livro.identificar());

        Cliente cliente = new Cliente();
        cliente.cpf = "123456789";
        cliente.nome = "Nome";
        System.out.println(cliente.identificar());

    }
}
