package br.com.alura.comex;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Radio";


        Livro livro = new Livro();
        livro.isbn = "12345-12345";
        livro.totalPaginas = 300;
        livro.nome = "Senhor dos Aneis";

        Eletronico eletronico = new Eletronico();
        eletronico.nome = "celular";

        System.out.println(produto.nome);
        System.out.println(livro.nome);
        System.out.println(eletronico.nome);
    }
}
